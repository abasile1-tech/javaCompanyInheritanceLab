import management.Director;
import management.Manager;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
public class DirectorTest {
    private Director director;
    @Before
    public void before() {
        director = new Director("John", 2, 40_000, "Software", 3000);
    }
    @Test
    public void canRaiseSalary() {
        director.raiseSalary(2000);
        assertEquals(42000, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400, director.payBonus(), 0.0);
    }

    @Test
    public void canGetBudget() {
        assertEquals(3000, director.getBudget(), 0.0);
    }
}
