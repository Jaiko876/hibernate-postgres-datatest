package com.example.hibernatepostgresdatatest.mapper;

import com.example.hibernatepostgresdatatest.entity.StatementLightEntity;
import com.example.hibernatepostgresdatatest.model.StatementLightModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StatementLightMapper {
    StatementLightModel fullModel(StatementLightEntity entity);
}
