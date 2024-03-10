import axios from "axios";

export const getAllCustomer = async () => {
    try {
        const res = await axios.get("http://localhost:8080/Customer");
        console.log(res.data)

        return res.data;
    }catch (e){
        console.log(e);
    }
}
export const addCustomer = async (customer) => {
    try {
        await axios.post("http://localhost:8080/Customer",customer)
        return true
    }catch (e){
        console.log(e)
        return false
    }
}
export const getDataEdit = async (customerId) => {
    console.log(customerId)
    try {
        const customer = await axios.get(`http://localhost:8080/Customer/${customerId}`)
        return customer.data;
    }catch (e){
        console.log(e)
        return false
    }
}
export const editCustomer = async (customer) => {
    try {
        await axios.put(`http://localhost:8080/Customer/${customer.id}`,customer)
        return true
    }catch (e){
        console.log(e)
        return false
    }
}
export const delCustomer = async (customerDel) => {
    try {
        await axios.delete(`http://localhost:8080/Customer/${customerDel.id}`)
        return true
    }catch (e){
        console.log(e)
        return false
    }
}
