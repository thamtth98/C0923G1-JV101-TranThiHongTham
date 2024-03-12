import axios from "axios";

export const getAll = async ()=>{
    try {
        const res = await axios.get("http://localhost:8080/SongList");
        return res.data
    }catch (e){
        console.log(e);
    }

}
export const getAllType = async () =>{
    try {
        const res = await axios.get("http://localhost:8080/Type");
        return res.data;
    }catch (e){
        console.log(e)
    }
}
export const addSong = async (song)=>{
    try {
        const res = await axios.post("http://localhost:8080/SongList",song);
        return res.data;
    }catch (e){
        console.log(e)
    }

}
export const delSong = async (song)=>{
    try{
        const res = await axios.delete(`http://localhost:8080/SongList/${song.id}`,song);
        return res.data
    }catch (e){
        console.log(e)
    }
}