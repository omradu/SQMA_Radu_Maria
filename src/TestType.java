import static org.junit.Assert.*;
import org.junit.Test;

public class TestType {
    @Test
    public void testAnimalType() {
        Animal animal = new Animal();
        animal.setName("Bruce");
        animal.setKg(60);
        String result = animal.animalType();

        assertEquals(result, "Big");
    }
}
