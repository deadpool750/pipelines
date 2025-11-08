import org.example.HRCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HRCalculatorTest {
    @Test
    public void testValidMaxHR(){
        var result = HRCalculator.calculateMaxHR(25);
        assertEquals(195, result);
    }

    @Test
    public void testInvalidMinHR_ageTooHigh() {
        assertThrows(IllegalArgumentException.class,
                () -> HRCalculator.calculateMaxHR(500));
    }
    @Test
    public void testInvalidMinHR_ageTooLow() {
        assertThrows(IllegalArgumentException.class,
                () -> HRCalculator.calculateMaxHR(-1));
    }

    @Test
    public void testWorkoutZoneVeryLight() {
        assertEquals("Very Light",
                HRCalculator.getWorkoutZone(30, 110)); // ~56%
    }

    @Test
    public void testWorkoutZoneLight() {
        assertEquals("Light",
                HRCalculator.getWorkoutZone(25, 130)); // ~67%
    }

    @Test
    public void testWorkoutZoneModerate() {
        assertEquals("Moderate",
                HRCalculator.getWorkoutZone(40, 130)); // ~74%
    }

    @Test
    public void testWorkoutZoneHard() {
        assertEquals("Hard",
                HRCalculator.getWorkoutZone(20, 170)); // ~86%
    }

    @Test
    public void testWorkoutZoneVeryHard() {
        assertEquals("Very Hard",
                HRCalculator.getWorkoutZone(30, 200)); // >90%
    }

}