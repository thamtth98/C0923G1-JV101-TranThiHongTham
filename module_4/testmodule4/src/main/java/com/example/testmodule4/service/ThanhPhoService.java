package com.example.testmodule4.service;

import com.example.testmodule4.modal.ThanhPho;
import com.example.testmodule4.repository.IThanhPhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ThanhPhoService implements IThanhPhoService{
    @Autowired
    private IThanhPhoRepository thanhPhoRepository;
    @Override
    public Page<ThanhPho> findAll(Pageable pageable) {
        return thanhPhoRepository.findAll(pageable);
    }

    @Override
    public ThanhPho findById(Integer idThanhPho) {
        return thanhPhoRepository.findById(idThanhPho).orElse(null);
    }

    @Override
    public void save(ThanhPho thanhPho) {
        thanhPhoRepository.save(thanhPho);
    }

    @Override
    public void deleteCity(Integer idThanhPho) {
        thanhPhoRepository.deleteById(idThanhPho);
    }

    @Override
    public void addCity(ThanhPho thanhPho) {
        thanhPhoRepository.save(thanhPho);
    }
}
