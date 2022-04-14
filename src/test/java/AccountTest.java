import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void checkThatCorrectNameReturnTrue(){
        String fullName = "Fedor Fedorov";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertTrue(result);
    }

    @Test
    public void checkThatNameWithEmptyNameReturnFalse() {
        String fullName = "";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertFalse(result);
    }

    @Test
    public void checkThatNameWithLengthEqualTo1ReturnFalse() {
        String fullName = "F";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertFalse(result);
    }

    @Test
    public void checkThatNameWithLengthEqualTo2ReturnFalse() {
        String fullName = "Fe";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertFalse(result);
    }

    @Test
    public void checkThatNameWithLengthEqualTo3ReturnTrue() {
        String fullName = "Fe d";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertTrue(result);
    }

    @Test
    public void checkThatNameWithLengthEqualTo4ReturnTrue() {
        String fullName = "Fe do";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertTrue(result);
    }

    @Test
    public void checkThatNameWithLengthEqualTo18ReturnTrue() {
        String fullName = "FedorFedor Fedorov";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertTrue(result);
    }

    @Test
    public void checkThatNameWithLengthEqualTo19ReturnTrue() {
        String fullName = "FedorFedor FedorovF";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertTrue(result);
    }

    @Test
    public void checkThatNameWithLengthEqualTo20ReturnFalse() {
        String fullName = "FedorFedor FedorovFe";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertFalse(result);
    }

    @Test
    public void checkThatNameWithoutSpaceReturnFalse() {
        String fullName = "FedorFedorov";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertFalse(result);
    }

    @Test
    public void checkThatNameWithMoreThan1SpaceReturnFalse() {
        String fullName = "Fedor  Fedorov";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertFalse(result);
    }

    @Test
    public void checkThatNameWithSpaceAtTheBeginningReturnFalse() {
        String fullName = " FedorFedorov";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertFalse(result);
    }

    @Test
    public void checkThatNameWithSpaceAtTheEndReturnFalse() {
        String fullName = "FedorFedorov ";
        Account account = new Account(fullName);
        boolean result = account.checkNameToEmboss();

        assertFalse(result);
    }
}