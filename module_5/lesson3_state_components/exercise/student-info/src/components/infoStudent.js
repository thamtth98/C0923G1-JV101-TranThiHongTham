import {Component} from "react";

class InfoStudent extends Component {
    constructor(props) {
        super(props);
        this.state = {
            listStudent: [
                {
                    id: 1,
                    name: "Nguyễn Tư Khánh",
                    age: 23,
                    address: "Đà Nẵng"
                },
                {
                    id: 2,
                    name: "Tiểu Vi",
                    age: 20,
                    address: "Quảng Nam"
                }
            ]
        }
    }

    render() {

        return (
            <>
                <h2>Danh sách</h2>
                <table>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Address</th>
                    </tr>
                    {
                        this.state.listStudent.map(student => (
                            <tr key={student.id}>
                                <td>{student.id}</td>
                                <td>{student.name}</td>
                                <td>{student.age}</td>
                                <td>{student.address}</td>
                            </tr>
                        ))
                    }
                </table>
            </>
        )
    }
}

export default InfoStudent;