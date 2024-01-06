package com.example.caseproduct.repository;

import com.example.caseproduct.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRepository implements IBookRepository{
    private static final String SELECT_BOOK_BY_ID = "SELECT sach.*,tac_gia.*,the_loai.* \n" +
            "FROM sach \n" +
            "join tac_gia \n" +
            "on tac_gia.id_tac_gia = sach.id_tac_gia\n" +
            "join the_loai\n" +
            "on sach.id_the_loai = the_loai.id_the_loai\n" +
            " where id_sach=?;";
    private static final String SELECT_BOOK_BY_NAME = "SELECT sach.*,tac_gia.*,the_loai.* \n" +
            "FROM sach \n" +
            "join tac_gia \n" +
            "on tac_gia.id_tac_gia = sach.id_tac_gia\n" +
            "join the_loai\n" +
            "on sach.id_the_loai = the_loai.id_the_loai\n" +
            " where ten_sach like ?";


    @Override
    public List<Book> showBookList(String typeBook)  {
        List<Book> bookList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("select * from sach where id_the_loai = ?");
            switch (typeBook){
                case "1":
                    statement.setString(1,"1");
                    break;
                case "2":
                    statement.setString(1,"2");
                    break;
                case "3":
                    statement.setString(1,"3");
                    break;

            }
            ResultSet resultSet = statement.executeQuery();
            Book book ;
            while (resultSet.next()){
                int idSach = resultSet.getInt("id_sach");
                String tenSach = resultSet.getString("ten_sach");
                double gia = resultSet.getDouble("gia");
                int soLuong = resultSet.getInt("so_luong");
                String hinhAnh = resultSet.getString("hinh_anh");
                String moTa = resultSet.getString("mo_ta");
                int idTheLoai = resultSet.getInt("id_the_loai");
                int idTacGia = resultSet.getInt("id_tac_gia");
                book = new Book(idSach,tenSach,gia,soLuong,hinhAnh,moTa,idTheLoai,idTacGia);
                bookList.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return bookList;
    }

    @Override
    public Book findById(int idBook) {
        Book book = null;
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BOOK_BY_ID);
            statement.setInt(1, idBook);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int idSach = resultSet.getInt("id_sach");
                String tenSach = resultSet.getString("ten_sach");
                double gia = resultSet.getDouble("gia");
                int soLuong = resultSet.getInt("so_luong");
                String hinhAnh = resultSet.getString("hinh_anh");
                String moTa = resultSet.getString("mo_ta");
                int idTheLoai = resultSet.getInt("id_the_loai");
                int idTacGia = resultSet.getInt("id_tac_gia");
                String tenTacGia = resultSet.getString("ten_tac_gia");
                String tenTheLoai = resultSet.getString("ten_the_loai");
                book = new Book(idSach,tenSach,gia,soLuong,hinhAnh,moTa,idTheLoai,idTacGia,tenTacGia,tenTheLoai);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return book;
    }

    @Override
    public List<Book> findByName(String nameBook) {
        List<Book> bookList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BOOK_BY_NAME);
            statement.setString(1,"%"+nameBook+"%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int idSach = resultSet.getInt("id_sach");
                String tenSach = resultSet.getString("ten_sach");
                double gia = resultSet.getDouble("gia");
                int soLuong = resultSet.getInt("so_luong");
                String hinhAnh = resultSet.getString("hinh_anh");
                String moTa = resultSet.getString("mo_ta");
                int idTheLoai = resultSet.getInt("id_the_loai");
                int idTacGia = resultSet.getInt("id_tac_gia");
                String tenTacGia = resultSet.getString("ten_tac_gia");
                String tenTheLoai = resultSet.getString("ten_the_loai");
                Book book = new Book(idSach,tenSach,gia,soLuong,hinhAnh,moTa,idTheLoai,idTacGia,tenTacGia,tenTheLoai);
                bookList.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return bookList;
    }
}
