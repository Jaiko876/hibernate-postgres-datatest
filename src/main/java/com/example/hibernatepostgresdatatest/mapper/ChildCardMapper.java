package com.example.hibernatepostgresdatatest.mapper;

import com.example.hibernatepostgresdatatest.entity.ChildCardEntity;
import com.example.hibernatepostgresdatatest.model.ChildCardModel;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ChildCardMapper {
    ChildCardModel fullModel(ChildCardEntity entity);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "snils", source = "snils")
    @Mapping(target = "childInfo.id", source = "statement.id")
    @Mapping(target = "childInfo.surname", source = "statement.surname")
    @Mapping(target = "childInfo.name", source = "statement.name")
    @Mapping(target = "childInfo.patronymic", source = "statement.patronymic")
    ChildCardModel childInfoFromStatement(ChildCardEntity entity);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "snils", source = "snils")
    @Mapping(target = "childInfo", source = "statementLight.childInfo")
    ChildCardModel childInfoFromLightStatement(ChildCardEntity entity);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "snils", source = "snils")
    @Mapping(target = "childInfo", source = "childInfo")
    ChildCardModel childInfoFromChildInfo(ChildCardEntity entity);
}
