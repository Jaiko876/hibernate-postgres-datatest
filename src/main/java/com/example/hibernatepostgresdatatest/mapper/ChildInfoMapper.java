package com.example.hibernatepostgresdatatest.mapper;

import com.example.hibernatepostgresdatatest.entity.ChildInfoEntity;
import com.example.hibernatepostgresdatatest.model.ChildInfoModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChildInfoMapper {
    ChildInfoModel fullModel(ChildInfoEntity entity);
}
