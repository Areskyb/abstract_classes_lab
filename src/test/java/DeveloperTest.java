import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;


public class DeveloperTest {

    private static final double SALARY = 50045.89;
    private static final int NI_NUMBER = 495;

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Paolo", NI_NUMBER, SALARY);
    }

    @Test
    public void shouldReturnName() {
        assertEquals("Paolo",developer.getName());
    }

    @Test
    public void shouldRaiseSalary() {
        developer.raiseSalary(1);
        assertEquals(SALARY + 1,developer.getSalary(),0.01);
    }

    @Test
    public void shouldGetPayBonusAmount() {
        double expectedBonusAmount = developer.getSalary() * 0.01;
        assertEquals(expectedBonusAmount, developer.payBonus(),0.01);
    }

    @Test
    public void shouldReturnNiNumber() {
        assertEquals(NI_NUMBER,developer.getNiNumber());
    }

    @Test
    public void shouldReturnSalary() {
        assertEquals(SALARY,developer.getSalary(),0.01);
    }
}
