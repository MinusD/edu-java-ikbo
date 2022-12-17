package alsu;

import org.junit.Test;
import ru.minusd.gizatullina.lab19.task02.*;

public class TestTwo {
    @Test(expected = StudentNotFoundException.class)
    public void testTwo() throws StudentNotFoundException {
        var lab = new LabClass();
        lab.removeStudent("");
    }
}
