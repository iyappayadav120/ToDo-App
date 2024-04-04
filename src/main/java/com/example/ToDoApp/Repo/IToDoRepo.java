package com.example.ToDoApp.Repo;

import com.example.ToDoApp.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IToDoRepo extends JpaRepository<ToDo,Long> {


}
