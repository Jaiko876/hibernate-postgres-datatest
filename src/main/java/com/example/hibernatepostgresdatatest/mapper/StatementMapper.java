package com.example.hibernatepostgresdatatest.mapper;

import com.example.hibernatepostgresdatatest.entity.StatementEntity;
import com.example.hibernatepostgresdatatest.model.StatementModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StatementMapper {
    StatementModel fullModel(StatementEntity entity);
}
