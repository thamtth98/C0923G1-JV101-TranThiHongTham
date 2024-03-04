import {ErrorMessage, Field, Form, Formik} from "formik";
import * as Yup from "yup";
import {useState} from "react";
function ContactForm() {
    const initValue = {
        name: '',
        email: '',
        phone: '',
        message: ''
    }
    const validateForm = Yup.object({
        name: Yup.string().required("Tên không được để trống"),
        email: Yup.string().required("Email không được để trống").matches(/^[a-zA-Z0-9+-]+@[a-zA-Z0-9-]+$/,"Email sai định dạng"),
        phone: Yup.string().required("Số điện thoại không được để trống"),
        message: Yup.string().required("Không được để trống")
    })


    const handleSubmit = (value) => {
        console.log(value);
        alert("Thêm thành công!")
    }

    return (
        <>
            <Formik initialValues={initValue} onSubmit={handleSubmit} validationSchema={validateForm}>
                <Form>
                    <div>
                        Name:
                    </div>
                    <Field name="name" type="text"></Field>

                    <div>
                        Email:
                    </div>
                        <Field name="email" type="text"></Field>

                    <div>
                        Phone:
                    </div>
                        <Field name="phone" type="text"></Field>

                    <div>
                        Message:
                    </div>
                        <Field name="message" type="textarea"></Field>
                    <br/>
                    <button type="submit">Submit</button>
                    <ErrorMessage name="name" component="p" className="error"/>
                    <ErrorMessage name="email" component="p" className="error"/>
                    <ErrorMessage name="phone" component="p" className="error"/>
                    <ErrorMessage name="message" component="p" className="error"/>
                </Form>
            </Formik>
        </>
    )
}

export default ContactForm;