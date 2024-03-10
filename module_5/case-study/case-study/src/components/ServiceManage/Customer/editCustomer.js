import {ErrorMessage, Field, Form, Formik} from "formik";
import {useEffect, useState} from "react";
import {useNavigate, useParams} from "react-router-dom";
import * as customerService from "../../../ServiceOfCode/CustomerService"
import * as Yup from "yup";
import {toast} from "react-toastify";

function EditCustomer() {
    const {customerId} = useParams();
    const [customerEdit, setCustomerEdit] = useState();
    const navigate = useNavigate();


    useEffect(() => {
        getDataEdit();
    }, [])

    const getDataEdit = async () => {
        console.log(customerId)
        const customer = await customerService.getDataEdit(customerId);
        setCustomerEdit(customer);
    }
    const validation = Yup.object({
        name: Yup.string().required("Trường này không được để trống"),
        birthday: Yup.string().required("Trường này không được để trống"),
        gender: Yup.string().required("Trường này không được để trống"),
        idCard: Yup.string().required("Trường này không được để trống"),
        phoneNumber: Yup.string().required("Trường này không được để trống"),
        email: Yup.string().required("Trường này không được để trống"),
        address: Yup.string().required("Trường này không được để trống"),
    })
    const handleSubmitEdit = async (customer) => {
        try {
            const check = await customerService.editCustomer(customer);
                navigate("/customer");
                toast.success("Sửa thành công!!")
        } catch (e) {
            console.log(e)
        }
    }

    if (!customerEdit) {
        return null;
    } else {
        return (
            <>
                <div className="container mt-4">
                    <h1>Chỉnh sửa thông tin khách hàng</h1>
                    <Formik onSubmit={handleSubmitEdit}
                            validationSchema={validation}
                            initialValues={customerEdit}
                    >

                        <Form>
                            <div className="mb-3">
                                <label htmlFor="name" className="form-label">Name</label>
                                <Field type="text" className="form-control" id="name" name="name"
                                       placeholder="Nhập tên khách hàng"/>
                                <ErrorMessage name="name"/>
                            </div>
                            <div className="mb-3">
                                <label htmlFor="birthday" className="form-label">Birthday</label>
                                <Field type="date" className="form-control" id="birthday" name="birthday"
                                       placeholder="Nhập ngày sinh"/>
                                <ErrorMessage name="birthday"/>
                            </div>
                            <div className="mb-3">
                                <label htmlFor="gender" className="form-label">Gender</label>
                                <Field type="text" as="select" className="form-control" id="gender" name="gender">
                                    <option value="Nam">Nam</option>
                                    <option value="Nữ">Nữ</option>
                                </Field>
                                <ErrorMessage name="gender"/>
                            </div>
                            <div className="mb-3">
                                <label htmlFor="idCard" className="form-label">Id Card</label>
                                <Field type="text" className="form-control" id="idCard" name="idCard"
                                       placeholder="Nhập số CMND"/>
                                <ErrorMessage name="idCard"/>
                            </div>
                            <div className="mb-3">
                                <label htmlFor="phoneNumber" className="form-label">Phone Number</label>
                                <Field type="text" className="form-control" id="phoneNumber" name="phoneNumber"
                                       placeholder="Nhập số điện thoại"/>
                                <ErrorMessage name="phoneNumber"/>
                            </div>
                            <div className="mb-3">
                                <label htmlFor="email" className="form-label">Email</label>
                                <Field type="text" className="form-control" id="email" name="email"
                                       placeholder="Nhập email"/>
                                <ErrorMessage name="email"/>
                            </div>
                            <div className="mb-3">
                                <label htmlFor="address" className="form-label">Address</label>
                                <Field type="text" className="form-control" id="address" name="address"
                                       placeholder="Nhập địa chỉ"/>
                                <ErrorMessage name="address"/>
                            </div>
                            <button type="submit" className="btn btn-primary">Submit</button>
                        </Form>
                    </Formik>
                </div>
            </>
        )
    }
}

export default EditCustomer;