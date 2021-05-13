package com.example.hibernatepostgresdatatest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "child_card")
@Getter
@Setter

@NamedEntityGraph(
        name = "all",
        attributeNodes = {
                @NamedAttributeNode("statement"),
                @NamedAttributeNode("statementLight"),
                @NamedAttributeNode("childInfo")
        }
)

@NamedEntityGraph(name = "statement",
        attributeNodes = {
                @NamedAttributeNode("statement")
        })

@NamedEntityGraph(name = "statement-light",
        attributeNodes = {
                @NamedAttributeNode(value = "statementLight", subgraph = "statementLight")
        },
        subgraphs = @NamedSubgraph(name = "statementLight",
                attributeNodes = {
                        @NamedAttributeNode("childInfo")
                }))

@NamedEntityGraph(name = "child-info",
        attributeNodes = {
                @NamedAttributeNode("childInfo")
        })
public class ChildCardEntity {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "snils")
    private Integer snils;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statement_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "statement_id_fk", value = ConstraintMode.NO_CONSTRAINT))
    private StatementEntity statement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "statement_light_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "statement_light_fk", value = ConstraintMode.NO_CONSTRAINT))
    private StatementLightEntity statementLight;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "child_info_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "child_info_fk", value = ConstraintMode.NO_CONSTRAINT))
    private ChildInfoEntity childInfo;
}
