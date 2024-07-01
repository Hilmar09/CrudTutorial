package com.CrudTutorial.service;

import com.CrudTutorial.Repositories.ITutorialRepository;
import com.CrudTutorial.models.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tutorialService {

    @Autowired
    ITutorialRepository iTutorialRepository;

    public Tutorial createTask(Tutorial newtutorial){
        return iTutorialRepository.save(newtutorial);
    }

}
