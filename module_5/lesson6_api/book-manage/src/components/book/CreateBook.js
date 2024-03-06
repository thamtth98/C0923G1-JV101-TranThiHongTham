import React from 'react';
import {ErrorMessage, Field, Form, Formik} from "formik";
import * as bookService from "../service/BookService";
import {toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import {useNavigate} from "react-router-dom";
import * as Yup from "yup";


function CreateBook() {
    const navigate = useNavigate();
    const initValue = {
        name: "",
        author:"",
        quantity: 1
    }
    const validation = Yup.object({
        name: Yup.string().required("Tiêu đề bắt buộc nhập"),
        author: Yup.string().required("Tác giả bắt buộc nhập"),
        quantity: Yup.number().required("Số lượng bắt buộc nhập")
            .min(1, "Số lượng phải lớn hơn 1 !")
    })

    const handleAddBook = async (book) => {
        let isSuccess = await bookService.addBook(book);
        if(isSuccess) {
            toast.success("Thêm mới thành công")
            navigate("/")
        } else {
            toast.error("Lỗi rồi!")
        }
    }
    return (
        <div className="container mt-4">
            <h1>Add a new Book</h1>
            <Formik validationSchema={validation}
                initialValues={initValue}
                onSubmit={(book) => {
                    handleAddBook(book)
                }}>
                <Form>
                    <div className="mb-3">
                        <label htmlFor="name" className="form-label">Name</label>
                        <Field type="text" className="form-control" id="name" name="name" placeholder="Nhập tên sách"/>
                        <ErrorMessage name="name"/>
                    </div>
                    <div className="mb-3">
                        <label htmlFor="author" className="form-label">Author</label>
                        <Field type="text" className="form-control" id="author" name="author" placeholder="Nhập tác giả"/>
                        <ErrorMessage name="author"/>
                    </div>
                    <div className="mb-3">
                        <label htmlFor="quantity" className="form-label">Quantity</label>
                        <Field type="number" className="form-control" id="quantity" name="quantity" placeholder="Nhập số lượng"/>
                        <ErrorMessage name="quantity"/>
                    </div>
                    <button type="submit" className="btn btn-primary">Submit</button>
                </Form>
            </Formik>
        </div>
    );
}

export default CreateBook;