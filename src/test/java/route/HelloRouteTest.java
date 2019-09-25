package route;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloRouteTest {

    @Test
    public void get()
    {
        HelloRoute r=new HelloRoute();
        assertEquals("hello",r.get());
    }
}