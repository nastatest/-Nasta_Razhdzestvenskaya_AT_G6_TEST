import org.junit.Test;
import people.ManualEngineer;
import static org.junit.Assert.assertEquals;

public class ManualEngineerTests {
    @Test
    public void manualAge() {
        ManualEngineer manualEngineer = new ManualEngineer(30, 1);
        assertEquals("The age is not correct!", 30, manualEngineer.getAge());
    }

    @Test
    public void manualSkill() {
        ManualEngineer manualEngineer = new ManualEngineer(30, 1);
        assertEquals("The skill is not correct!", 2, manualEngineer.getSkill());
    }

    @Test
    public void manualExp() {
        ManualEngineer manualEngineer = new ManualEngineer(30, 1);
        assertEquals("The experience is not correct!", 1, manualEngineer.getExperience());
    }
}
