package com.example.testmodule4.service;

import com.example.testmodule4.modal.ThanhPho;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IThanhPhoService {
    Page<ThanhPho> findAll(Pageable pageable);

    ThanhPho findById(Integer idThanhPho);

    void save(ThanhPho thanhPho);

    void deleteCity(Integer idThanhPho);

    void addCity(ThanhPho thanhPho);
}
