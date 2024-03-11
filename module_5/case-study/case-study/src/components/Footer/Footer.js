import "./Footer.css";
import FacebookIcon from '@mui/icons-material/Facebook';
import InstagramIcon from '@mui/icons-material/Instagram';
import YouTubeIcon from '@mui/icons-material/YouTube';
import PhoneEnabledIcon from '@mui/icons-material/PhoneEnabled';

function Footer(){

    return (
        <>
            <div className="container-fluid bg-dark footer mt-5 py-5 wow fadeIn" data-wow-delay="0.1s">
                <div className="container py-5">
                    <div className="row g-5">
                        <div className="col-lg-5 col-md-6">
                            <h4 className="text-success mb-4">Liên hệ</h4>
                            <p className="mb-2"><i className="fa fa-map-marker-alt text-primary me-3"></i>105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son District, Danang City, Vietnam.  </p>
                            <p className="mb-2"><i className="fa fa-phone-alt text-primary me-3"></i>Tel.: 84-236-3847 333/888 Fax: 84-236-3847 666</p>
                            <p className="mb-2"><i className="fa fa-envelope text-primary me-3"></i>Email: reservation@furamavietnam.com</p>
                            <div className="d-flex pt-3">
                                <a className="btn btn-square btn-success rounded-circle me-2" href=""><FacebookIcon/></a>
                                <a className="btn btn-square btn-success rounded-circle me-2" href=""><InstagramIcon/></a>
                                <a className="btn btn-square btn-success rounded-circle me-2" href=""><YouTubeIcon/></a>
                                <a className="btn btn-square btn-success rounded-circle me-2" href=""><PhoneEnabledIcon/></a>
                            </div>
                        </div>
                        <div className="col-lg-2 col-md-6">
                            <h4 className="text-success mb-4">Liên kết nhanh</h4>
                            <a className="btn btn-link" href="">Ẩm thực</a>
                            <a className="btn btn-link" href="">Spa</a>
                            <a className="btn btn-link" href="">Lưu trú</a>
                            <a className="btn btn-link" href="">Tiệc cưới</a>
                            <a className="btn btn-link" href="">Ưu đãi</a>
                        </div>
                        {/*<div className="col-lg-3 col-md-6">*/}
                        {/*    <h4 className="text-primary mb-4">Business Hours</h4>*/}
                        {/*    <p className="mb-1">Monday - Friday</p>*/}
                        {/*    <h6 className="text-light">09:00 am - 07:00 pm</h6>*/}
                        {/*    <p className="mb-1">Saturday</p>*/}
                        {/*    <h6 className="text-light">09:00 am - 12:00 pm</h6>*/}
                        {/*    <p className="mb-1">Sunday</p>*/}
                        {/*    <h6 className="text-light">Closed</h6>*/}
                        {/*</div>*/}
                        <div className="col-lg-3 col-md-6">
                            <h4 className="text-success mb-4">Các trang dịch vụ khác</h4>
                            <img src="https://furamavillasdanang.com/wp-content/uploads/2023/11/our-sister-1.svg" height="150px"/>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )
}
export default Footer;