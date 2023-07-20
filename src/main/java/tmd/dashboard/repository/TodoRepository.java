package tmd.dashboard.repository;

import org.springframework.data.repository.CrudRepository;
import tmd.dashboard.model.Todo;

public interface TodoRepository extends CrudRepository<Todo, Integer> {


}
