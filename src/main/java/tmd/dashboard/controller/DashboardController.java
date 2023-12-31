package tmd.dashboard.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tmd.dashboard.model.Todo;
import tmd.dashboard.repository.TodoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {
    private final TodoRepository repository;

    public DashboardController(TodoRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/todos")
    public void loadTodos(@RequestBody List<Todo> todos) {
        repository.saveAll(todos);
    }


}
