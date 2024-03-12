import {useEffect, useState} from "react";
import * as songService from "../service/songService";
import {Link} from "react-router-dom";
import Delete from "./delete";

function Home() {
    const [songList, setSongList] = useState([]);

    const getAllSong = async () => {
        const res = await songService.getAll();
        setSongList(res);
    }

    //delete
    const [isShow, setIsShow] = useState(false);
    const [songDel, setSongDel] = useState({});
    const openModal = (item) => {
        console.log("2")
        setIsShow(true);
        setSongDel(item);
    }
    const closeModal = () => {
        setIsShow(false);
    }
    useEffect(() => {
        getAllSong()
    }, [isShow])
    return (
        <>
            <Link to={"/create"} className="btn btn-success m-2">Add new</Link>
            <table className="table table-striped m-5">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Name</th>
                    <th scope="col">Author</th>
                    <th scope="col">Date</th>
                    <th scope="col">Category</th>
                    <th scope="col" colSpan="2">Action</th>
                </tr>
                </thead>
                <tbody>
                {songList.map((item, index) => (
                    <tr>
                        <td>#</td>
                        <td>{item.name}</td>
                        <td>{item.type.name}</td>
                        <td>3</td>
                        <td>4</td>
                        {/*<td><Link to= className="btn btn-success">Edit</Link></td>*/}
                        <td><button to={`/delete/${item.id}`} className="btn btn-success" onClick={()=>{openModal(item)}}>Delete</button></td>
                    </tr>
                ))}

                </tbody>
            </table>
            <Delete isShow={isShow} closeModal={closeModal} songDel={songDel}></Delete>
        </>
    )

}

export default Home;