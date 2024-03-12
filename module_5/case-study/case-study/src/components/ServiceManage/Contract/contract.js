import Header from "../../Header/Header";
import Footer from "../../Footer/Footer";
import {Link} from "react-router-dom";

function Contract(){

    return(
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
                    <div className="section-title text-center mx-auto wow fadeInUp" data-wow-delay="0.1s"
                         style={{maxWidth: '500px'}}>
                        <Link className="fs-5 fw-medium fst-italic text-primary" to={"/employee/create"}>Tạo mới hợp
                            đồng</Link>
                        <h1 className="display-6">Danh sách hợp đồng</h1>
                    </div>
                    <div className="owl-carousel product-carousel wow fadeInUp" data-wow-delay="0.5s">
                        <table className="table table-success table-striped">
                            <thead>
                            <tr>
                                <th scope="col">#</th>
                                <th scope="col">Số hợp đồng</th>
                                <th scope="col">Ngày bắt đầu</th>
                                <th scope="col">Ngày kết thúc</th>
                                <th scope="col">Tiền đặt cọc</th>
                                <th scope="col">Tổng tiền thuê</th>
                                <th scope="col" colSpan="2">Action</th>
                            </tr>
                            </thead>
                            {/*<tbody>*/}
                            {/*{employeeList.map((item, index) => (*/}
                            {/*    <tr key={item.id}>*/}
                            {/*        <td>{index + 1}</td>*/}
                            {/*        <td>{item.name}</td>*/}
                            {/*        <td>*/}
                            {/*            {formatDate(item.birthday)}</td>*/}
                            {/*        <td>{item.idCard}</td>*/}
                            {/*        <td>{item.phoneNumber}</td>*/}
                            {/*        <td>{item.email}</td>*/}
                            {/*        <td>{item.level}</td>*/}
                            {/*        <td>{item.position}</td>*/}
                            {/*        <td>{item.parts}</td>*/}
                            {/*        <td>{formatSalary(item.salary)}</td>*/}
                            {/*        <td>*/}
                            {/*            <Link to={`/employee/edit/${item.id}`} className="btn btn-success">Edit</Link>*/}
                            {/*        </td>*/}
                            {/*        <td>*/}
                            {/*            <button className="btn btn-success"*/}
                            {/*                    onClick={()=>{openModal(item)}*/}
                            {/*                    }>Delete</button>*/}
                            {/*        </td>*/}
                            {/*    </tr>*/}
                            {/*))}*/}
                            {/*</tbody>*/}
                        </table>
                    </div>
                </div>
            </div>


            <Footer/>
        </>
    )
}
export default Contract;