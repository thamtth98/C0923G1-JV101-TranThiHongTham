import logo from './logo.svg';
import './App.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import ListBook from "./components/ListBook";

function App() {
    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route path={"/"} element={<ListBook/>}></Route>
                </Routes>
            </BrowserRouter>
        </>
    );
}

export default App;
