package com.example.testmodule4.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table

@NoArgsConstructor
@AllArgsConstructor
public class QuocGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNational;
    private String nameNational;

    public Integer getIdNational() {
        return idNational;
    }

    public void setIdNational(Integer idNational) {
        this.idNational = idNational;
    }

    public String getNameNational() {
        return nameNational;
    }

    public void setNameNational(String nameNational) {
        this.nameNational = nameNational;
    }
}
