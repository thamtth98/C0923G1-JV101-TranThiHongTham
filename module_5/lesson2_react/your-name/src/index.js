import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

const name = "I'm Tham lam";
const fruits = [
    "Apple",
    "Banana",
    "Orange",
    "Apricot",
    "Black rowan",
    "Cranberry"
];

const root = ReactDOM.createRoot(document.getElementById('root'));
// root.render(
//     React.createElement("h1",{style:{color:"yellow"}},name)
// );
// root.render(<h2 style={{color:"grey"}}>{name}</h2>);
// const timeClick = () => {
//     document.getElementById("result").innerHTML = "hi"
// }
root.render(
    <>
        <div>
            <h1>List fruit</h1>
            <ul>
                {fruits.map(item => <li>{item}</li>)}
            </ul>
        </div>
        <div>
            <h2>Time</h2>
            <div>{(new Date().toLocaleTimeString())}</div>
        </div>
    </>
)

