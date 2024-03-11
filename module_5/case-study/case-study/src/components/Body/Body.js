import "./Body.css";
import {Carousel} from "react-bootstrap";
import React from "react";
import {LinkTwoTone} from "@mui/icons-material";
import {Link} from "react-router-dom";

function Body() {
    const imageStyle = {
        width: '100%',
        height: '700px',
        padding: '28px'
    };

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
                    {/*<div className="owl-carousel product-carousel wow fadeInUp" data-wow-delay="0.5s">*/}
                    {/*    <a href="" className="d-block product-item rounded">*/}
                    <Carousel>
                        <Carousel.Item>
                            <img
                                className="d-block w-100"
                                src="https://furamavietnam.com/wp-content/uploads/2023/11/Ariyana-Garden-tiec-cuoi-da-nang-3.jpg"
                                alt="First slide"
                                style={imageStyle}

                            />
                        </Carousel.Item>
                        <Carousel.Item>
                            <img
                                className="d-block w-100"
                                src="https://furamavietnam.com/wp-content/uploads/2023/11/Untitled-design-3-768x512.jpg"
                                alt="Second slide"
                                style={imageStyle}

                            />
                        </Carousel.Item>
                        <Carousel.Item>
                            <img
                                className="d-block w-100"
                                src="https://furamavietnam.com/wp-content/uploads/2023/11/Furama-International-Convention-Palace-tiec-cuoi-da-nang-5.jpg"
                                alt="Third slide"
                                style={imageStyle}

                            />
                        </Carousel.Item>
                        <Carousel.Item>
                            <img
                                className="d-block w-100"
                                src="https://furamavietnam.com/wp-content/uploads/2023/10/Furama_Resort-in-Danang-7-768x512.jpg"
                                alt="Fourth slide"
                                style={imageStyle}
                            />
                        </Carousel.Item>
                    </Carousel>
                    <div className="bg-white shadow-sm text-center p-4 position-relative mt-n5 mx-4">

                        <Link className="d-block product-item rounded">
                            <img
                                src="https://furamavietnam.com/wp-content/uploads/2023/11/Untitled-design-3-768x512.jpg"
                                alt=""/>
                            <div className="bg-white shadow-sm text-center p-4 position-relative mt-n5 mx-4">
                                <h4 className="text-primary">Ẩm thực</h4>
                                <span className="text-body">Ẩm thực tại Furama Resort Đà Nẵng kết hợp một cách độc đáo giữa các món ăn truyền thống của Việt Nam và đa dạng hương vị ẩm thực từ Châu Á, Ý, và châu Âu.
                                    Nhà hàng chính, Café Indochine, là điểm đến nổi tiếng với tiệc Buffet Chợ Hải Sản và những bữa trưa đậm chất Việt. Don Cipriani’s, với tinh túy ẩm thực Ý, cũng là lựa chọn không thể bỏ qua khi đến Furama Resort Đà Nẵng. Ngoài ra, Hải Vân Lounge là điểm đến tuyệt vời cho những thực khách yêu thích tiệc trà chiều, cocktails và các loại đồ uống đa dạng khác…
                                </span>
                            </div>
                        </Link>
                        <a href="" className="d-block product-item rounded">
                            <img
                                src="https://furamavietnam.com/wp-content/uploads/2023/11/Ariyana-Garden-tiec-cuoi-da-nang-3.jpg"
                                alt="" width="65%"/>
                            <div className="bg-white shadow-sm text-center p-4 position-relative mt-n5 mx-4">
                                <h4 className="text-primary">Tiệc cưới</h4>
                                <span className="text-body">Với không gian bãi cỏ rộng rãi, hướng nhìn ra biển hay không gian bãi biển tuyệt đẹp thẳng tầm mắt hướng chân trời,… tạo nên khung cảnh tuyệt đẹp cho một lễ cưới đáng nhớ tại Quần thể du lịch Furama – Ariyana Đà Nẵng. Cô dâu chú rể có thể tùy thích lên ý tưởng với tông màu chủ đạo, hoa trang trí, sân khấu chính,… để ghi lại những dấu ấn cá nhân của từng cặp đôi.
                                    Sau phần lễ cưới thơ mộng, tiệc tối thân mật trong không gian hội trường ấm cúng, sang trọng sẽ là điểm nhấn ấn tượng cho tất cả khách mời tham dự. Hãy viết nên câu chuyện tình yêu vĩnh cửu của bạn với khởi đầu hoàn hảo tại đây.</span>
                            </div>
                        </a>
                        <Link to={"/"} href="" className="d-block product-item rounded">
                            <img src="https://furamavietnam.com/wp-content/uploads/2023/12/4.jpg" alt="" width="65%" height="500px"/>
                            <div className="bg-white shadow-sm text-center p-4 position-relative mt-n5 mx-4">
                                <h4 className="text-primary">Spa</h4>
                                <span className="text-body">Tọa lạc tại khu vườn nhiệt đới tuyệt đẹp hướng biển của “Ốc đảo xanh” Furama Resort Đà Nẵng, được văn hóa Chăm Pa thổi hồn trong từng nét kiến trúc. Hãy đến với V-senses Wellness & Spa để cùng đắm chìm vào khung cảnh bình yên, lắng nghe tiếng sóng vỗ về tâm hồn, cảm nhận sự thanh mát của thiên nhiên hòa vào từng nhịp thở, và hành trình tìm về sự tĩnh tại và khôi phục năng lượng sống chỉ mới bắt đầu…</span>
                            </div>
                        </Link>
                    </div>
                </div>
            </div>


            {/*Villa*/}
            <div className="container-xxl py-5">
                <div className="container">
                    <div className="section-title text-center mx-auto wow fadeInUp" data-wow-delay="0.1s"
                         style={{maxWidth: '500px'}}>
                        <h1 className="display-6">Lưu trú</h1>
                    </div>
                    <div className="row g-4">
                        <div className="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.1s">
                            <div className="store-item position-relative text-center">
                                <img className="img-fluid item-villa" src="https://furamavillasdanang.com/wp-content/uploads/2018/03/Three-Bedroom-Beachfront-5-1536x739.jpeg" alt=""/>
                                <div className="p-4">

                                    <h4 className="mb-3">Biệt thự 3 phòng ngủ</h4>
                                    <p>Biệt thự hồ bơi 3 phòng ngủ hướng vườn được trang bị nội thất sang trọng.</p>
                                    <h4 className="text-primary">Room Size: 330m<sup>2</sup></h4>
                                </div>
                                <div className="store-overlay">
                                    <a href="" className="btn btn-success rounded-pill py-2 px-4 m-2">Book Now <i
                                        className="fa fa-arrow-right ms-2"></i></a>
                                    <a href="" className="btn btn-dark rounded-pill py-2 px-4 m-2">More Detail<i
                                        className="fa fa-cart-plus ms-2"></i></a>
                                </div>
                            </div>
                        </div>
                        <div className="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.3s">
                            <div className="store-item position-relative text-center">
                                <img className="img-fluid item-villa" src="https://furamavietnam.com/wp-content/uploads/2018/08/Vietnam_Danang_Furama_Villas_Pool_Villas-F-370x239.jpg" alt=""/>
                                <div className="p-4">

                                    <h4 className="mb-3">Biệt thự 4 phòng ngủ</h4>
                                    <p>Biệt thự hồ bơi 3 phòng ngủ hướng vườn được trang bị nội thất sang trọng.</p>
                                    <h4 className="text-primary">Room Size: 850m<sup>2</sup></h4>
                                </div>
                                <div className="store-overlay">
                                    <a href="" className="btn btn-success rounded-pill py-2 px-4 m-2">Book Now <i
                                        className="fa fa-arrow-right ms-2"></i></a>
                                    <a href="" className="btn btn-dark rounded-pill py-2 px-4 m-2">More Detail<i
                                        className="fa fa-cart-plus ms-2"></i></a>
                                </div>
                            </div>
                        </div>
                        <div className="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.5s">
                            <div className="store-item position-relative text-center">
                                <img className="img-fluid item-villa" src="https://furamavillasdanang.com/wp-content/uploads/2018/03/Furama-Three-Bedroom-Pool-Villa-02.jpg" alt=""/>
                                <div className="p-4">

                                    <h4 className="mb-3">Biệt thự 3 phòng ngủ</h4>
                                    <p>Biệt thự hồ bơi 3 phòng ngủ hướng vườn được trang bị nội thất sang trọng.</p>
                                    <h4 className="text-primary">Room Size: 330m<sup>2</sup></h4>
                                </div>
                                <div className="store-overlay">
                                    <a href="" className="btn btn-success rounded-pill py-2 px-4 m-2">Book Now <i
                                        className="fa fa-arrow-right ms-2"></i></a>
                                    <a href="" className="btn btn-dark rounded-pill py-2 px-4 m-2">More Detail<i
                                        className="fa fa-cart-plus ms-2"></i></a>
                                </div>
                            </div>
                        </div>
                        <div className="col-12 text-center wow fadeInUp" data-wow-delay="0.1s">
                            <Link to={"/villa"} className="btn btn-success rounded-pill py-3 px-5">Xem thêm</Link>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )

}


export default Body;
