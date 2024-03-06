import {useEffect, useState} from "react";
import * as bookService from "../service/BookService"
import {Link, Navigate, NavLink} from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';

function ListBook(){
    const [bookList, setBookList] = useState([]);
    useEffect(()=>{
        getAll();
    },[])
    const getAll = async ()=>{
        const result = await bookService.getAll();
        console.log(result);
        setBookList(result);
    }
    return(
        <>
            <h3>Library</h3>
            <NavLink className="btn btn-primary" to={"/create"}>Add a new book</NavLink>
            <table className="table">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Tên sách</th>
                    <th scope="col">Tác giả</th>
                    <th scope="col">Số lượng</th>
                    <th scope="col" colSpan="2">Thao tác</th>
                </tr>
                </thead>
                <tbody>
                {bookList.map((item, index) => (
                    <tr key={item.id}>
                        <td>{index + 1}</td>
                        <td>{item.name}</td>
                        <td>{item.author}</td>
                        <td>{item.quantity}</td>
                        <td>
                            <Link className="btn btn-warning" to={`/edit/${item.id}`}>Chỉnh sửa</Link>
                        </td>
                        <td>
                            <button>Xóa</button>
                            {/*<button  className="btn btn-danger" onClick={}>Xóa</button>*/}
                        </td>
                    </tr>
                ))}
                </tbody>
            </table>
        </>
    )
}
export default ListBook;