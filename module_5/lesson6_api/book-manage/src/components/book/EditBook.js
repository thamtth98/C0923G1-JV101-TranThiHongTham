import React, {useEffect, useState} from 'react';
import {useNavigate, useParams} from "react-router-dom";
import * as bookService from "../service/BookService";
import {toast} from "react-toastify";
import {ErrorMessage, Field, Form, Formik} from "formik";
import * as Yup from "yup";

function EditBook() {
    const {bookId} = useParams();
    const [bookEdited, setBookEdited] = useState();
    const navigation = useNavigate();

    useEffect(() => {
        getDataEdit()
    }, [])
    const getDataEdit = async () => {
        try{
            console.log(bookId)
            const data = await bookService.getById(bookId);
            setBookEdited(data);
            console.log(data);
        }catch (e){
            console.log(e);
        }

    }
    const validation = Yup.object({
        name: Yup.string().required("Tiêu đề bắt buộc nhập"),
        author: Yup.string().required("Tác giả bắt buộc nhập"),
        quantity: Yup.number().required("Số lượng bắt buộc nhập")
            .min(1, "Số lượng phải lớn hơn 1 !")
    })
    const handleSubmit = async (value) => {
        try{
            const response = await bookService.editBook(value);
            console.log(response)
            navigation("/");
            toast.success("Đã sửa thành công!!!");
        }catch (e){
            console.log(e)
        }

    }

    if (!bookEdited) {
        return null;
    } else {
        return (
            <div className="container mt-4">
                <h1>Sửa Book</h1>
                <Formik
                    initialValues={bookEdited}
                    onSubmit={handleSubmit}
                    validationSchema={validation}>
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
}

export default EditBook;