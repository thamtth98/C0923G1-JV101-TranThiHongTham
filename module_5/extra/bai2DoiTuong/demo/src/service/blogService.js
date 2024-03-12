import axios from "axios";

export const getAll = async ()=>{
    try {
        const res = await axios.get("http://localhost:8080/Blogs");
        return res.data;
    }catch (e){
        console.log(e)
    }

}

export const getCategory = async () =>{
    try {
        const res = await axios.get("http://localhost:8080/Category");
        console.log(res.data)
        return res.data;
    }catch (e){
        console.log(e)
    }
}
export const addBlog = async (blog) =>{
    try {
        const res = await axios.post("http://localhost:8080/Blogs",blog);
        return res.data;
    }catch (e){
        console.log(e)
    }
}
export const getData = async (blogId)=>{
    try {
        const res = await axios.get(`http://localhost:8080/Blogs/${blogId}`);
        return res.data
    }catch (e){
        console.log(e)
    }
}
export const edit = async (blog)=>{
    try {
        const res = await axios.put(`http://localhost:8080/Blogs/${blog.id}`,blog)
    }catch (e){
        console.log(e)
    }
}