import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UtilisateurApi utilisateurApiMock;
    @Test
    public void testCreerUtilisateur() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");
//        // TODO : Configuration du comportement du mock, utiliser la
////directive « when » avec sa méthode « thenReturn »
//        // exo 2
//        //doNothing().when(utilisateurApiMock).creerUtilisateur(utilisateur);
//        // exo 3 /1/
//        doThrow(new Exception("Echec de la création de l'utilisateur")).when(utilisateurApiMock).creerUtilisateur(utilisateur);
//        // TODO : Création du service avec le mock
        UserService service = new UserService(utilisateurApiMock);
//        // TODO : Appel de la méthode à tester
//        service.creerUtilisateur(utilisateur);
//        // TODO : Vérification de l'appel à l'API
//        //exo2
//        //verify(utilisateurApiMock).creerUtilisateur(utilisateur);
//        //exo3 /2/
//        verify(utilisateurApiMock,never()).creerUtilisateur(utilisateur);
        //exo3 /3/
        when(utilisateurApiMock.creerUtilisateur(utilisateur)).thenReturn(true);
// Définition d'un ID fictif
        int idUtilisateur = 123;
// TODO: Configuration du mock pour renvoyer l'ID
//...
// Appel de la méthode à tester
        service.creerUtilisateur(utilisateur);
// TODO: Vérification de l'ID de l'utilisateur
//...
    }
}