import org.example.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PersonTest {
    // decorateure before each
    Person person = new Person("Chakib","Megherbi",19);
    Person person2 = new Person("Chakib","Megherbi",15);
    Person person3 = new Person("Chakib","Megherbi",-15);
    @Test
    public void GetFullNameTest(){
        //sous la forme “prénom nom”
        assertEquals("Chakib Megherbi",person.getFullName());
    }
    @Test
    public void isAdultTrueTest(){
        //La méthode isAdult renvoie true si la personne est majeure, c’est-à-dire si son
        //âge est supérieur ou égal à 18 ans, et false sinon
        assertTrue(person.isAdult());
    }
    @Test
    public void isNotAdultTrueTest(){
        //La méthode isAdult renvoie true si la personne est majeure, c’est-à-dire si son
        //âge est supérieur ou égal à 18 ans, et false sinon
        assertFalse(person2.isAdult());
    }


    // on a pas besoin de faire se taiste comme on a pas une methode qui donne la
    // main a l'utilisateure de donner son nom
    @Test
    public void isNotAdultTrueTestWithInterval(){
        //il faut quelle naccepte pas des nombre negative
        // elle faut quelle emaitre une erreure
        assertFalse(person2.isAdult());
    }

}
