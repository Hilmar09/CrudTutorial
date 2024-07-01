package com.CrudTutorial.controllers;

import com.CrudTutorial.models.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TutorialControllers {

    @Autowired
    com.CrudTutorial.service.tutorialService tutorialService;


    @PostMapping(path = "/tutorial")
    public Tutorial createTutorial(@RequestBody Tutorial newTutorial){
        return tutorialService.createTutorial(newTutorial);
    }

}
