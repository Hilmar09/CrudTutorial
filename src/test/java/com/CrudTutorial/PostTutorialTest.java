package com.CrudTutorial;
import com.CrudTutorial.Repositories.ITutorialRepository;
import com.CrudTutorial.models.Tutorial;
import com.CrudTutorial.service.TutorialService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
public class PostTutorialTest {

    @Mock
    private ITutorialRepository iTutorialRepository;

    @InjectMocks
    private TutorialService tutorialService;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void testCreateTutorial(){
        Tutorial newTutorial = new Tutorial();
        newTutorial.setTitle("My First Test");
        newTutorial.setDescription("Curso 1");
        newTutorial.setPublished(true);

        tutorialService.createTutorial(newTutorial);

        verify(iTutorialRepository).save(newTutorial);
        }

    }

