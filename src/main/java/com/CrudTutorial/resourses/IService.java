package com.CrudTutorial.resourses;

import com.CrudTutorial.models.Tutorial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.config.Task;

public interface IServise extends CrudRepository<Tutorial, Integer> {
}
