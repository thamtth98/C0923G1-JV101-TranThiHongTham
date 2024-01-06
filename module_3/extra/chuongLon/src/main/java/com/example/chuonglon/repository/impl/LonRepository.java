package com.example.chuonglon.repository.impl;

import com.example.chuonglon.model.Lon;
import com.example.chuonglon.repository.DBConnection;
import com.example.chuonglon.repository.ILonRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LonRepository implements ILonRepository {
    @Override
    public List<Lon> showListLon() {
        List<Lon> lonList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("select * from lon");
            ResultSet resultSet = statement.executeQuery();
            Lon lon = null;
            while (resultSet.next()) {

                int idLon = resultSet.getInt("id_lon");
                String tenLon = resultSet.getString("ten_lon");
                int trongLuong = Integer.parseInt(resultSet.getString("trong_luong"));
                int tuoi = Integer.parseInt(resultSet.getString("tuoi"));
                String gioiTinh = resultSet.getString("gioi_tinh");
                String chuongHienTai = resultSet.getString("chuong_hien_tai");

                lon = new Lon(idLon, tenLon, trongLuong, tuoi, gioiTinh, chuongHienTai);
                lonList.add(lon);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lonList;
    }

    @Override
    public void createLon(Lon lon) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("insert into lon(ten_lon, trong_luong,tuoi, gioi_tinh,chuong_hien_tai)" +
                    " values (?,?,?,?,?) ");
            statement.setString(1, lon.getTenLon());
            statement.setInt(2, lon.getTrongLuong());
            statement.setInt(3, lon.getTuoi());
            statement.setString(4, lon.getGioiTinh());
            statement.setString(5, lon.getChuongHienTai());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            DBConnection.close();
        }
    }

    @Override
    public Lon findByID(int idLon) {
        Lon lon = null;
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from lon where id_lon = ?");
            statement.setInt(1, idLon);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                idLon = resultSet.getInt("id_lon");
                String tenLon = resultSet.getString("ten_lon");
                int trongLuong = Integer.parseInt(resultSet.getString("trong_luong"));
                int tuoi = Integer.parseInt(resultSet.getString("tuoi"));
                String gioiTinh = resultSet.getString("gioi_tinh");
                String chuongHienTai = resultSet.getString("chuong_hien_tai");
                lon = new Lon(idLon, tenLon, trongLuong, tuoi, gioiTinh, chuongHienTai);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lon;
    }

    @Override
    public void editLon(Lon lon) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE lon SET `ten_lon` = ?, `trong_luong` = ?, `tuoi` = ?, `gioi_tinh` = ?, `chuong_hien_tai` = ? WHERE (`id_lon` = ?)");
            statement.setString(1, lon.getTenLon());
            statement.setInt(2, lon.getTrongLuong());
            statement.setInt(3, lon.getTuoi());
            statement.setString(4, lon.getGioiTinh());
            statement.setString(5, lon.getChuongHienTai());
            statement.setInt(6, lon.getIdLon());

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteLon(int idLon) {
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM `lon` WHERE (`id_lon` = ?)");
            statement.setInt(1, idLon);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
