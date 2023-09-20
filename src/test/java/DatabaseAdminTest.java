import org.junit.Test;
import org.junit.Before;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;
public class DatabaseAdminTest {
    private DatabaseAdmin databaseAdmin;
    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("John", 2, 40_000);
    }
    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2000);
        assertEquals(42000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(400, databaseAdmin.payBonus(), 0.0);
    }
}


