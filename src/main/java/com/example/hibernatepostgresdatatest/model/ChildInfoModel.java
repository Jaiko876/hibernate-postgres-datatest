package com.example.hibernatepostgresdatatest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChildInfoModel {
    private Integer id;
    private String surname;
    private String name;
    private String patronymic;
}
