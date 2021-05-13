package com.example.hibernatepostgresdatatest.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChildCardModel {
    private Integer id;
    private Integer snils;
    private StatementModel statement;
    private StatementLightModel statementLight;
    private ChildInfoModel childInfo;
}
