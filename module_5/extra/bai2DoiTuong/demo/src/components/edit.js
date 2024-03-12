import {Field, Form, Formik} from "formik";
import {useEffect, useState} from "react";
import {useNavigate, useParams} from "react-router-dom";
import {getCategory} from "../service/blogService";
import * as blogService  from "../service/blogService";
import {toast} from "react-toastify";


function Edit() {
    const [blog, setBlog] = useState();
    const [category, setCategory] = useState();
    const {blogId} = useParams();
    const navi = useNavigate();

    useEffect(() => {
        display()
    }, []);

    const display = async () => {
        try {
            const res = await blogService.getCategory();
            setCategory(res)
        } catch (e) {
            console.log(e)
        }

    }
    useEffect(() => {
        getDataCall()
    }, []);
    const getDataCall = async () => {
        try {
            const res = await blogService.getData(blogId);
            console.log(res)
            const newBlog = {...res, category: JSON.stringify(res.category)}
            setBlog(newBlog);
        } catch (e) {
            console.log(e)
        }

    }
    const handleSubmit = async (value) => {

        try {
            const newValue = {...value, category: JSON.parse(value.category)}
            console.log(newValue)
            await blogService.edit(newValue);
            navi("/");
            toast.success("Thành công")
        } catch (e) {
            console.log(e)
        }
    }

    if (!category) {
        return <>loading</>
    }
    if (!blog) {
        return <>loading</>
    }
    return (
        <>
            <>
                <Formik initialValues={blog} onSubmit={handleSubmit}>
                    <Form className="m-5">
                        <div className="mb-3">
                            <label htmlFor="name" className="form-label">Name</label>
                            <Field type="text" className="form-control" name="name" id="name"
                                   aria-describedby="emailHelp"/>
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
                                    <option key={item.id} value={JSON.stringify(item)}>{item.name}</option>
                                ))}
                            </Field>
                        </div>

                        <button type="submit" className="btn btn-primary">Submit</button>
                    </Form>
                </Formik>
            </>
        </>
    )
}

export default Edit;