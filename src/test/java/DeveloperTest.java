import management.Manager;
import org.junit.Test;
import org.junit.Before;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;
public class DeveloperTest {
    private Developer developer;
    @Before
    public void before() {
        developer = new Developer("John", 2, 40_000);
    }
    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2000);
        assertEquals(42000, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400, developer.payBonus(), 0.0);
    }
}


