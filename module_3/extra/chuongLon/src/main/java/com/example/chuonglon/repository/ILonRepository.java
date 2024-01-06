package com.example.chuonglon.repository;

import com.example.chuonglon.model.Lon;

import java.util.List;

public interface ILonRepository {
    List<Lon> showListLon();

    void createLon(Lon lon);

    Lon findByID(int idLon);

    void editLon(Lon lon);

    void deleteLon(int idLon);
}
