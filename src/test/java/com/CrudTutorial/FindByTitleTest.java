package com.CrudTutorial;

import com.CrudTutorial.Repositories.ITutorialRepository;
import com.CrudTutorial.service.TutorialService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

public class FindByTitleTest {
    @Mock
    private ITutorialRepository iTutorialRepository;
    @InjectMocks
    private TutorialService tutorialService;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void findTutorialByTitleTest(){
        tutorialService.findByTitle("My first test");
        verify(iTutorialRepository).findByTitle("My first test");
    }
}
