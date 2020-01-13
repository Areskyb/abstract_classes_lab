import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;


public class DatabaseAdminTest {

    private static final double SALARY = 50045.89;
    private static final int NI_NUMBER = 495;

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Paolo", NI_NUMBER, SALARY);
    }

    @Test
    public void shouldReturnName() {
        assertEquals("Paolo",databaseAdmin.getName());
    }

    @Test
    public void shouldRaiseSalary() {
        databaseAdmin.raiseSalary(1);
        assertEquals(SALARY + 1,databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void shouldGetPayBonusAmount() {
        double expectedBonusAmount = databaseAdmin.getSalary() * 0.01;
        assertEquals(expectedBonusAmount, databaseAdmin.payBonus(),0.01);
    }

    @Test
    public void shouldReturnNiNumber() {
        assertEquals(NI_NUMBER,databaseAdmin.getNiNumber());
    }

    @Test
    public void shouldReturnSalary() {
        assertEquals(SALARY,databaseAdmin.getSalary(),0.01);
    }
}
