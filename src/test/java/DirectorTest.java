import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;


public class DirectorTest {
    private static final double BUDGET = 1000000.69;
    private Director director;

    @Before
    public void before(){
        director = new Director("Juan",495,2045.89,"CodeClan", BUDGET);
    }

    @Test
    public void shouldReturnBudget() {
        assertEquals(BUDGET,director.getBudget(),0.01);
    }

    @Test
    public void shouldReturnName() {
        assertEquals("Juan",director.getName());
    }

    @Test
    public void shouldRaiseSalary() {
        director.raiseSalary(1);
        assertEquals(2046.89,director.getSalary(),0.01);
    }

    @Test
    public void shouldGetPayBonusAmount() {
        double expectedBonusAmount = director.getSalary() * 0.01;
        assertEquals(expectedBonusAmount, director.payBonus(),0.01);
    }

    @Test
    public void shouldReturnDeptName() {
        assertEquals("CodeClan",director.getDeptName());
    }

    @Test
    public void shouldReturnNiNumber() {
        assertEquals(495,director.getNiNumber());
    }

    @Test
    public void shouldReturnSalary() {
        assertEquals(2045.89,director.getSalary(),0.01);
    }
}
