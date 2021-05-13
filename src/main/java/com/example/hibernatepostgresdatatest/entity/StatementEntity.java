package com.example.hibernatepostgresdatatest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "statement")
@Getter
@Setter
public class StatementEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "reg_num")
    private String regNum;

    @Column(name = "sending_date")
    private LocalDateTime sendingDate;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "patronymic")
    private String patronymic;
}
