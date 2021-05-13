package com.example.hibernatepostgresdatatest.rest;

import com.example.hibernatepostgresdatatest.mapper.ChildCardMapper;
import com.example.hibernatepostgresdatatest.model.ChildCardModel;
import com.example.hibernatepostgresdatatest.repository.childCard.ChildCardAllRepository;
import com.example.hibernatepostgresdatatest.repository.childCard.ChildCardChildInfoRepository;
import com.example.hibernatepostgresdatatest.repository.childCard.ChildCardStatementLightRepository;
import com.example.hibernatepostgresdatatest.repository.childCard.ChildCardStatementRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/child-cards")
@AllArgsConstructor
@Transactional
public class ChildCardRestController {

    private final ChildCardAllRepository all;
    private final ChildCardStatementRepository statement;
    private final ChildCardStatementLightRepository statementLight;
    private final ChildCardChildInfoRepository childInfo;
    private final ChildCardMapper mapper;

    @GetMapping
    public Page<ChildCardModel> findAll(@PageableDefault(size = 500) Pageable pageable) {
        return all.findAll(pageable).map(mapper::fullModel);
    }

    @GetMapping("/statement")
    public Page<ChildCardModel> findAllChildInfoFromStatement(@PageableDefault(size = 500) Pageable pageable) {
        return statement.findAll(pageable).map(mapper::childInfoFromStatement);
    }

    @GetMapping("/statement-light")
    public Page<ChildCardModel> findAllChildInfoFromLightStatement(@PageableDefault(size = 500) Pageable pageable) {
        return statementLight.findAll(pageable).map(mapper::childInfoFromLightStatement);
    }

    @GetMapping("/child-info")
    public Page<ChildCardModel> findAllChildInfoFromChildInfo(@PageableDefault(size = 500) Pageable pageable) {
        return childInfo.findAll(pageable).map(mapper::childInfoFromChildInfo);
    }
}
