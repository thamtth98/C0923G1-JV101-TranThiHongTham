import Header from "../../../Header/Header";
import {useEffect, useState} from "react";
import * as villaService from "../../../../ServiceOfCode/VillaService"
import {Link, useParams} from "react-router-dom";
import React from 'react';
import { Carousel } from 'react-bootstrap';
import Footer from "../../../Footer/Footer";
function Detail() {
    const [villaDetail, setVillaDetail] = useState({});
    const {villaId} = useParams();
    const [villaEdit,setVillaEdit] = useState();

    useEffect(() => {
        getDataDetail();
    },[])
    const getDataDetail = async ()=>{
        const res = await villaService.getDataDetail(villaId);
        setVillaDetail(res);
    }

    const imageStyle = {
        width: '100%',
        height: '500px',
    };
    return (
        <>
            <Header/>
            <div>
                <div>
                    <img src="https://wikiland.vn/wp-content/uploads/Furama-Phu-Quoc.jpg"
                         height="500px" width="100%" />
                </div>
            </div>

            <div className="container-xxl py-5">
                <div className="container">
                    <div className="row g-5">
                        <div className="col-lg-6">
                            <div className="row g-3">

                                <Carousel>
                                    <Carousel.Item>
                                        <img
                                            className="d-block w-100"
                                            src={villaDetail.img}
                                            alt="First slide"
                                            style={imageStyle}
                                        />
                                    </Carousel.Item>
                                    <Carousel.Item>
                                        <img
                                            className="d-block w-100"
                                            src="https://furamavillasdanang.com/wp-content/uploads/2018/03/Three-Bedroom-Beachfront-4-1536x739.jpeg"
                                            alt="Second slide"
                                            style={imageStyle}

                                        />
                                    </Carousel.Item>
                                    <Carousel.Item>
                                        <img
                                            className="d-block w-100"
                                            src="https://furamavillasdanang.com/wp-content/uploads/2018/03/Three-Bedroom-Beachfront-7-1536x739.jpeg"
                                            alt="Third slide"
                                            style={imageStyle}
                                        />
                                    </Carousel.Item>
                                    <Carousel.Item>
                                        <img
                                            className="d-block w-100"
                                            src="https://furamavillasdanang.com/wp-content/uploads/2018/03/Three-Bedroom-Beachfront-5-1536x739.jpeg"
                                            alt="Fourth slide"
                                            style={imageStyle}
                                        />
                                    </Carousel.Item>
                                </Carousel>
                            </div>
                        </div>
                        <div className="col-lg-6 wow fadeIn" data-wow-delay="0.5s">
                            <div className="section-title">
                                <Link to={`/villa/edit/${villaDetail.id}`} className="fs-5 fw-medium fst-italic text-primary">Chỉnh sửa villa</Link>
                                <h1 className="display-6"><b>{villaDetail.name}</b></h1>
                            </div>
                            <div className="row g-3 mb-4">

                                <div className="col-sm-8">
                                    <h5>Chi tiết</h5>
                                    <ul>
                                        <li>Diện tích: {villaDetail.area} m<sup>2</sup></li>
                                        <li>Số lượng người: {villaDetail.maxPeople}</li>

                                        <li>Giá thuê: {villaDetail.rentalCosts}/ngày</li>
                                        <li>Diện tích hồ bơi: {villaDetail.poolArea} m<sup>2</sup></li>
                                        <li>Số tầng: {villaDetail.numberFloor}</li>
                                        <li>Dịch vụ khác: {villaDetail.otherAmenities}</li>
                                    </ul>
                                    <p className="mb-0">{villaDetail.detail}</p>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <Footer/>
        </>
    )
}

export default Detail;