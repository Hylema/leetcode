import hylema.tasks.easy.ID977;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ID977Test {
    @Test
    public void test() {
        System.out.printf(Arrays.toString(ID977.run(TestHelper.parseStringToArray("""
                [-4,-1,0,3,10]
                """))));
    }
}
