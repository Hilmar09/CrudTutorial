package com.CrudTutorial.resourses;

import com.CrudTutorial.models.Tutorial;
import org.springframework.data.repository.CrudRepository;

public interface IService extends CrudRepository<Tutorial, Integer> {
}
