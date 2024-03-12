import {Button, Modal} from "react-bootstrap";
import * as songService from "../service/songService";

function Delete({isShow,closeModal,songDel}){
    const handelClose = ()=>{
        closeModal();
    }
    const handelSub = async ()=>{
        await songService.delSong(songDel);
        closeModal();
    }
    return(
        <>
            <Modal show={isShow}>
                <Modal.Header>
                    Xóa
                </Modal.Header>
                <Modal.Body>
                    Bạn có muốn xoá {songDel.name} không?
                </Modal.Body>
                <Modal.Footer>
                    <Button onClick={handelSub}>Xóa</Button>
                    <Button onClick={handelClose}>Không</Button>
                </Modal.Footer>
            </Modal>
        </>
    )
}export default Delete;