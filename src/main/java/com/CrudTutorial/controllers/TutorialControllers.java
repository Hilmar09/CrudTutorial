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

    @GetMapping (path = "/tutorials")
    public ArrayList<Tutorial> getAllTutorial(){
        return  tutorialService.getAllTutorial();
    }

    @GetMapping(path = "/tutorials?title={title}")
    public ArrayList<Tutorial> findByTitle(@RequestParam String title){
        return tutorialService.findByTitle(title);
    }

    @DeleteMapping(path = "/tutorials")
    public void deleteAllTutorial(){
        tutorialService.deleteAllTutorial();
    }

    @DeleteMapping (path = "/tutorials/{id}")
    public void deleteTutorialById(@PathVariable int id){
        tutorialService.deleteTutorialById(id);
    }

    @PutMapping(path = "/tutorials/{id}")
    public Tutorial updateTutorial(@PathVariable int id, @RequestBody Tutorial tutorial) {
        return tutorialService.updateTutorial(tutorial, id);
    }

    @PostMapping(path = "/tutorials")
    public Tutorial createTutorial(@RequestBody Tutorial newTutorial){
        return tutorialService.createTutorial(newTutorial);
    }
}
