import Header from "../../../Header/Header";
import {ErrorMessage, Field, Form, Formik} from "formik";
import Footer from "../../../Footer/Footer";
import React, {useEffect, useState} from "react";
import {useNavigate, useParams} from "react-router-dom";
import * as villaService from "../../../../ServiceOfCode/VillaService";
import {editVilla} from "../../../../ServiceOfCode/VillaService";
import {toast} from "react-toastify";

function EditVilla() {

    const {villaId} = useParams();
    const [villaEdit, setVillaEdit] = useState();
    const navigate = useNavigate();

    useEffect(() => {
        getDataDetail();
    }, [])
    const getDataDetail = async () => {
        const res = await villaService.getDataDetail(villaId);
        console.log("ji")
        setVillaEdit(res);
    }
    const handleSubmit = async (villaEdit) => {
        await villaService.editVilla(villaEdit);
        console.log("ko");
        toast.success("Sửa thành công!!");
        navigate("/villa")

    }
    if (!villaEdit) {
        return <>Không có gì</>;
    } else {
        return (
            <>
                <Header/>
                <div>
                    <div>
                        <img src="https://wikiland.vn/wp-content/uploads/Furama-Phu-Quoc.jpg"
                             height="500px" width="100%"/>
                    </div>
                </div>

                <div className="container-fluid product py-5">
                    <div className="container py-5">

                        <div className="container mt-4">
                            <h1>Chỉnh sửa Villa</h1>
                            <Formik
                                onSubmit={handleSubmit}
                                // validationSchema={validation}
                                initialValues={villaEdit}
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
                                        <label htmlFor="rentalCosts" className="col-sm-2 col-form-label">Chi phí
                                            thuê</label>
                                        <div className="col-sm-10">
                                            <Field type="text" className="form-control" id="rentalCosts"
                                                   name="rentalCosts"/>
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
                                        <label htmlFor="maxPeople" className="col-sm-2 col-form-label">Số người tối
                                            đa</label>
                                        <div className="col-sm-10">
                                            <Field type="number" name="maxPeople" className="form-control"
                                                   id="maxPeople"/>
                                            <ErrorMessage name="maxPeople"/>

                                        </div>
                                    </div>

                                    <div className="row mb-3">
                                        <label htmlFor="roomStandards" className="col-sm-2 col-form-label">Chất lượng
                                            phòng (bao nhiêu sao)</label>
                                        <div className="col-sm-10">
                                            <Field type="number" className="form-control" id="roomStandards"
                                                   name="roomStandards"/>
                                            <ErrorMessage name="roomStandards"/>

                                        </div>
                                    </div>

                                    <div className="row mb-3">
                                        <label htmlFor="poolArea" className="col-sm-2 col-form-label">Diện tích hồ
                                            bơi</label>
                                        <div className="col-sm-10">
                                            <Field type="text" className="form-control" id="poolArea" name="poolArea"/>
                                            <ErrorMessage name="poolArea"/>
                                        </div>
                                    </div>

                                    <div className="row mb-3">
                                        <label htmlFor="numberFloor" className="col-sm-2 col-form-label">Số tầng</label>
                                        <div className="col-sm-10">
                                            <Field type="number" className="form-control" id="numberFloor"
                                                   name="numberFloor"/>
                                            <ErrorMessage name="numberFloor"/>
                                        </div>
                                    </div>

                                    <div className="row mb-3">
                                        <label htmlFor="otherAmenities" className="col-sm-2 col-form-label">Dịch vụ miễn
                                            phí đi kèm</label>
                                        <div className="col-sm-10">
                                            <Field type="text" className="form-control" id="otherAmenities"
                                                   name="otherAmenities"/>
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
}

export default EditVilla;