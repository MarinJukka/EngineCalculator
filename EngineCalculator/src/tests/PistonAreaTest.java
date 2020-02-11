package tests;

import com.company.PistonArea;
import org.junit.Before;

public class PistonAreaTest {
    //In dem Bevor erzeugt du die Objekte, die spaeter bentutzt werden zum testen, also yb PistonArea a = new PistonArea(...)
    @Before
    public void setUp() throws Exception{
        new PistonArea(0.0,0.0);
    }
}
