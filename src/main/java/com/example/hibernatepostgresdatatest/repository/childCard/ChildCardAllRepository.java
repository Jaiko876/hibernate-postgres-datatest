package com.example.hibernatepostgresdatatest.repository.childCard;

import com.example.hibernatepostgresdatatest.entity.ChildCardEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildCardAllRepository extends JpaRepository<ChildCardEntity, Integer> {
    @EntityGraph(value = "all")
    @Override
    Page<ChildCardEntity> findAll(Pageable pageable);
}
