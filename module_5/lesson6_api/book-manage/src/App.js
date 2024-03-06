import logo from './logo.svg';
import './App.css';
import ListBook from "./components/book/ListBook";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import CreateBook from "./components/book/CreateBook";
import EditBook from "./components/book/EditBook";

function App() {
    return (
        <>
        <BrowserRouter>
            <Routes>
                <Route path={"/"} element={<ListBook/>}></Route>
                <Route path={"/create"} element={<CreateBook/>}></Route>
                <Route path={"/edit/:bookId"} element={<EditBook/>}></Route>
            </Routes>
        </BrowserRouter>
        </>

    );
}

export default App;
