import {Link} from "react-router-dom";
import {useEffect, useState} from "react";
import * as blgService from "../service/blogService"

function Home2() {
    const [blogList, setBlogList] = useState([]);
    useEffect(() => {
        getAllBlog()
    })
    const getAllBlog = async () => {
        const blogList = await blgService.getAll();
        setBlogList(blogList);
    }
    return (
        <>
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
                {blogList.map((blog, index) => (
                    <tr key={blog.id}>
                        <td>{index + 1}</td>
                        <td>{blog.name}</td>
                        <td>{blog.author}</td>
                        <td>{blog.date}</td>
                        <td>{blog.category.name}</td>
                        <td><Link to={`/edit/${blog.id}`} className="btn btn-success">Edit</Link></td>
                        <td><Link to={`/del/${blog.id}`} className="btn btn-success">Delete</Link></td>
                    </tr>
                ))}

                </tbody>
            </table>

        </>
    )
}

export default Home2;