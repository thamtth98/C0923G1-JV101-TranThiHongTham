package com.example.chuonglon.service.impl;

import com.example.chuonglon.model.Lon;
import com.example.chuonglon.repository.ILonRepository;
import com.example.chuonglon.repository.impl.LonRepository;
import com.example.chuonglon.service.ILonService;

import java.util.List;

public class LonService implements ILonService {
    private ILonRepository lonRepository = new LonRepository();
    @Override
    public List<Lon> showListLon() {
        return lonRepository.showListLon();
    }

    @Override
    public void createLon(Lon lon) {
        lonRepository.createLon(lon);
    }

    @Override
    public Lon findByID(int idLon) {
        return lonRepository.findByID(idLon);
    }

    @Override
    public void editLon(Lon lon) {
        lonRepository.editLon(lon);
    }

    @Override
    public void deleteLon(int idLon) {
        lonRepository.deleteLon(idLon);
    }
}
