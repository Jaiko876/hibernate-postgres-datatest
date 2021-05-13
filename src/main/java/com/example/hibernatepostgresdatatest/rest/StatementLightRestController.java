package com.example.hibernatepostgresdatatest.rest;

import com.example.hibernatepostgresdatatest.mapper.StatementLightMapper;
import com.example.hibernatepostgresdatatest.model.StatementLightModel;
import com.example.hibernatepostgresdatatest.repository.statementLight.StatementLightRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/statements-light")
@AllArgsConstructor
@Transactional
public class StatementLightRestController {

    private final StatementLightRepository repository;
    private final StatementLightMapper mapper;

    @GetMapping
    public Page<StatementLightModel> findAll(@PageableDefault(size = 500) Pageable pageable) {
        return repository.findAll(pageable).map(mapper::fullModel);
    }
}
