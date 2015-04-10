package DomaineRoute;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by julian on 27/03/15.
 */
public class TestRoute {

    private Route maRoute;


    @Test
    public void testCreationRoute() {
        maRoute = new Route(100, 300, 10, 500);

        assertEquals(maRoute.getX(), 100);
        assertEquals(maRoute.getY(), 300);
        assertEquals(maRoute.getLargeur(), 10);
        assertEquals(maRoute.getLongueur(), 500);
    }
}
