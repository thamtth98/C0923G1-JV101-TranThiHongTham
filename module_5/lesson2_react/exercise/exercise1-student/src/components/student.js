import ReactDOM from "react-dom/client";
import React from "react";

const students = [
    {
        id:1,
        company: 'Alfreds Futterkiste',
        contact: 'Maria Anders',
        country: 'Germany'
    },
    {
        id:2,
        company: 'Centro comercial Moctezuma',
        contact: 'Francisco Chang',
        country: 'Mexico'
    },
    {
        id:3,
        company: 'Ernst Handel',
        contact: 'Roland Mendel',
        country: 'Austria'
    },
    {
        id:4,
        company: 'Island Trading',
        contact: 'Helen Bennett',
        country: 'UK'
    },
    {
        id:5,
        company: 'Laughing Bacchus Winecellars',
        contact: 'Yoshi Tannamuri',
        country: 'Canada'
    },
    {
        id:6,
        company: 'Magazzini Alimentari Riuniti',
        contact: 'Giovanni Rovelli',
        country: 'Italy'
    }
];
const renderTable = () => {
    students.map((student) => {
            console.log(student.contact);
            return <tr>
                <td>{student.company}</td>
                <td>{student.contact}</td>
                <td>{student.country}</td>
            </tr>
        }
    )

}
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <>
        <h1>List students</h1>
        <table>
            <tr>
                <td>Company</td>
                <td>Contact</td>
                <td>Country</td>
            </tr>
            {students.map(student =>
                <tr key={student.id}>
                    <td>{student.company}</td>
                    <td>{student.contact}</td>
                    <td>{student.country}</td>
                </tr>
            )

            }
        </table>
    </>
);
export default students;