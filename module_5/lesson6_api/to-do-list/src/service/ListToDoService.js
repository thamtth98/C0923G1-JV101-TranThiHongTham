import axios from "axios";

export const getAllList = async ()=>{
    try {
        const res = await axios.get(" http://localhost:8080/toDoList");
        return res.data;
    }catch (err){
        console.log(err);
    }

}
export const createToDo = async (toDo) =>{
    try {
        const res = await axios.post(" http://localhost:8080/toDoList",toDo);
        return res.data;
    }catch (err){
        console.log(err);
    }
}