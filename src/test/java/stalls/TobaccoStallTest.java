package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 3);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void doesNotAllowVisitorsUnder18() {
        Visitor teenager = new Visitor(15, 1.7, 15.0);
        assertEquals(false, tobaccoStall.isAllowedTo(teenager));
    }

    @Test
    public void allowsVisitorsOver18() {
        Visitor adult = new Visitor(18, 1.9, 50.0);
        assertEquals(true, tobaccoStall.isAllowedTo(adult));
    }

    @Test
    public void canGetRating() {
        assertEquals(3, tobaccoStall.getRating());
    }
}
