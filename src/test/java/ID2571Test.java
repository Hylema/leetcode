import hylema.tasks.medium.ID2571;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ID2571Test {
    @Test
    public void test() {
        assertEquals(3, ID2571.run(54));
        assertEquals(3, ID2571.run(38));
        assertEquals(3, ID2571.run(39));
    }
}
