import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import people.AutomatedEngineer;
import people.Engineer;
import people.ManualEngineer;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BaseEngineerTest {
    private Engineer en;
    private int skill;
    private int expectedAge;
    private int expectedExperience;

    public BaseEngineerTest(Engineer en, int skill, int expectedAge, int expectedExperience) {
        this.en = en;
        this.skill = skill;
        this.expectedAge = expectedAge;
        this.expectedExperience = expectedExperience;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][] {
                { new ManualEngineer(35, 5), 10, 35, 5 },
                { new AutomatedEngineer(38, 8), 24, 38, 8 }
        });
    }

    @Test
    public void testSkill() {
        assertEquals("The skill is not correct!", skill, en.getSkill());
    }

    @Test
    public void testAge() {
        assertEquals("The age is not correct!", expectedAge, en.getAge());
    }

    @Test
    public void testExperience() {
        assertEquals("The experience is not correct!", expectedExperience, en.getExperience());
    }
}
