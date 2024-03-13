import {ErrorMessage, Field, Form, Formik} from "formik";
import {useEffect, useState} from "react";
import * as bookService from "../service/bookService"
import {toast} from "react-toastify";
import {useNavigate} from "react-router-dom";
import * as Yup from "yup";


function Create() {
    const [type, setType] = useState([]);
    const [book, setBook] = useState({});
    const navigate = useNavigate();
    useEffect(() => {
        getAllType();
    }, [])
    const getAllType = async () => {
        try {
            const res = await bookService.getAllType();
            setType(res);
        } catch (e) {
            console.log(e)
        }
    }
    const validateHi = {
        idDisplay: Yup.string().required("Không được để trống").matches(/^BO-[0-9]{4}/,"Đúng định dạng BO-XXXX"),
        name:Yup.string().required("Không được để trống").max(100),
        date:Yup.date().max(new Date("2024-03-12")),
        quantity: Yup.number().min(0,"Nhập số dương").required("Không được để trống").integer("Nhập số nguyên")
    }
    const initValue = {
        idDisplay: "",
        name: "",
        date: "",
        quantity: ""
    }
    const handleSubmit = async (book) => {
        const newBook = {...book, type: JSON.parse(book.type)}
        await bookService.addBook(newBook);
        toast.success("Add new success!");
        navigate("/")

    }
    return (
        <>
            <h1>Add new book</h1>
            <Formik initialValues={initValue}
                    onSubmit={handleSubmit}
                    validationSchema={Yup.object(validateHi)}
            >
                <Form className="m-5">
                    <div className="row mb-3">
                        <label htmlFor="idDisplay" className="col-sm-2 col-form-label">Code Book</label>
                        <div className="col-sm-10">
                            <Field type="text" className="form-control" id="idDisplay" name="idDisplay"/>
                            <ErrorMessage name="idDisplay" component="span"/>

                        </div>
                    </div>

                    <div className="row mb-3">
                        <label htmlFor="name" className="col-sm-2 col-form-label">Name Book</label>
                        <div className="col-sm-10">
                            <Field type="text" className="form-control" id="name" name="name"/>
                            <ErrorMessage name="name"/>

                        </div>
                    </div>
                    <div className="row mb-3">
                        <label htmlFor="date" className="col-sm-2 col-form-label">Date</label>
                        <div className="col-sm-10">
                            <Field type="date" className="form-control" id="date" name="date"/>
                            <ErrorMessage name="date"/>

                        </div>
                    </div>
                    <div className="row mb-3">
                        <label htmlFor="quantity" className="col-sm-2 col-form-label">Quantity</label>
                        <div className="col-sm-10">
                            <Field type="number" className="form-control" id="quantity" name="quantity"/>
                            <ErrorMessage name="quantity"/>
                        </div>
                    </div>
                    <div className="row mb-3">
                        <label htmlFor="type" className="col-sm-2 col-form-label">Type book</label>
                        <div className="col-sm-10">
                            <Field className="form-control" as="select" id="type" name="type">
                                {type.map(item => (
                                    <option value={JSON.stringify(item)} key={item.id}>{item.name}</option>
                                ))}
                            </Field>
                            <ErrorMessage name="type"/>

                        </div>
                    </div>
                    <button type='submit' className='btn btn-primary'>Submit</button>
                </Form>
            </Formik>
        </>
    )
}

export default Create;