import {Link} from "react-router-dom";
import {useEffect, useState} from "react";
import * as bookService from "../service/bookService"

function Home() {
    const [bookList, setBookList] = useState([]);
    useEffect(() => {
        getAllBook();
    }, []);
    const getAllBook = async () => {
        try {
            const res = await bookService.getAllBook();
            setBookList(res);
        } catch (e) {
            console.log(e)
        }

    }
    const convertDate = (stringDate) => {
        const [year, month, day] = stringDate.split("-");
        return `${day}/${month}/${year}`;
    }
    const [searchItem, setSearchItem] = useState();
    const [searchFilter,setSearchFilter] = useState();

    // useEffect(()=>{
    //     if(searchItem != ""){
    //         setSearchItem(searchItem)
    //     }
    // },[searchItem],[bookList])

    // const handleSub = ()=>{
    //     if(searchItem ===""){
    //         setSearchFilter(bookList)
    //     }else {
    //     }
    // }
    return (
        <>
            <Link className="btn btn-success m-2" to={"/create"}>Add new</Link>
            <div>
                <input type="text" name="name"
                       // value={searchItem} onChange={()=>setSearchItem(searchItem)}
                />
                <button className="btn btn-primary" type="submit" >Search</button>
            </div>
            <table className="table table-striped m-5">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Code</th>
                    <th scope="col">Name</th>
                    <th scope="col">Date</th>
                    <th scope="col">Quantity</th>
                    <th scope="col">Type</th>
                </tr>
                </thead>
                <tbody>
                {bookList.map((item, index) => (
                    <tr key={item.id}>
                        <td>{index + 1}</td>
                        <td>{item.idDisplay}</td>
                        <td>{item.name}</td>
                        <td>{convertDate(item.date)}</td>
                        <td>{item.quantity}</td>
                        <td>{item.type.name}</td>
                        {/*<td><Link to= className="btn btn-success">Edit</Link></td>*/}
                        {/*<td><button className="btn btn-success" }>Delete</button></td>*/}
                    </tr>
                ))}
                </tbody>
            </table>

        </>
    )
}

export default Home;