package com.example.hibernatepostgresdatatest.rest;

import com.example.hibernatepostgresdatatest.mapper.StatementMapper;
import com.example.hibernatepostgresdatatest.model.StatementModel;
import com.example.hibernatepostgresdatatest.repository.StatementRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/statements")
@AllArgsConstructor
@Transactional
public class StatementRestController {

    private final StatementRepository repository;
    private final StatementMapper mapper;

    @GetMapping
    public Page<StatementModel> findAll(@PageableDefault(size = 500) Pageable pageable) {
        return repository.findAll(pageable).map(mapper::fullModel);
    }
}
