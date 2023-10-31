import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    Person p1;
    Person p2;
    BusStop busStop;

    @Before
    public void before(){
        p1 = new Person("Janet");
        p2 = new Person("Dave");
        busStop = new BusStop("Tollcross");
    }

    @Test
    public void canAddToQueue(){
        assertEquals(0, busStop.getQueueSize());
        busStop.addToQueue(p1);
        assertEquals(1, busStop.getQueueSize());
    }
    public void canRemoveFromQueue(){
        busStop.addToQueue(p1);
        busStop.addToQueue(p2);
        busStop.removeFromQueue(p2);
        assertEquals(1, busStop.getQueueSize());
    }
}
