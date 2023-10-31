import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Person p1;
    Person p2;
    Person p3;
    Person p4;
    Bus bus;
    BusStop busStop;
    @Before
    public void before(){
        p1 = new Person("Gerry");
        p2 = new Person("Susan");
        p3 = new Person("Alice");
        p4 = new Person("Raymond");
        bus = new Bus("Haymarket", 3);
        busStop = new BusStop("Tollcross");
    }
    @Test
    public void canAddPassenger(){
        bus.addPassenger(p1);
        assertEquals(1, bus.getPassengerCount());
    }
    @Test
    public void canRemovePassenger(){
        bus.addPassenger(p1);
        bus.addPassenger(p2);
        bus.removePassenger(p1);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void pickUpPassenger() {
        bus.pickUpPassenger(busStop, p1);
        assertEquals(1, bus.getPassengerCount());
        bus.pickUpPassenger(busStop, p2);
        bus.pickUpPassenger(busStop, p3);
        bus.pickUpPassenger(busStop, p4);
        assertEquals(3, bus.getPassengerCount());

    }
}