package com.example.hibernatepostgresdatatest.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class StatementModel {
    private Integer id;
    private String regNum;
    private LocalDateTime sending_date;
    private String surname;
    private String name;
    private String patronymic;
}
