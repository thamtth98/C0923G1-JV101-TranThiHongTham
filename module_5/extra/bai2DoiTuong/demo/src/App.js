import logo from './logo.svg';
import './App.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import Home from "./components/home";
import Create from "./components/create";
import { ToastContainer} from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';
import Edit from "./components/edit";
import EditSong from "./components/edit";
import Home2 from "./components2/list";

function App() {
    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route path={"/"} element={<Home/>}></Route>
                    <Route path={"/create"} element={<Create/>}></Route>
                    <Route path={"/edit/:blogId"} element={<EditSong/>}></Route>

                    <Route path={"/blog"} element={<Home2/>}></Route>

                </Routes>
            </BrowserRouter>
            {/*<ToastContainer></ToastContainer>*/}
        </>

    );
}

export default App;
