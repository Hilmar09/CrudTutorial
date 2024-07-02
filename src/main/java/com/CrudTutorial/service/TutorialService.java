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
public class TutorialService{
@Autowired
    ITutorialRepository iTutorialRepository;

public void deleteAllTutorial() {
    iTutorialRepository.deleteAll();
}
public void deleteTutorialById(int id) {
    iTutorialRepository.deleteById(id);
    }

    public Tutorial updateTutorial(Tutorial tutorial, int id) {
        Optional<Tutorial> optionalTutorial = iTutorialRepository.findById(id);
        Tutorial newTutorial = optionalTutorial.get();
        newTutorial.setTitle(tutorial.getTitle());
        newTutorial.setDescription(tutorial.getDescription());
        newTutorial.setPublished(tutorial.isPublished());
        return iTutorialRepository.save(newTutorial);
    }

}
