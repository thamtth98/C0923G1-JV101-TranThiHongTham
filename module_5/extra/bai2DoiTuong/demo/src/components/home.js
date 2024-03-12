import {useEffect, useState} from "react";
import * as blogService  from "../service/blogService";
import toast from "bootstrap/js/src/toast";
import {Link} from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";

function Home() {
    const [blogs, setBlogs] = useState([]);

    //search
    const [searchTerm, setSearchTerm] = useState('');
    const [filteredItems, setFilteredItems] = useState([]);


    useEffect(()=>{
        getAll()
    },[])
   const getAll = async ()=>{
      const res = await blogService.getAll();
      setBlogs(res);
   }

   //search
    useEffect(() => {
        if (searchTerm === '') {
            setFilteredItems(blogs);
        }
    }, [searchTerm, blogs]);
   const handleSearch = () =>{
        if (searchTerm !==""){
            const filtered = blogs.filter(item =>
                item.name.toLowerCase().includes(searchTerm.toLowerCase())
            )
            setFilteredItems(filtered)
        }else {
            setFilteredItems(blogs);
        }

   }
    return (
        <>

            <Link to={"/create"} className="btn btn-success m-2">Add new blog</Link>
            <div>
                <input type="text" name="name" value={searchTerm} onChange={(event)=>setSearchTerm(event.target.value)} />
                <button onClick={handleSearch}>Search</button>
            </div>
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
                {filteredItems.map((blog,index) =>(
                    <tr key={blog.id}>
                        <td>{index+1}</td>
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

export default Home;