package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void allowsVisitorsUnder15() {
        Visitor child = new Visitor(8, 1.1, 5.0);
        assertEquals(true, playground.isAllowedTo(child));
    }

    @Test
    public void doesNotAllowVisitorsOver15() {
        Visitor adult = new Visitor(18, 1.9, 50.0);
        assertEquals(false, playground.isAllowedTo(adult));
    }


}
