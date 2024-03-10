import {useState} from "react";

function ListBook() {
    const [bookList, setBookList] = useState([]);

    return (
        <>
            <h2>List Book</h2>
            <table className="table table-striped">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">First</th>
                    <th scope="col">Last</th>
                    <th scope="col">Handle</th>
                </tr>
                </thead>
                <tbody>
                {bookList.map((item, index) => (
                    <tr>
                        <td>{index}</td>
                        <td>{item.name}</td>
                        <td>{item.author}</td>
                        <td>{item.quantity}</td>
                    </tr>
                ))}

                </tbody>
            </table>
        </>
    )
}

export default ListBook;