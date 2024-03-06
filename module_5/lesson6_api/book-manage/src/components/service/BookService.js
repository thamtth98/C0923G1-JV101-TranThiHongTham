import axios from "axios";

export const getAll = async () => {
    try {
        const res = await axios.get("http://localhost:8080/bookList");
        return res.data;
    } catch (err) {
        console.log(err);
    }
}
export const addBook = async (book)=>{
    try {
        const res = await axios.post("http://localhost:8080/bookList",book);
        return true;
    }catch (e){
        console.log(e);
        return false
    }

}
export const getById = async (bookId)=>{
    try{
        const book = await axios.get(`http://localhost:8080/bookList/${bookId}`);
        return book.data;
    }catch (e){
        console.log(e);
    }

}
export const editBook = async (book) => {
    try {
        await axios.put(`http://localhost:3001/bookList/${book.id}`,book);
        return true;
    } catch (e) {
        return false;
    }
}