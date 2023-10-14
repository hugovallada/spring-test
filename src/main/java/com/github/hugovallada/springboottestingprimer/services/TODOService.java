package com.github.hugovallada.springboottestingprimer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hugovallada.springboottestingprimer.db.entity.TODO;
import com.github.hugovallada.springboottestingprimer.db.repository.TODORepository;

@Service
public class TODOService {

    @Autowired
    private TODORepository todoRepository;

    public List<TODO> getAll() {
        return todoRepository.findAll();
    }

}
