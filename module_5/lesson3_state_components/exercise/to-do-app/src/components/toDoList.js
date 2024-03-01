import {Component} from "react";

class ToDoList extends Component {
    constructor(props) {
        super(props);
        this.state = {
            list: [],
            item: ""
        }
    }

    handeChange = (event) => {
        this.setState({
            item: event.target.value,
        })
        console.log(this.state.item)
    }
    handleAddItem = () => {
        this.state.list.push(this.state.item)
        this.setState(this.state)
    }

    render() {
        return (
            <>
                <h1>To Do List</h1>
                <input value={this.state.item} onChange={this.handeChange}/>
                <button onClick={this.handleAddItem}>Add</button>
                {this.state.list.map(item => (
                    <ul key={item}>
                        <li>{item}</li>
                    </ul>
                ))}
            </>
        )
    }
}


export default ToDoList;