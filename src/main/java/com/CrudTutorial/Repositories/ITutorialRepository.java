package com.CrudTutorial.Repositories;

import com.CrudTutorial.models.Tutorial;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ITutorialRepository extends CrudRepository <Tutorial, Integer> {
    ArrayList<Tutorial> findByTitle(String title);
}
