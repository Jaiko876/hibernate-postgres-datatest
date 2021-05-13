package com.example.hibernatepostgresdatatest.repository;

import com.example.hibernatepostgresdatatest.entity.StatementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatementRepository extends JpaRepository<StatementEntity, Integer> {
}
