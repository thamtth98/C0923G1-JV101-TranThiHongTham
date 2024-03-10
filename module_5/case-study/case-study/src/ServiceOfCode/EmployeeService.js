import axios from "axios";
import employee from "../components/ServiceManage/Employee/employee";

export const getAllEmployee = async () => {
    try {
        const res = await axios.get("http://localhost:8080/Employee");
        return res.data;
    } catch (e) {
        console.log(e)
    }

}
export const addEmployee = async (employee) => {
    try {
        const res = await axios.post("http://localhost:8080/Employee", employee);
        return res.data
    } catch (e) {
        console.log(e)
    }
}
export const getDataEdit = async (employeeId) => {
    try {
        const res = await axios.get(`http://localhost:8080/Employee/${employeeId}`);
        return res.data
    } catch (e) {
        console.log(e)
    }

}
export const submitEdit = async (employee) => {
    const res = await axios.put(`http://localhost:8080/Employee/${employee.id}`, employee);
    return res.data;
}
export const delEmployee = async (employee)=>{
    try {
        await axios.delete(`http://localhost:8080/Employee/${employee.id}`)
    }catch (e){
        console.log(e)
    }
}