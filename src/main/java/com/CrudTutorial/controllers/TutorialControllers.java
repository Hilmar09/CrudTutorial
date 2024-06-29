package com.CrudTutorial.controllers;

import com.CrudTutorial.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class TutorialControllers {

    @Autowired
    TutorialService tutorialService;
    @GetMapping (path = "/tasks")
    public ArrayList<Task> getAllTask(){
        return taskService.getAllTask();
    }
    @PostMapping(path = "/tasks")
    public Task createTask(@RequestBody Task newTask){
        return taskService.createTask(newTask);
    }

}
