import {Button, Modal} from "react-bootstrap";
import * as employeeService from "../../../ServiceOfCode/EmployeeService"


function DelEmployee({show, closeModal, employDel}) {
    const handleBack = () => {
        closeModal();
    }
    const handleSubmit = async () => {
        await employeeService.delEmployee(employDel);
        console.log(employDel);
        closeModal();
    }
    return (
        <>
            <Modal show={show}>
                <Modal.Header>Xác nhận xóa</Modal.Header>
                <Modal.Body>Có muốn xóa nhân viên {employDel.name} </Modal.Body>
                <Modal.Footer>
                    <Button onClick={handleSubmit}>Có</Button>
                    <Button onClick={handleBack}>Không</Button>
                </Modal.Footer>
            </Modal>
        </>
    )
}

export default DelEmployee;