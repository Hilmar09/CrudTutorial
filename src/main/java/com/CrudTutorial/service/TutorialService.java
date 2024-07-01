package com.CrudTutorial.service;


import com.CrudTutorial.Repositories.ITutorialRepository;
import com.CrudTutorial.models.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

import com.CrudTutorial.models.Tutorial;
import com.CrudTutorial.resourses.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service

@Autowired
    ITutorialRepository iTutorialRepository;

public void deleteAllTutorial() {
    iTutorialRepository.deleteAll();
}
public void deleteTutorialById(int id) {
    iTutorialRepository.deleteById(id);
    }


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
