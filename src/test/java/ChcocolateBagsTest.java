
import org.example.ChocolateBags;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ChcocolateBagsTest {
    ChocolateBags chocolateBags =new ChocolateBags();
    @Test
    public void JusteGrandBox(){

        // le nombre de Bbox est suffisont juste les grande boite
        assertEquals(1,chocolateBags.CanWePack(1,0,5));
        assertEquals(1,chocolateBags.CanWePack(3,0,5));
        assertEquals(0,chocolateBags.CanWePack(1,0,25));
        assertEquals(1,chocolateBags.CanWePack(2,0,6));
    }
    @Test
    public void JusteDesPetiteBoite(){
        // utilise juste des petite boite
        assertEquals(1,chocolateBags.CanWePack(0,1,1));
        assertEquals(1,chocolateBags.CanWePack(0,10,5));
        assertEquals(0,chocolateBags.CanWePack(0,10,35));
    }
    @Test
    public void DesGrandeEtPetiteBoite(){
        // utilise des petite boite et des grande boite
        assertEquals(1,chocolateBags.CanWePack(1,1,6));
        assertEquals(0,chocolateBags.CanWePack(1,1,16));
    }
}
