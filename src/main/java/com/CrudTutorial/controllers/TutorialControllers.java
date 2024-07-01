package com.CrudTutorial.controllers;

import com.CrudTutorial.models.Tutorial;
import com.CrudTutorial.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TutorialControllers {

    @Autowired
    TutorialService tutorialService;
    @DeleteMapping(path = "/tutorials")
    public ArrayList<Tutorial> deleteAllTutorial(){
        return TutorialService.deleteAllTutorial();
    }

    @DeleteMapping (path = "/tutorials")
    public ArrayList<Tutorial> deleteTutorialById(int id){
        return TutorialService.deleteTutorialById(id);
    }
}
