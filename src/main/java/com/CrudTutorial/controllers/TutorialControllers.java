package com.CrudTutorial.controllers;

import com.CrudTutorial.models.Tutorial;
import com.CrudTutorial.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TutorialControllers {

     @Autowired
    TutorialService tutorialService;

    @DeleteMapping(path = "/tutorials")
    public void deleteAllTutorial(){
        tutorialService.deleteAllTutorial();
    }

    @DeleteMapping (path = "/tutorials/{id}")
    public void deleteTutorialById(int id){
        tutorialService.deleteTutorialById(id);
    }

    @PutMapping(path = "/tutorials/{id}")
    public Tutorial updateTutorial(@PathVariable int id, @RequestBody Tutorial tutorial) {
        return tutorialService.updateTutorial(tutorial, id);
    }

    @PostMapping(path = "/tutorial")
    public Tutorial createTutorial(@RequestBody Tutorial newTutorial){
        return tutorialService.createTutorial(newTutorial);
    }
}
