package com.example.hibernatepostgresdatatest.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class StatementLightModel {
    private Integer id;
    private String regNum;
    private LocalDateTime sendingDate;
    private ChildInfoModel childInfo;
}
