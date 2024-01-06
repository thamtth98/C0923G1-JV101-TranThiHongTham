package com.example.chuonglon.service;

import com.example.chuonglon.model.Lon;

import java.util.List;

public interface ILonService {
    List<Lon> showListLon();

    void createLon(Lon lon);

    Lon findByID(int idLon);

    void editLon(Lon lon);

    void deleteLon(int idLon);
}
