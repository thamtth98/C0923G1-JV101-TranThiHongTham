import "./Body.css";
import {Carousel} from "react-bootstrap";
import React from "react";

function Body() {

    return (
        <>
            {/*carosel*/}
            <div className="container-fluid px-0 mb-5">
                <div id="header-carousel" className="carousel slide carousel-fade" data-bs-ride="carousel">
                    <div className="carousel-inner">
                        <div className="carousel-item active">
                            <img className="w-100" src="img/carosel-2.jpg" alt="Image"/>
                            <div className="carousel-caption">
                                <div className="container">
                                    <div className="row justify-content-center">
                                        <div className="col-lg-9 text-center">
                                            <p className="fs-4 text-white animated zoomIn">Welcome to <strong
                                                className="text-dark">FURAMA ĐÀ NẴNG</strong></p>
                                            <h1 className="display-1 text-dark mb-4 animated zoomIn">KHU NGHỈ DƯỠNG ẨM
                                                THỰC
                                            </h1>
                                            <h1 className="display-1 text-dark mb-4 animated zoomIn">TỌA LẠC TRÊN MỘT
                                                TRONG 6 BÃI BIỂN ĐẸP NHẤT THẾ GIỚI
                                            </h1>
                                            {/* <a href=""*/}
                                            {/*className="btn btn-light rounded-pill py-3 px-5 animated zoomIn">Xem thêm</a>*/}
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="carousel-item">
                            <img className="w-100" src="img/carousel-1.jpg" alt="Image"/>
                            <div className="carousel-caption">
                                <div className="container">
                                    <div className="row justify-content-center">
                                        <div className="col-lg-7 text-center">
                                            <p className="fs-4 text-white animated zoomIn">Welcome to <strong
                                                className="text-dark">TEA House</strong></p>
                                            <h1 className="display-1 text-dark mb-4 animated zoomIn">Organic &
                                                Quality Tea Production</h1>
                                            <a href=""
                                               className="btn btn-light rounded-pill py-3 px-5 animated zoomIn">Explore
                                                More</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <button className="carousel-control-prev" type="button" data-bs-target="#header-carousel"
                            data-bs-slide="prev">
                        <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span className="visually-hidden">Previous</span>
                    </button>
                    <button className="carousel-control-next" type="button" data-bs-target="#header-carousel"
                            data-bs-slide="next">
                        <span className="carousel-control-next-icon" aria-hidden="true"></span>
                        <span className="visually-hidden">Next</span>
                    </button>
                </div>
            </div>

            {/*body*/}
            <div className="container-xxl py-5 ">
                <div className="container">
                    <div className="row g-5">
                        <div className="col-lg-12 wow fadeIn m-5" data-wow-delay="0.5s">
                            <div className="section-title">
                                <p className="fs-5 fw-medium fst-italic text-primary">Giới thiệu</p>
                                <h1 className="display-6">KHU NGHỈ DƯỠNG FURAMA ĐÀ NẴNG</h1>
                            </div>
                            <div className="row g-3 mb-4">
                                <div className="col-sm-6">
                                    <img className="img-fluid bg-white w-100"
                                         src="https://furamavietnam.com/wp-content/uploads/2018/08/06-2.jpg" alt=""/>
                                </div>
                                <div className="col-sm-6">
                                    <h5>KHU NGHỈ DƯỠNG ĐẲNG CẤP THẾ GIỚI FURAMA ĐÀ NẴNG, TỰ HÀO LÀ KHU NGHỈ DƯỠNG ẨM
                                        THỰC TẠI VIỆT NAM</h5>
                                    <p className="mb-0">
                                        Nằm tại vị trí đắc địa gần trung tâm Đà Nẵng và là nơi kết nối quốc tế thuận
                                        tiện đến Singapore, Bangkok, Xiêm Riệp, Kuala Lumpur, Đài Loan, Tokyo, Osaka,
                                        Busan, Seoul, Tokyo, Osaka và Hồng Kông – Ma Cao, Trung Quốc bao gồm: Bắc Kinh,
                                        Thượng Hải, Hàng Châu, Quảng Châu, Thành Đô bằng các chuyến bay trực tiếp, khu
                                        nghỉ dưỡng Furama Đà Nẵng là điểm đến lý tưởng cho các đại lý du lịch, doanh
                                        nghiệp, công ty tổ chức sự kiện. Cung Hội nghị có thể chứa tới 3000 người, cùng
                                        với 10 phòng chức năng khác có sức chứa từ 50 đến 300 người. Cung hội nghị
                                        Ariyana Convention Centre Đà Nẵng (ACC) được xây dựng để tổ chức sự kiện APEC
                                        2017, kết nối với Cung hội nghị Furama (ICP) tạo thành quần thể MICE lớn nhất
                                        Việt Nam có sức chứa lên tới 5,000 khách.

                                    </p>
                                </div>
                            </div>
                            <div className="border-top mb-4"></div>
                            <div className="row g-3">
                                <div className="col-sm-4">
                                    <p className="mb-0">Hướng ra bãi biển Đà Nẵng trải dài cát trắng, Furama Resort Đà
                                        Nẵng là cửa ngõ đến với 3 di sản văn hoá thế giới: Hội An (20 phút), Mỹ Sơn (90
                                        phút) và Huế (2 tiếng. 196 phòng hạng sang cùng với 70 căn biệt thự từ hai đến
                                        bốn phòng ngủ có hồ bơi riêng đều được trang trí trang nhã, theo phong cách
                                        thiết kế truyền thống của Việt Nam và kiến trúc thuộc địa của Pháp, biến Furama
                                        thành khu nghỉ dưỡng danh giá nhất tại Việt Nam – vinh dự được đón tiếp nhiều
                                        người nổi tiếng, giới hoàng gia, chính khách, ngôi sao điện ảnh và các nhà lãnh
                                        đạo kinh doanh quốc tế.</p>
                                </div>
                                <div className="col-sm-8">
                                    <img className="img-fluid bg-white w-100"
                                         src="https://furamavietnam.com/wp-content/uploads/2018/08/DES-PHONGNHA-1.jpg"
                                         alt=""/>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


            {/*ServiceOfCode carosel*/}
            <div className="container-fluid product py-5 my-5">
                <div className="container py-5">
                    <div className="section-title text-center mx-auto wow fadeInUp" data-wow-delay="0.1s"
                         style={{maxWidth: '500px'}}>
                        <h1 className="display-6">Các loại dịch vụ</h1>
                    </div>
                    <div className="owl-carousel product-carousel wow fadeInUp" data-wow-delay="0.5s">
                        <a href="" className="d-block product-item rounded">
                            <Carousel>
                                <Carousel.Item>
                                    <img
                                        className="d-block w-100"
                                        src="https://furamavietnam.com/wp-content/uploads/2023/10/Furama_Resort-in-Danang-6-768x512.jpg"
                                        alt="First slide"
                                    />
                                </Carousel.Item>
                                <Carousel.Item>
                                    <img
                                        className="d-block w-100"
                                        src="https://furamavietnam.com/wp-content/uploads/2023/11/Untitled-design-3-768x512.jpg"
                                        alt="Second slide"


                                    />
                                </Carousel.Item>
                                <Carousel.Item>
                                    <img
                                        className="d-block w-100"
                                        src="https://furamavietnam.com/wp-content/uploads/2024/02/Image-Culinary-Furama-resort-2-768x512.jpg"
                                        alt="Third slide"
                                    />
                                </Carousel.Item>
                                <Carousel.Item>
                                    <img
                                        className="d-block w-100"
                                        src="https://furamavillasdanang.com/wp-content/uploads/2018/03/Three-Bedroom-Beachfront-5-1536x739.jpeg"
                                        alt="Fourth slide"
                                    />
                                </Carousel.Item>
                            </Carousel>
                            <div className="bg-white shadow-sm text-center p-4 position-relative mt-n5 mx-4">
                                <h4 className="text-primary">Ẩm thực</h4>
                                <span className="text-body">Diam dolor diam ipsum sit diam amet diam et eos. Clita erat ipsum</span>
                            </div>
                        </a>
                        <a href="" className="d-block product-item rounded">
                            <img src="img/service-1.webp" alt=""/>
                            <div className="bg-white shadow-sm text-center p-4 position-relative mt-n5 mx-4">
                                <h4 className="text-primary">Black Tea</h4>
                                <span className="text-body">Diam dolor diam ipsum sit diam amet diam et eos. Clita erat ipsum</span>
                            </div>
                        </a>
                        <a href="" className="d-block product-item rounded">
                            <img src="img/service-3.jpg" alt=""/>
                            <div className="bg-white shadow-sm text-center p-4 position-relative mt-n5 mx-4">
                                <h4 className="text-primary">Spiced Tea</h4>
                                <span className="text-body">Diam dolor diam ipsum sit diam amet diam et eos. Clita erat ipsum</span>
                            </div>
                        </a>
                        <a href="" className="d-block product-item rounded">
                            <img src="img/service-3.jpg" alt=""/>
                            <div className="bg-white shadow-sm text-center p-4 position-relative mt-n5 mx-4">
                                <h4 className="text-primary">Organic Tea</h4>
                                <span className="text-body">Diam dolor diam ipsum sit diam amet diam et eos. Clita erat ipsum</span>
                            </div>
                        </a>
                    </div>
                </div>
            </div>

            <div className="container-fluid px-0 mb-5 ">
                <div id="carouselExampleInterval" className="carousel slide" data-bs-ride="carousel">
                    <div className="carousel-inner">
                        <div className="carousel-item active" data-bs-interval="10000">
                            <img src="img/service-2.webp" className="d-block w-100" alt="..."/>
                        </div>
                        <div className="carousel-item" data-bs-interval="2000">
                            <img src="img/service-2.webp" className="d-block w-100" alt="..."/>
                        </div>
                        <div className="carousel-item">
                            <img src="img/service-1.webp" className="d-block w-100" alt="..."/>
                        </div>
                    </div>
                    <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleInterval"
                            data-bs-slide="prev">
                        <span className="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span className="visually-hidden">Previous</span>
                    </button>
                    <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleInterval"
                            data-bs-slide="next">
                        <span className="carousel-control-next-icon" aria-hidden="true"></span>
                        <span className="visually-hidden">Next</span>
                    </button>
                </div>
            </div>

            {/*Villa*/}
            <div className="container-xxl py-5">
                <div className="container">
                    <div className="section-title text-center mx-auto wow fadeInUp" data-wow-delay="0.1s"
                         style={{maxWidth: '500px'}}>
                        <p className="fs-5 fw-medium fst-italic text-primary">Online Store</p>
                        <h1 className="display-6">Want to stay healthy? Choose tea taste</h1>
                    </div>
                    <div className="row g-4">
                        <div className="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
                            <div className="store-item position-relative text-center">
                                <img className="img-fluid" src="img/store-product-1.jpg" alt=""/>
                                <div className="p-4">
                                    <div className="text-center mb-3">
                                        <small className="fa fa-star text-primary"></small>
                                        <small className="fa fa-star text-primary"></small>
                                        <small className="fa fa-star text-primary"></small>
                                        <small className="fa fa-star text-primary"></small>
                                        <small className="fa fa-star text-primary"></small>
                                    </div>
                                    <h4 className="mb-3">Nature close tea</h4>
                                    <p>Aliqu diam amet diam et eos. Clita erat ipsum lorem erat ipsum lorem sit
                                        sed</p>
                                    <h4 className="text-primary">$19.00</h4>
                                </div>
                                <div className="store-overlay">
                                    <a href="" className="btn btn-primary rounded-pill py-2 px-4 m-2">More Detail <i
                                        className="fa fa-arrow-right ms-2"></i></a>
                                    <a href="" className="btn btn-dark rounded-pill py-2 px-4 m-2">Add to Cart <i
                                        className="fa fa-cart-plus ms-2"></i></a>
                                </div>
                            </div>
                        </div>
                        <div className="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.3s">
                            <div className="store-item position-relative text-center">
                                <img className="img-fluid" src="img/store-product-2.jpg" alt=""/>
                                <div className="p-4">
                                    <div className="text-center mb-3">
                                        <small className="fa fa-star text-primary"></small>
                                        <small className="fa fa-star text-primary"></small>
                                        <small className="fa fa-star text-primary"></small>
                                        <small className="fa fa-star text-primary"></small>
                                        <small className="fa fa-star text-primary"></small>
                                    </div>
                                    <h4 className="mb-3">Green tea tulsi</h4>
                                    <p>Aliqu diam amet diam et eos. Clita erat ipsum lorem erat ipsum lorem sit
                                        sed</p>
                                    <h4 className="text-primary">$19.00</h4>
                                </div>
                                <div className="store-overlay">
                                    <a href="" className="btn btn-primary rounded-pill py-2 px-4 m-2">More Detail <i
                                        className="fa fa-arrow-right ms-2"></i></a>
                                    <a href="" className="btn btn-dark rounded-pill py-2 px-4 m-2">Add to Cart <i
                                        className="fa fa-cart-plus ms-2"></i></a>
                                </div>
                            </div>
                        </div>
                        <div className="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.5s">
                            <div className="store-item position-relative text-center">
                                <img className="img-fluid" src="img/store-product-3.jpg" alt=""/>
                                <div className="p-4">
                                    <div className="text-center mb-3">
                                        <small className="fa fa-star text-primary"></small>
                                        <small className="fa fa-star text-primary"></small>
                                        <small className="fa fa-star text-primary"></small>
                                        <small className="fa fa-star text-primary"></small>
                                        <small className="fa fa-star text-primary"></small>
                                    </div>
                                    <h4 className="mb-3">Instant tea premix</h4>
                                    <p>Aliqu diam amet diam et eos. Clita erat ipsum lorem erat ipsum lorem sit
                                        sed</p>
                                    <h4 className="text-primary">$19.00</h4>
                                </div>
                                <div className="store-overlay">
                                    <a href="" className="btn btn-primary rounded-pill py-2 px-4 m-2">More Detail <i
                                        className="fa fa-arrow-right ms-2"></i></a>
                                    <a href="" className="btn btn-dark rounded-pill py-2 px-4 m-2">Add to Cart <i
                                        className="fa fa-cart-plus ms-2"></i></a>
                                </div>
                            </div>
                        </div>
                        <div className="col-12 text-center wow fadeInUp" data-wow-delay="0.1s">
                            <a href="" className="btn btn-primary rounded-pill py-3 px-5">View More Products</a>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )

}


export default Body;
