import Header from "../../../Header/Header";
import Footer from "../../../Footer/Footer";
import {Link} from "react-router-dom";
import {useEffect, useState} from "react";
import * as villaService from "../../../../ServiceOfCode/VillaService"

function Villa() {
    const [villaList, setVillaList] = useState([]);
    useEffect(
        () => {
            getAllVilla();
        }, []
    )
    const getAllVilla = async () => {
        const villa = await villaService.getAllVilla();
        setVillaList(villa);
    }
    return (
        <>
            <Header/>
            <div>
                <div>
                    <img src="https://wikiland.vn/wp-content/uploads/Furama-Phu-Quoc.jpg"
                         height="500px" width="100%"/>
                </div>
            </div>
            <div className="container-fluid page-header py-5 wow fadeIn" data-wow-delay="0.1s">

                <div className="container text-center py-5">
                    <h1 className="display-2 text-dark mb-4 animated slideInDown">Biệt Thự Biển Furama Đà Nẵng
                        (FURAMA VILLAS DANANG)</h1>
                    <div>Là một phần của Quần thể du lịch Furama-Ariyana Đà Nẵng, Furama Villas Đà Nẵng, chào đón bạn
                        đến với 67 căn biệt thự sang trọng ven biển với hồ bơi riêng. Với tầm nhìn ra hồ bơi hoặc biển,
                        mỗi căn biệt thự hai tầng đi kèm với khu vực sống và ăn uống. Bếp được trang bị đầy đủ với bếp,
                        minibar và lò vi sóng.

                        Furama Villas Đà Nẵng nằm trải dài bên một trong những bãi biển đẹp nhất thế giới. Không chỉ
                        cung cấp đầy đủ tiện nghi & nội thất bên trong từng căn biệt thự, bao quanh Furama Villas Đà
                        Nẵng là vô số các nhà hàng nổi tiếng với ẩm thực truyền thống và quốc tế như: Danaksara, Café
                        Indochine, nhà hàng Ý Don Cipriani, Hai Van Lounge, các quầy bar ngoài trời ven hồ bơi hoặc ven
                        biển. Điều này biến Furama Villas Đà Nẵng trở thành một khu nghỉ dưỡng ẩm thực và di sản độc đáo
                        bên cạnh bãi biển đẹp nhất thế giới.
                    </div>
                </div>
            </div>


            <div className="container-fluid product py-5">
                <div className="container py-5">
                    <div className="container-xxl py-3">
                        <div className="container">
                            <div className="section-title text-center mx-auto wow fadeInUp" data-wow-delay="0.1s"
                                 style={{maxWidth: '500px'}}>
                                <Link className="fs-5 fw-medium fst-italic text-primary">Đặt phòng online</Link>
                            </div>
                            <h1 className="display-6 text-center"><b>BIỆT THỰ HƯỚNG BIỂN</b></h1>
                            <br/>

                            <div className="row g-4">
                                {villaList.map((item) => (
                                    <div className="col-lg-4 col-md-6 wow fadeInUp" data-wow-delay="0.1s" key={item.id}>
                                        <div className="store-item position-relative text-center">
                                            <img className="img-fluid"
                                                 src={item.img}
                                                 alt=""/>
                                            <div className="p-4">
                                                <h4 className="mb-3">{item.name}</h4>
                                                <p>{item.detail}</p>
                                                <h4 className="text-primary">Room Size: {item.area}m<sup>2</sup></h4>
                                            </div>
                                            <div className="store-overlay">
                                                <a href="src/components/ServiceManage/Facility" className="btn btn-success rounded-pill py-2 px-4 m-2">Book
                                                    Now</a>
                                                <Link to={`/villa/detail/${item.id}`} href="src/components/ServiceManage/Facility" className="btn btn-dark rounded-pill py-2 px-4 m-2">More
                                                    Detail <i
                                                        className="fa fa-cart-plus ms-2"></i></Link>
                                            </div>
                                        </div>
                                    </div>
                                ))}

                                <div className="col-12 text-center wow fadeInUp" data-wow-delay="0.1s">
                                    <Link to={"/villa/create"} className="btn btn-primary rounded-pill py-3 px-5">Thêm mới Villa</Link>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )
}

export default Villa;