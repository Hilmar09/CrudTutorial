package com.CrudTutorial.service;


import com.CrudTutorial.Repositories.ITutorialRepository;
import com.CrudTutorial.models.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Optional;

@Service
public class TutorialService {
@Autowired
    ITutorialRepository iTutorialRepository;

public void deleteAllTutorial() {
    iTutorialRepository.deleteAll();
}
public void deleteTutorialById(int id) {
    iTutorialRepository.deleteById(id);
    }

}
