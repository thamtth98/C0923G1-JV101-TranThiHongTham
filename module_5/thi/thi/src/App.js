import logo from './logo.svg';
import './App.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import Home from "./components/home";
import 'bootstrap/dist/css/bootstrap.min.css';
import Create from "./components/create";
import Delete from "./components/delete";
import {ToastContainer} from "react-toastify";

function App() {
    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route path="/" element={<Home/>}></Route>
                    <Route path="/create" element={<Create/>}></Route>
                    <Route path="/delete/:songId" element={<Delete/>}></Route>
                </Routes>
            </BrowserRouter>
            <ToastContainer></ToastContainer>
        </>
    );
}

export default App;
