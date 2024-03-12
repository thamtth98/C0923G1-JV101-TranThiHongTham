import "./Header.css";
import KeyboardArrowDownIcon from '@mui/icons-material/KeyboardArrowDown';

import {Link} from "react-router-dom";
import React from "react"
function Header(){
    const styleHeader = {
        top:'0',
        positon:'sticky',
    }
    return(
        <>
            <div className="container-fluid bg-white sticky-top" style={styleHeader}>
                <div className="container">
                    <nav className="navbar navbar-expand-lg bg-white navbar-light py-2 py-lg-0">
                        <Link to={"/"} className="navbar-brand">
                            <img className="img-fluid img-logo" src="img/logo.png" alt="Logo" />
                        </Link>
                        <button type="button" className="navbar-toggler ms-auto me-0" data-bs-toggle="collapse"
                                data-bs-target="#navbarCollapse">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarCollapse">
                            <div className="navbar-nav ms-auto">
                                <Link to={"/"} className="nav-item nav-link">Trang chủ</Link>
                                <Link to={"/"} className="nav-item nav-link">Giới thiệu</Link>
                                <div className="nav-item dropdown">
                                    <a href="#" className="nav-link "
                                       data-bs-toggle="dropdown">Dịch vụ <KeyboardArrowDownIcon/></a>
                                    <div className="dropdown-menu bg-light rounded-0 m-0">
                                        <Link to={"/villa"} className="dropdown-item">Villa</Link>
                                        <Link to={"/"} className="dropdown-item">House</Link>
                                        <a href="testimonial.html" className="dropdown-item">Room</a>
                                        <a href="testimonial.html" className="dropdown-item">Extra</a>
                                    </div>
                                </div>
                                <Link to={"/"} href="store.html" className="nav-item nav-link">Ẩm thực</Link>
                                {/*<Link to={"/service"}>hihi</Link>*/}
                                <div className="nav-item dropdown">
                                    <a href="#" className="nav-link "
                                       data-bs-toggle="dropdown">Quản lý Resort <KeyboardArrowDownIcon/></a>
                                    <div className="dropdown-menu bg-light rounded-0 m-0">
                                        <Link to={"/employee"} className="dropdown-item">Nhân viên</Link>
                                        <Link to={"/customer"} className="dropdown-item">Khách hàng</Link>
                                        <Link to={"/contract"} className="dropdown-item">Hợp đồng thuê</Link>
                                    </div>
                                </div>
                                <a href="" className="nav-item nav-link">Liên hệ</a>
                            </div>
                            <div className="border-start ps-4 d-none d-lg-block">
                                <button type="button" className="btn btn-sm p-0"><i className="fa fa-search"></i>
                                </button>
                            </div>
                        </div>
                    </nav>
                </div>
            </div>
        </>
    )
}
export default Header;