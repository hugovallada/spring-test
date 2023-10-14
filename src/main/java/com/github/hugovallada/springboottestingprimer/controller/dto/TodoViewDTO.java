package com.github.hugovallada.springboottestingprimer.controller.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.github.hugovallada.springboottestingprimer.db.entity.TODO;

public record TodoViewDTO(
        @JsonView(View.Internal.class) Long id,
        @JsonView(View.Public.class) String title,
        @JsonView(View.Public.class) String dueDate) {
    public static TodoViewDTO of(TODO todo) {
        return new TodoViewDTO(todo.getId(), todo.getTitle(), todo.getDueDate());
    }
}
