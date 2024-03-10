import {Button, Modal} from "react-bootstrap";
import * as customerService from "../../../ServiceOfCode/CustomerService"

function DelCustomer({show,closeModal,customerDel}){
const handleBack = () =>{
    closeModal();
}
const handleDel = async ()=>{
   await customerService.delCustomer(customerDel);
    console.log(customerDel)
   closeModal();
}
    return (
        <>
            <Modal show={show}>
                <Modal.Header>
                    Xác nhận
                </Modal.Header>
                <Modal.Body>
                    Bạn có muốn xóa khách hàng {customerDel.name} không?
                </Modal.Body>
                <Modal.Footer>
                    <Button onClick={handleBack}>Không</Button>
                    <Button onClick={handleDel}>Xóa</Button>
                </Modal.Footer>
            </Modal>
        </>
    )
}
export default DelCustomer;