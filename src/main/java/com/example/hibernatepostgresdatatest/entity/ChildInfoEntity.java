package com.example.hibernatepostgresdatatest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "child_info")
@Getter
@Setter
public class ChildInfoEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "childInfo", optional = false)
    private StatementLightEntity statement;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "patronymic")
    private String patronymic;
}
