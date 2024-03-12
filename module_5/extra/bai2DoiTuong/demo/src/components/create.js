import {Field, Form, Formik} from "formik";
import {useEffect, useState} from "react";
import {getCategory} from "../service/blogService";
import * as blogService  from "../service/blogService";
import {toast} from 'react-toastify';
import {useNavigate} from "react-router-dom";
// import 'react-toastify/dist/ReactToastify.css';


function Create() {
    const [blog, setBlog] = useState({});
    const [category, setCategory] = useState([]);
    const navi = useNavigate();
    const inital = {
        "name": "",
        "author": "",
        "date": "",
        "category": ""
    }
    useEffect(()=>{
         display()
    },[]);
    const display = async ()=>{
       const res = await blogService.getCategory();
        console.log(res)
       setCategory( res);
    }
    const handleAdd = async (blog) => {
        console.log(blog);
        const res ={...blog,category:JSON.parse(blog.category)};
        await blogService.addBlog(res);
        // toast.success("Thêm thành công!!");
        navi("/");
    }
    if (!blog) return <div>loading</div>;
    return (
        <>
            <Formik initialValues={inital} onSubmit={(values)=>handleAdd(values)}>
                <Form className="m-5">
                    <div className="mb-3">
                        <label htmlFor="name" className="form-label">Name</label>
                        <Field type="text" className="form-control" name="name" id="name" aria-describedby="emailHelp"/>
                    </div>
                    <div className="mb-3">
                        <label htmlFor="author" className="form-label">Author</label>
                        <Field type="text" className="form-control" name="author" id="author"/>
                    </div>
                    <div className="mb-3">
                        <label htmlFor="date" className="form-label">Date</label>
                        <Field type="date" className="form-control" name="date" id="date"/>
                    </div>
                    <div className="mb-3">
                        <label htmlFor="category" className="form-label">Author</label>
                        <Field type="text" as="select" className="form-control" name="category" id="category">
                            <option disabled value="">Choice category</option>
                            {category.map(item => (
                                <option key={item.id} value={JSON.stringify(item)} >{item.name}</option>
                            ))}
                        </Field>
                    </div>

                    <button type="submit" className="btn btn-primary">Submit</button>
                </Form>
            </Formik>
        </>
    )
}

export default Create;