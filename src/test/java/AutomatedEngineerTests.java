import org.junit.Assert;
import org.junit.Test;
import people.AutomatedEngineer;
import static org.junit.Assert.assertEquals;

public class AutomatedEngineerTests {

    @Test
    public void autoAge() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(33, 3);
        assertEquals("The age is not correct!", 33, automatedEngineer.getAge());
    }

    @Test
    public void autoSkill() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(33, 3);
        assertEquals("The skill is not correct!", 9, automatedEngineer.getSkill());
    }

    @Test
    public void autoExp() {
        AutomatedEngineer automatedEngineer = new AutomatedEngineer(33, 3);
        assertEquals("The experience is not correct!", 3, automatedEngineer.getExperience());
    }
}
