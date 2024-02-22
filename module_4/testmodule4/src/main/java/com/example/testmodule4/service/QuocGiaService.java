package com.example.testmodule4.service;

import com.example.testmodule4.modal.QuocGia;
import com.example.testmodule4.repository.IQuocGiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuocGiaService implements IQuocGiaService{
    @Autowired
    private IQuocGiaRepository quocGiaRepository;

    @Override
    public List<QuocGia> findAll() {
        return quocGiaRepository.findAll();
    }
}
