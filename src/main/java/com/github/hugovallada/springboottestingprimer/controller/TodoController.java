package com.github.hugovallada.springboottestingprimer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.github.hugovallada.springboottestingprimer.controller.dto.TodoViewDTO;
import com.github.hugovallada.springboottestingprimer.controller.dto.View;
import com.github.hugovallada.springboottestingprimer.services.TODOService;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TODOService todoService;

    @GetMapping
    @JsonView(View.Public.class)
    public List<TodoViewDTO> findAll() {
        final var todos = todoService.getAll();
        List<TodoViewDTO> todosView = new ArrayList<>();
        todos.forEach(todo -> todosView.add(TodoViewDTO.of(todo)));
        return todosView;
    }
}
