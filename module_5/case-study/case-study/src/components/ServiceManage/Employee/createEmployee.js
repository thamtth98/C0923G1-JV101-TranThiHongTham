import Header from "../../Header/Header";
import {ErrorMessage, Field, Form, Formik} from "formik";
import {useState} from 'react';
import Button from 'react-bootstrap/Button';
import Col from 'react-bootstrap/Col';
// import Form from 'react-bootstrap/Form';
import Row from 'react-bootstrap/Row';
import * as Yup from "yup";
import * as employeeService from "../../../ServiceOfCode/EmployeeService"
import {toast} from "react-toastify";
import {useNavigate} from "react-router-dom";


function CreateEmployee() {
    const [employee, setEmployee] = useState({});
    const navigate = useNavigate();


    const initValue = {
        "name": "",
        "birthday": "",
        "idCard": "",
        "phoneNumber": "",
        "email": "",
        "level": "",
        "position": "",
        "parts": "",
        "salary": ""
    }
    const handleSubmit = async (employee) => {
        await employeeService.addEmployee(employee);
        toast.success("Thêm thành công!!");
        navigate("/employee");
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
        level: Yup.string().required("Trường này không được để trống"),
        position: Yup.string().required("Trường này không được để trống"),
        parts: Yup.string().required("Trường này không được để trống"),
        salary: Yup.string().required("Trường này không được để trống")
    })
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
                            initialValues={initValue}
                        >

                            <Form>
                                <div className="row mb-3">
                                    <label htmlFor="name" className="col-sm-2 col-form-label">Tên</label>
                                    <div className="col-sm-10">
                                        <Field type="text" className="form-control" id="name" name="name"/>
                                        <ErrorMessage name="name"/>

                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="birthday" className="col-sm-2 col-form-label">Ngày sinh</label>
                                    <div className="col-sm-10">
                                        <Field type="date" className="form-control" id="birthday" name="birthday"/>
                                        <ErrorMessage name="birthday"/>

                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="idCard" className="col-sm-2 col-form-label">Số CMND</label>
                                    <div className="col-sm-10">
                                        <Field type="text" className="form-control" id="idCard" name="idCard"/>
                                        <ErrorMessage name="idCard"/>

                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="phoneNumber" className="col-sm-2 col-form-label">Số điện thoại</label>
                                    <div className="col-sm-10">
                                        <Field type="text" name="phoneNumber" className="form-control"
                                               id="phoneNumber"/>
                                        <ErrorMessage name="phoneNumber"/>

                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="email" className="col-sm-2 col-form-label">Email</label>
                                    <div className="col-sm-10">
                                        <Field type="text" className="form-control" id="email" name="email"/>
                                        <ErrorMessage name="email"/>

                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="level" className="col-sm-2 col-form-label">Trình độ</label>
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
                                    <label htmlFor="position" className="col-sm-2 col-form-label">Chức vụ</label>
                                    <div className="col-sm-10">
                                        <Field type="text" as="select" className="form-control" id="position"
                                               name="position">
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
                                    <label htmlFor="parts" className="col-sm-2 col-form-label">Bộ phận</label>
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
                                    <label htmlFor="salary" className="col-sm-2 col-form-label">Lương</label>
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

export default CreateEmployee;