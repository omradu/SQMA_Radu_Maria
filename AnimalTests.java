import static org.junit.Assert.*;
import org.junit.Test;


public class AnimalTests {

    @Test
    public void testConstructorWorksCorrectlyForName() {
        String name = "Peticel";
        int weight = 25;
        Animal animal = new Animal(name, weight);

        assertEquals(name, animal.getName());
    }

    @Test
    public void testSetName() {
        String name = "Miaunel";
        Animal animal = new Animal();
        animal.setName(name);

        assertEquals(name, animal.getName());
    }

    @Test
    public void testAnimalType() {
        Animal animal = new Animal();
        animal.setName("Bruce");
        animal.setKg(60);
        String result = animal.animalType();

        assertEquals(result, "Big");
    }
}
