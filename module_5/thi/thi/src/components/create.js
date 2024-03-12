import {ErrorMessage, Field, Form, Formik} from "formik";
import {useEffect, useState} from "react";
import * as songService from "../service/songService";
import {toast} from "react-toastify";
import {useNavigate} from "react-router-dom";



function Create() {
    const [type, setType] = useState([]);
    const [song,setSong] = useState({});
    const navi = useNavigate();
    const initValue = {
        "name": "",
        "type": ""
    }
    useEffect(() => {
        getType();
    }, [])
    const getType = async () => {
        const res = await songService.getAllType();
        setType(res);
    }

    const handleSubmit =async (song)=>{
        console.log(song)
        const newSong = {...song,type:JSON.parse(song.type)};
        await songService.addSong(newSong);
        toast.success("Success!");
        navi("/")
    }
    return (
        <>

            <h1>Thêm mới bafi hast</h1>
            <Formik
                onSubmit={handleSubmit}
                // validationSchema={validation}
                initialValues={initValue}
            >

                <Form>
                    <div className="row mb-3">
                        <label htmlFor="name" className="col-sm-2 col-form-label">Tene bafi hat</label>
                        <div className="col-sm-10">
                            <Field type="text" className="form-control" id="name" name="name"/>
                            <ErrorMessage name="name"/>

                        </div>
                    </div>

                    <div className="row mb-3">
                        <label htmlFor="type" className="col-sm-2 col-form-label">Type</label>
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