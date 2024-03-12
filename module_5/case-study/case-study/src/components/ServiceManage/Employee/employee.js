import Header from "../../Header/Header";
import {Link} from "react-router-dom";
import Footer from "../../Footer/Footer";
import {useEffect, useState} from "react";
import * as employeeService from "../../../ServiceOfCode/EmployeeService"
import DelEmployee from "./delEmployee";

function Employee() {
    const [employeeList, setEmployeeList] = useState([]);
    const [show, setShow] = useState(false);
    const [employDel, setEmployDel] = useState({});

    useEffect(() => {
        getAllEmployee();
    }, [show])
    const getAllEmployee = async () => {
        const res = await employeeService.getAllEmployee();
        console.log(res)
        setEmployeeList(res);
    }
   const openModal = (item) =>{
        setShow(true);
       console.log(item);
        setEmployDel(item);
    }
    const closeModal = ()=>{
        setShow(false);
    }
    const formatDate = (dateString) => {
        const [year, month, day] = dateString.split('-');
        return `${day}/${month}/${year}`;
    };
    const formatSalary = (salaryString) => {
        const salary = parseInt(salaryString);
        return salary.toLocaleString('vi-VN') ;
    };

    return (
        <>
            <Header/>
            <div>
                <div>
                    <img className="img-near-header" src="https://media-cdn-v2.laodong.vn/storage/newsportal/2018/12/22/648101/_MD48307.jpg?w=800&h=496&crop=auto&scale=both"
                         height="600px" width="100%" style={{ filter: 'blur(1px)' }}/>
                </div>
            </div>


            <div className="container-fluid product py-5">
                <div className="container py-5">
                    <div className="section-title text-center mx-auto wow fadeInUp" data-wow-delay="0.1s"
                         style={{maxWidth: '500px'}}>
                        <Link className="fs-5 fw-medium fst-italic text-primary" to={"/employee/create"}>Tạo mới nhân
                            viên</Link>
                        <h1 className="display-6">Danh sách nhân viên tại Furama</h1>
                    </div>
                    <div className="owl-carousel product-carousel wow fadeInUp" data-wow-delay="0.5s">
                        <table className="table table-success table-striped">
                            <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Họ tên</th>
                                <th scope="col">Ngày sinh</th>
                                <th scope="col">Số CMND</th>
                                <th scope="col">Số Điện Thoại</th>
                                <th scope="col">Email</th>
                                <th scope="col">Trình độ</th>
                                <th scope="col">Vị trí</th>
                                <th scope="col">Bộ phận</th>
                                <th scope="col">Lương (VND)</th>
                                <th scope="col" colSpan="2">Action</th>
                            </tr>
                            </thead>
                            <tbody>
                            {employeeList.map((item, index) => (
                                <tr key={item.id}>
                                    <td>{index + 1}</td>
                                    <td>{item.name}</td>
                                    <td>
                                        {formatDate(item.birthday)}</td>
                                    <td>{item.idCard}</td>
                                    <td>{item.phoneNumber}</td>
                                    <td>{item.email}</td>
                                    <td>{item.level}</td>
                                    <td>{item.position}</td>
                                    <td>{item.parts}</td>
                                    <td>{formatSalary(item.salary)}</td>
                                    <td>
                                        <Link to={`/employee/edit/${item.id}`} className="btn btn-success">Edit</Link>
                                    </td>
                                    <td>
                                        <button className="btn btn-success"
                                                onClick={()=>{openModal(item)}
                                                }>Delete</button>
                                    </td>
                                </tr>
                            ))}
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <Footer/>
            <DelEmployee show = {show} closeModal = {closeModal} employDel = {employDel}/>
        </>
    )
}

export default Employee;