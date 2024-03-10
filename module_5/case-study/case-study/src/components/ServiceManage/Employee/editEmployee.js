import {useNavigate, useParams} from "react-router-dom";
import {useEffect, useState} from "react";
import {ErrorMessage, Field, Form, Formik} from "formik";
import * as Yup from "yup";
import * as employeeService from "../../../ServiceOfCode/EmployeeService"
import Header from "../../Header/Header";
import {toast} from "react-toastify";


function EditEmployee() {
    const {employeeId} = useParams();
    const [employee, setEmployee] = useState();
    const navigate = useNavigate();
    const validation = Yup.object({
        name: Yup.string().required("Trường này không được để trống"),
        birthday: Yup.string().required("Trường này không được để trống"),
        idCard: Yup.string().required("Trường này không được để trống"),
        phoneNumber: Yup.string().required("Trường này không được để trống"),
        email: Yup.string().required("Trường này không được để trống"),
        level: Yup.string().required("Trường này không được để trống"),
        position: Yup.string().required("Trường này không được để trống"),
        parts: Yup.string().required("Trường này không được để trống"),
        salary: Yup.string().required("Trường này không được để trống")
    })
    useEffect(()=>{
        getData();
    },[])
    const  getData = async ()=>{
        try {
           const employee = await employeeService.getDataEdit(employeeId);
           setEmployee(employee);
        }catch (e){
            console.log(e)
        }
    }
    const handleSubmit = async (employee) =>{
        try {
            await employeeService.submitEdit(employee);
            navigate("/employee");
            toast.success("Sửa thành công")
        }catch (e){
            console.log(e)
        }
    }

    if (!employee) {
        return null
    } else {
        return (
            <>
                <Header/>
                <div className="container-fluid product py-5">
                    <div className="container py-5">

                        <div className="container mt-4">
                            <h1>Thêm mới nhân viên</h1>
                            <Formik
                                onSubmit={handleSubmit}
                                validationSchema={validation}
                                initialValues={employee}
                            >
                                <Form>
                                    <div className="row mb-3">
                                        <label htmlFor="name" className="col-sm-2 col-form-label">name</label>
                                        <div className="col-sm-10">
                                            <Field type="text" className="form-control" id="name" name="name"/>
                                            <ErrorMessage name="name"/>

                                        </div>
                                    </div>

                                    <div className="row mb-3">
                                        <label htmlFor="birthday" className="col-sm-2 col-form-label">birthday</label>
                                        <div className="col-sm-10">
                                            <Field type="date" className="form-control" id="birthday" name="birthday"/>
                                            <ErrorMessage name="birthday"/>

                                        </div>
                                    </div>

                                    <div className="row mb-3">
                                        <label htmlFor="idCard" className="col-sm-2 col-form-label">idCard</label>
                                        <div className="col-sm-10">
                                            <Field type="text" className="form-control" id="idCard" name="idCard"/>
                                            <ErrorMessage name="idCard"/>

                                        </div>
                                    </div>

                                    <div className="row mb-3">
                                        <label htmlFor="phoneNumber" className="col-sm-2 col-form-label">phoneNumber</label>
                                        <div className="col-sm-10">
                                            <Field type="text" name="phoneNumber" className="form-control" id="phoneNumber"/>
                                            <ErrorMessage name="phoneNumber"/>

                                        </div>
                                    </div>

                                    <div className="row mb-3">
                                        <label htmlFor="email" className="col-sm-2 col-form-label">email</label>
                                        <div className="col-sm-10">
                                            <Field type="text" className="form-control" id="email" name="email"/>
                                            <ErrorMessage name="email"/>

                                        </div>
                                    </div>

                                    <div className="row mb-3">
                                        <label htmlFor="level" className="col-sm-2 col-form-label">level</label>
                                        <div className="col-sm-10">
                                            <Field type="text" as="select" className="form-control" id="level" name="level">
                                                <option value="Intermediate">Trung cấp</option>
                                                <option value="College">Cao đẳng</option>
                                                <option value="University">Đại học</option>
                                                <option value="Postgraduate">Sau Đại học</option>
                                            </Field>
                                            <ErrorMessage name="level"/>

                                        </div>
                                    </div>

                                    <div className="row mb-3">
                                        <label htmlFor="position" className="col-sm-2 col-form-label">position</label>
                                        <div className="col-sm-10">
                                            <Field type="text" as="select" className="form-control" id="position" name="position">
                                                <option value="Receptionist">Lễ tân</option>
                                                <option value="Server">Phục vụ</option>
                                                <option value="specialist">Chuyên viên</option>
                                                <option value="supervisor">Giám sát</option>
                                                <option value="manager">Quản lý</option>
                                                <option value="director">Giám đốc</option>
                                            </Field>
                                            <ErrorMessage name="position"/>

                                        </div>
                                    </div>

                                    <div className="row mb-3">
                                        <label htmlFor="parts" className="col-sm-2 col-form-label">parts</label>
                                        <div className="col-sm-10">
                                            <Field type="text" as="select" className="form-control" id="parts" name="parts">
                                                <option value="Sales – Marketing">Sales – Marketing</option>
                                                <option value="Office">Văn phòng</option>
                                                <option value="Villa">Phục vụ</option>
                                                <option value="Management">Giám đốc</option>
                                            </Field>
                                            <ErrorMessage name="parts"/>
                                        </div>
                                    </div>

                                    <div className="row mb-3">
                                        <label htmlFor="salary" className="col-sm-2 col-form-label">salary</label>
                                        <div className="col-sm-10">
                                            <Field type="text" className="form-control" id="salary" name="salary"/>
                                            <ErrorMessage name="salary"/>

                                        </div>
                                    </div>
                                    <button type="submit" className="btn btn-success">Submit</button>

                                </Form>
                            </Formik>
                        </div>
                    </div>
                </div>


            </>
        )
    }

}

export default EditEmployee;