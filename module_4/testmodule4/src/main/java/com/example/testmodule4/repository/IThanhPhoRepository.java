package com.example.testmodule4.repository;

import com.example.testmodule4.modal.ThanhPho;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IThanhPhoRepository extends JpaRepository<ThanhPho,Integer> {

    Page<ThanhPho> findByNameCityContaining(String nameCity, Pageable pageable);
}
