package com.FrontToBack.FtoB.Repository;

import com.FrontToBack.FtoB.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Todo,Long> {

}
