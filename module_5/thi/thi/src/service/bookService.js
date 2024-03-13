import axios from "axios";

export const getAllBook = async ()=>{
    try {
        const res = await axios.get("http://localhost:8080/Books");
        return res.data;
    }catch (e){
        console.log(e)
    }
}
export const getAllType = async ()=>{
    try {
        const res = await axios.get("http://localhost:8080/Type");
        return res.data;
    }catch (e){
        console.log(e)
    }
}
export const addBook= async (book)=>{
    try {
        const res = await axios.post("http://localhost:8080/Books",book);
        return res.data;
    }catch (e){
        console.log(e);
    }
}