import {useEffect, useState} from "react";
import * as listToDoService from "../service/ListToDoService"
import {getAllList} from "../service/ListToDoService";
import {Formik, Form, Field} from 'formik';
import {toast} from "react-toastify";

function ToDoList() {

    const [toDoList, setTodoList] = useState([]);
    // const [toDo,setTodo] = useState([]);
    const initValue = {
        title: "",
        id: "",
        completed: false
    }

    const getAll = async () => {
        try {
            const res = await listToDoService.getAllList();
            setTodoList(res);
        } catch (err) {
            console.log(err)
        }

    }
    useEffect(() => {
        getAll();
    }, []);
    const handleSubmit = async (toDo) => {
        try {
            const create = await listToDoService.createToDo(toDo);
            if (create) {
                toast.success("Thêm mới thành công")
                await getAll();
            } else {
                toast.error("Lỗi")
            }
            console.log(toDoList)
        } catch (err) {
            console.log(err)
        }
    }

    return (
        <>
            <h3>ToDo List</h3>
            <Formik onSubmit={handleSubmit} initialValues={initValue}>
                <Form>
                    To do:
                    <Field name="title" type="text">
                    </Field>
                    <button>Submit</button>

                </Form>
            </Formik>
            {toDoList.map((item, index) => (
                    <ul key={item.id}>
                        <li>{item.title}</li>
                    </ul>
                )
            )}

        </>
    )
}

export default ToDoList;