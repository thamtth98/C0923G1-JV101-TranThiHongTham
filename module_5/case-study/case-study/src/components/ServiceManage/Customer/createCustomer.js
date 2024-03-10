import {ErrorMessage, Field, Form, Formik} from "formik";
import * as Yup from "yup";
import {useState} from "react";
import {addCustomer} from "../../../ServiceOfCode/CustomerService"
import {toast} from "react-toastify";
import {useNavigate} from "react-router-dom";
import Header from "../../Header/Header";

function CreateCustomer() {
    const [customer, setCustomer] = useState([]);
    const navigate = useNavigate();
    const initValue = {
        "name": "",
        "birthday": "2024-03-09",
        "gender": "Nữ",
        "idCard": "",
        "phoneNumber": "",
        "email": "",
        "type": "Member",
        "address": "DN",
    }
    const validation = Yup.object({
        name: Yup.string()
            .required("Trường này không được để trống")
            .matches(/^[a-zA-Z\s]*$/, 'Tên khách hàng không được chứa số')
            .test(
                'capitalize',
                'Các kí tự đầu tiên của mỗi từ phải viết hoa',
                value => {
                    const words = value.split(' ');
                    return words.every(word => word[0] === word[0].toUpperCase());
                },
            ),
        birthday: Yup.string().required("Trường này không được để trống"),
        gender: Yup.string().required("Trường này không được để trống"),
        idCard: Yup.string()
            .matches(/^\d{9}$|^\d{12}$/, 'Số CMND là 9 hoặc 12 số')
            .required("Trường này không được để trống"),
        phoneNumber: Yup.string()
            .required("Trường này không được để trống")
            .matches(
                /^(090|091|\(84\)\+90|\(84\)\+91)\d{7}$/,
                'Số điện thoại phải đúng định dạng'
            ),
        email: Yup.string()
            .email('Địa chỉ email phải đúng định dạng')
            .required("Trường này không được để trống"),
        address: Yup.string().required("Trường này không được để trống"),
    })
    const handleSubmit = async (customer) => {
        try {
            const isSuccess = addCustomer(customer);
            if (isSuccess) {
                toast.success("Thêm thành công!!")
                navigate("/customer");
            } else {
                toast("Lỗi")
            }
        } catch (e) {
            console.log(e)
        }
    }

    return (
        <>
            <Header/>
            <div className="container-fluid product py-5">
                <div className="container py-5">

                    <div className="container mt-4">
                        <h1>Thêm mới khách hàng</h1>
                        <Formik onSubmit={handleSubmit}
                                validationSchema={validation}
                                initialValues={initValue}
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
                </div>
            </div>
        </>
    )
}

export default CreateCustomer;