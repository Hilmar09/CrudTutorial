package com.CrudTutorial.models.Repositories;

import com.CrudTutorial.models.Tutorial;
import org.springframework.data.repository.CrudRepository;

public interface ITutorialRepository extends CrudRepository <Tutorial, Long> {
}
