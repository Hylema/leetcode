import hylema.tasks.ID2299;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ID2299Test {
    @Test
    public void test() {
        assertTrue(ID2299.run("IloveLe3tcode!"));
        assertFalse(ID2299.run("Me+You--IsMyDream"));
        assertFalse(ID2299.run("1aB!"));
        assertFalse(ID2299.run("aA0!bB1@@3rbHkB8Puvl"));
        assertFalse(ID2299.run("FDR+7^Z+EX)UNILV7FK)U^1@BZDQZNY"));
    }
}
