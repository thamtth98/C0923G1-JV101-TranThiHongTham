import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

import Home from "./components/Home/Home";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import Customer from "./components/ServiceManage/Customer/customer";
import CreateCustomer from "./components/ServiceManage/Customer/createCustomer";
import EditCustomer from "./components/ServiceManage/Customer/editCustomer";
import {toast, ToastContainer} from "react-toastify";
import 'react-toastify/dist/ReactToastify.css';
import Employee from "./components/ServiceManage/Employee/employee";
import CreateEmployee from "./components/ServiceManage/Employee/createEmployee";
import EditEmployee from "./components/ServiceManage/Employee/editEmployee";
import Villa from "./components/ServiceManage/Facility/Villa/Villa";
import Detail from "./components/ServiceManage/Facility/Villa/detail";
import CreateVilla from "./components/ServiceManage/Facility/Villa/createVilla";
import EditVilla from "./components/ServiceManage/Facility/Villa/editVilla";



function App() {
    return (
        <>
           <BrowserRouter>
               <Routes>
                   <Route path={"/"} element={<Home/>}></Route>
                   <Route path={"/villa"} element={<Villa/>}></Route>
                   <Route path={"/villa/create"} element={<CreateVilla/>}></Route>
                   <Route path={"/villa/detail/:villaId"} element={<Detail/>}></Route>
                   <Route path={"/villa/edit/:villaId"} element={<EditVilla/>}></Route>
                   <Route path={"/customer"} element={<Customer/>}></Route>
                   <Route path={"/customer/createCustomer"} element={<CreateCustomer/>}></Route>
                   <Route path={"/customer/editCustomer/:customerId"} element={<EditCustomer/>}></Route>
                   <Route path={"/customer/delCustomer/:customerId"} element={<EditCustomer/>}></Route>
                   <Route path={"/employee"} element={<Employee/>}></Route>
                   <Route path={"/employee/create"} element={<CreateEmployee/>}></Route>
                   <Route path={"/employee/edit/:employeeId"} element={<EditEmployee/>}></Route>
               </Routes>
           </BrowserRouter>
            <ToastContainer></ToastContainer>
        </>
    );
}

export default App;
