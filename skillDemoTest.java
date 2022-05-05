import static org.junit.Assert.*;
import org.junit.*;


public class skillDemoTest {
    int [] trial = {1,2,3,4,5};

    @Test
    public void summed(){
        assertEquals(20, skillDemo.sum(trial));
    }
    
}
