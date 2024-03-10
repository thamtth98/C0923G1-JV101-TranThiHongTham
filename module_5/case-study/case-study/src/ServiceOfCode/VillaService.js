import axios from "axios";
import {toast} from "react-toastify";

export const getAllVilla = async ()=>{
    try {
        const res = await axios.get("http://localhost:8080/Villa");
        return res.data;
    }catch (e){
        console.log(e)
    }

}
export const getDataDetail =async (villaId) =>{
    try{
        const res = await axios.get(`http://localhost:8080/Villa/${villaId}`);
        return res.data;
    }catch (e){
        console.log(e)
    }
}
export const createVilla = async (villa) =>{
    try {
       const res = await axios.post("http://localhost:8080/Villa",villa);
        return res.data;
    }catch (e){
        console.log(e)
    }
}
export const editVilla = async (villa)=>{
    try {
        await axios.put(`http://localhost:8080/Villa/${villa.id}`,villa);
    }catch (e){
        console.log(e)
    }
}