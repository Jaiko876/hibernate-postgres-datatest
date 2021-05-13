package com.example.hibernatepostgresdatatest.repository.statementLight;

import com.example.hibernatepostgresdatatest.entity.StatementLightEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatementLightRepository extends JpaRepository<StatementLightEntity, Integer> {
    @EntityGraph(attributePaths = {"childInfo"})
    @Override
    Page<StatementLightEntity> findAll(Pageable pageable);
}
