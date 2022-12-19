import org.junit.Assert;
import org.junit.Test;

public class TestConstructor {

    @Test
    public void testConstructorWorksCorrectlyForName() {
        String var1 = "Peticel";
        byte var2 = 25;
        Animal var3 = new Animal(var1, var2);
        Assert.assertEquals(var1, var3.getName());
    }
}
