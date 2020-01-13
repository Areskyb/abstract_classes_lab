import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;


public class ManagerTest {
    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Juan",495,2045.89,"CodeClan");
    }

    @Test
    public void shouldReturnName() {
        assertEquals("Juan",manager.getName());
    }

    @Test
    public void shouldSetName() {
        manager.setName("Aresky");
        assertEquals("Aresky",manager.getName());
    }

    @Test
    public void shouldNotSetNullName() {
        manager.setName(null);
        assertEquals("Juan",manager.getName());
    }

    @Test
    public void shouldRaiseSalary() {
        manager.raiseSalary(1);
        assertEquals(2046.89,manager.getSalary(),0.01);
    }



    @Test
    public void shouldNotRaiseNegativeAmount() {
        manager.raiseSalary(-1);
        assertEquals(2045.89,manager.getSalary(),0.01);
    }

    @Test
    public void shouldGetPayBonusAmount() {
        double expectedBonusAmount = manager.getSalary() * 0.01;
        assertEquals(expectedBonusAmount, manager.payBonus(),0.01);
    }

    @Test
    public void shouldReturnDeptName() {
        assertEquals("CodeClan",manager.getDeptName());
    }

    @Test
    public void shouldReturnNiNumber() {
        assertEquals(495,manager.getNiNumber());
    }

    @Test
    public void shouldReturnSalary() {
        assertEquals(2045.89,manager.getSalary(),0.01);
    }
}
