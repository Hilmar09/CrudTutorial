package com.CrudTutorial.service;

import com.CrudTutorial.models.Tutorial;
import com.CrudTutorial.resourses.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TutorialService {

    @Autowired
    IService iService;

    public Tutorial updateTutorial(Tutorial tutorial, int id) {
        Optional<Tutorial> optionalTutorial = iService.findById(id);
        Tutorial newTutorial = optionalTutorial.get();
        newTutorial.setTitle(tutorial.getTitle());
        newTutorial.setDescription(tutorial.getDescription());
        newTutorial.setPublished(tutorial.isPublished());
        return iService.save(newTutorial);
    }
}
