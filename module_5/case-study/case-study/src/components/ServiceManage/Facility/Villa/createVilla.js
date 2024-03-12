import Header from "../../../Header/Header";
import React, {useState} from "react";
import Footer from "../../../Footer/Footer";
import {ErrorMessage, Field, Form, Formik} from "formik";
import * as villaService from "../../../../ServiceOfCode/VillaService"
import {useNavigate} from "react-router-dom";
import {toast} from "react-toastify";
import * as Yup from "yup";

function CreateVilla(){

    const [villa,setVilla] = useState({});
    const navigate = useNavigate();

    const initValue = {
            "name": "",
            "area": "",
            "rentalCosts": "",
            "maxPeople": "",
            "type": "",
            "roomStandards": "",
            "poolArea": "",
            "numberFloor": "",
            "otherAmenities": "",
            "img": "",
            "detail": ""
    }
    const handleSubmit = async (villa) =>{
       await villaService.createVilla(villa);
        navigate("/villa");
        toast.success("Thêm thành công!!")
    }
    const validation = Yup.object({
        name: Yup.string()
            .required("Trường này không được để trống")
        .matches(/^[^\d]+$/, "Tên dịch vụ không được chứa số"),
        area: Yup.string().required("Trường này không được để trống"),
        rentalCosts: Yup.string()
            .required("Trường này không được để trống"),
        maxPeople: Yup.string()
            .required("Trường này không được để trống")
        ,
        type: Yup.string()
            .required("Trường này không được để trống"),
        roomStandards: Yup.string().required("Trường này không được để trống"),
        poolArea: Yup.number().integer().positive().required("Diện tích hồ bơi là bắt buộc và phải là số nguyên dương")
            .required("Trường này không được để trống"),
        numberFloor: Yup.number().integer().positive().required("Diện tích hồ bơi là bắt buộc và phải là số nguyên dương"),       otherAmenities: Yup.string().required("Trường này không được để trống"),
        img: Yup.string().required("Trường này không được để trống"),
        detail: Yup.string().required("Trường này không được để trống")
    })
    return(
        <>
            <Header/>
            <div>
                <div>
                    <img src="https://wikiland.vn/wp-content/uploads/Furama-Phu-Quoc.jpg"
                         height="500px" width="100%" />
                </div>
            </div>

            <div className="container-fluid product py-5">
                <div className="container py-5">

                    <div className="container mt-4">
                        <h1>Thêm mới Villa</h1>
                        <Formik
                            onSubmit={handleSubmit}
                            validationSchema={validation}
                            initialValues={initValue}
                        >

                            <Form>
                                <div className="row mb-3">
                                    <label htmlFor="name" className="col-sm-2 col-form-label">Tên Villa</label>
                                    <div className="col-sm-10">
                                        <Field type="text" className="form-control" id="name" name="name"/>
                                        <ErrorMessage name="name"/>
                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="area" className="col-sm-2 col-form-label">Diện tích</label>
                                    <div className="col-sm-10">
                                        <Field type="text" className="form-control" id="area" name="area"/>
                                        <ErrorMessage name="area"/>

                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="rentalCosts" className="col-sm-2 col-form-label">Chi phí thuê</label>
                                    <div className="col-sm-10">
                                        <Field type="text" className="form-control" id="rentalCosts" name="rentalCosts"/>
                                        <ErrorMessage name="rentalCosts"/>

                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="type" className="col-sm-2 col-form-label">Loại thuê</label>
                                    <div className="col-sm-10">
                                        <Field as="select" className="form-control" id="type" name="type">
                                            <option value="Năm">Năm</option>
                                            <option value="Tháng">Tháng</option>
                                            <option value="Ngày">Ngày</option>
                                            <option value="Giờ">Giờ</option>
                                        </Field>
                                        <ErrorMessage name="type"/>

                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="maxPeople" className="col-sm-2 col-form-label">Số người tối đa</label>
                                    <div className="col-sm-10">
                                        <Field type="number" name="maxPeople" className="form-control"
                                               id="maxPeople"/>
                                        <ErrorMessage name="maxPeople"/>

                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="roomStandards" className="col-sm-2 col-form-label">Chất lượng phòng (bao nhiêu sao)</label>
                                    <div className="col-sm-10">
                                        <Field type="number" className="form-control" id="roomStandards" name="roomStandards"/>
                                        <ErrorMessage name="roomStandards"/>

                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="poolArea" className="col-sm-2 col-form-label">Diện tích hồ bơi</label>
                                    <div className="col-sm-10">
                                        <Field type="number" className="form-control" id="poolArea" name="poolArea"/>
                                        <ErrorMessage name="poolArea"/>
                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="numberFloor" className="col-sm-2 col-form-label">Số tầng</label>
                                    <div className="col-sm-10">
                                        <Field type="number" className="form-control" id="numberFloor" name="numberFloor"/>
                                        <ErrorMessage name="numberFloor"/>
                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="otherAmenities" className="col-sm-2 col-form-label">Dịch vụ miễn phí đi kèm</label>
                                    <div className="col-sm-10">
                                        <Field type="text" className="form-control" id="otherAmenities" name="otherAmenities"/>
                                        <ErrorMessage name="otherAmenities"/>
                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="img" className="col-sm-2 col-form-label">Hình ảnh</label>
                                    <div className="col-sm-10">
                                        <Field type="text" className="form-control" id="img" name="img"/>
                                        <ErrorMessage name="img"/>
                                    </div>
                                </div>

                                <div className="row mb-3">
                                    <label htmlFor="detail" className="col-sm-2 col-form-label">Mô tả thêm</label>
                                    <div className="col-sm-10">
                                        <Field type="text" className="form-control" id="detail" name="detail"/>
                                        <ErrorMessage name="detail"/>
                                    </div>
                                </div>

                                <button type="submit" className="btn btn-success">Submit</button>

                            </Form>
                        </Formik>
                    </div>
                </div>
            </div>

            <Footer/>
        </>
    )
}
export default CreateVilla;