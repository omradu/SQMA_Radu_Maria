import static org.junit.Assert.*;
import org.junit.Test;

public class TestSetter {
    @Test
    public void testSetName() {
        String name = "Miaunel";
        Animal animal = new Animal();
        animal.setName(name);

        assertEquals(name, animal.getName());
    }
}
