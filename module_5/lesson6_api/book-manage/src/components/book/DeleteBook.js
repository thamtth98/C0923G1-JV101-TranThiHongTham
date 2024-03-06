import Button from 'react-bootstrap/Button';
import Modal from 'react-bootstrap/Modal';
import * as bookService from "../service/BookService"


function DeleteBook({isShow, closeModal, bookDel}) {
    const submitDel = async () => {
        console.log("a")
        await bookService.delBook(bookDel);
        closeModal();
    }
    return (
        <Modal show={isShow}>
            <Modal.Header>
                Xóa
            </Modal.Header>
            <Modal.Body>
                Bạn có muốn xoá {bookDel.name} không?
            </Modal.Body>
            <Modal.Footer>
                <Button onClick={submitDel}>Xóa</Button>
                <Button onClick={closeModal}>Không</Button>
            </Modal.Footer>
        </Modal>
    );

}

export default DeleteBook;