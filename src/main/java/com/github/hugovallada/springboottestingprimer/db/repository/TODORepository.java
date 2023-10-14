package com.github.hugovallada.springboottestingprimer.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hugovallada.springboottestingprimer.db.entity.TODO;

public interface TODORepository extends JpaRepository<TODO, Long> {
    
}
