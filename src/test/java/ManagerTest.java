import management.Manager;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

//#### Create a subclass of `Employee` called `Manager` in a package called management.
//        - Create a class for Manager.
//        - Add a property to store the department name in a property called `deptName`.
//        - Create a constructor that includes all the parameters needed for `Employee` and `deptName`.
//        - Add a getter method for `deptName`.
//        - Test all methods including `raiseSalary` and `payBonus`
public class ManagerTest {
    private Manager manager;
    @Before
    public void before() {
        manager = new Manager("John", 2, 40_000, "Software");
    }
    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(2000);
        assertEquals(42000, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus() {
        manager.payBonus();
        assertEquals(40400, manager.getSalary(), 0.0);
    }
}
