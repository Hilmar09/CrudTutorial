import static org.mockito.Mockito.verify;

import com.CrudTutorial.Repositories.ITutorialRepository;
import com.CrudTutorial.service.TutorialService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class)
public class TutorialServiceTest {

    @Mock
    private ITutorialRepository iTutorialRepository;

    @InjectMocks
    private TutorialService tutorialService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getAllTutorialTest() {
        // Llamada al método del servicio
        tutorialService.getAllTutorial();

        // Verificación de que el método findAll del repositorio fue llamado
        verify(iTutorialRepository).findAll();
    }
}
