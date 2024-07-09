package com.CrudTutorial;

import com.CrudTutorial.Repositories.ITutorialRepository;
import com.CrudTutorial.models.Tutorial;
import com.CrudTutorial.service.TutorialService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UpdateTutorialTest {
    @Mock
    private ITutorialRepository iTutorialRepository;
    @InjectMocks
    private TutorialService tutorialService;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    public void updateTutorialTest() {
        Tutorial tutorial = new Tutorial();
        tutorial.setId(1);
        tutorial.setDescription("title");
        tutorial.setDescription("description");
        tutorial.setPublished(false);

        when(iTutorialRepository.findById(tutorial.getId())).thenReturn(Optional.of(tutorial));

        Tutorial tutorial1 = new Tutorial();
        tutorial1.setTitle("newTutorial");
        tutorial1.setDescription("newDescription");
        tutorial1.setPublished(true);

        tutorialService.updateTutorial(tutorial1, tutorial.getId());

        assertEquals("newTutorial", tutorial.getTitle());
        assertEquals("newDescription", tutorial.getDescription());
        assertEquals(true, tutorial.isPublished());
    }
}
