package com.example.hibernatepostgresdatatest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "statement_light")
@Getter
@Setter
public class StatementLightEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "reg_num")
    private String regNum;

    @Column(name = "sending_date")
    private LocalDateTime sendingDate;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @PrimaryKeyJoinColumn
    private ChildInfoEntity childInfo;
}
