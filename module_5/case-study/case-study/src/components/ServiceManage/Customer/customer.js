import Header from "../../Header/Header";
import Footer from "../../Footer/Footer";
import {useEffect, useState} from "react";
import * as customerService from "../../../ServiceOfCode/CustomerService"
// import {getAllCustomer} from "../../../ServiceOfCode/CustomerService";
import {Link} from "react-router-dom";
import DelCustomer from "./delCustomer";

function Customer() {
    const [customerList, setCustomerList] = useState([]);
    const [show, setShow] = useState(false);
    const [customerDel, setCustomerDel] = useState({});


    useEffect(() => {
            getAllCustomer();
        }, [show]
    )
    const getAllCustomer = async () => {
        const res = await customerService.getAllCustomer();
        console.log(res)
        setCustomerList(res);
    }

    const formatDate = (dateString) => {
        const [year, month, day] = dateString.split('-');
        return `${day}/${month}/${year}`;
    };
    //del
    const openModal = (item) => {
        setShow(true);
        console.log(item);
        setCustomerDel(item);
    }
    const closeModal = () => {
        setShow(false);
    }
    return (
        <>

            <Header/>
            <div className="container-fluid page-header py-5 wow fadeIn" data-wow-delay="0.1s">
                <div className="container text-center py-5">
                    <h1 className="display-2 text-dark mb-4 animated slideInDown">Customer</h1>
                </div>
            </div>


            <div className="container-fluid product py-5">
                <div className="container py-5">
                    <div className="section-title text-center mx-auto wow fadeInUp" data-wow-delay="0.1s"
                         style={{maxWidth: '500px'}}>
                        <Link className="fs-5 fw-medium fst-italic text-primary" to={"/customer/createCustomer"}>Tạo mới
                            khách hàng</Link>
                        <h1 className="display-6">Danh sách khách hàng tại Furama</h1>
                    </div>
                    <div className="owl-carousel product-carousel wow fadeInUp" data-wow-delay="0.5s">
                        <table className="table table-success table-striped">
                            <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Họ tên</th>
                                <th scope="col">Ngày sinh</th>
                                <th scope="col">Giới tính</th>
                                <th scope="col">Số CMND</th>
                                <th scope="col">Số Điện Thoại</th>
                                <th scope="col">Email</th>
                                <th scope="col">Loại khách</th>
                                <th scope="col">Địa chỉ</th>
                                <th scope="col" colSpan="2">Action</th>
                            </tr>
                            </thead>
                            <tbody>
                            {customerList.map((item, index) => (
                                <tr key={item.id}>
                                    <td>{index + 1}</td>
                                    <td>{item.name}</td>
                                    <td>{formatDate(item.birthday)}</td>
                                    <td>{item.gender}</td>
                                    <td>{item.idCard}</td>
                                    <td>{item.phoneNumber}</td>
                                    <td>{item.email}</td>
                                    <td>{item.type}</td>
                                    <td>{item.address}</td>
                                    <td>
                                        <Link to={`/customer/editCustomer/${item.id}`}>Edit</Link>
                                    </td>
                                    <td>
                                        <button className="btn btn-success" onClick={() => openModal(item)}>Delete
                                        </button>
                                    </td>
                                </tr>
                            ))}
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

            <Footer/>
            <DelCustomer show={show} closeModal={closeModal} customerDel={customerDel}/>
        </>
    )
}

export default Customer;