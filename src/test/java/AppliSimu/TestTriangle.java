package AppliSimu;


import DomaineRoute.Route;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTriangle {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testConversionMetresPixels() {
		
		IHMVoiture monTriangle = new IHMVoiture();
		
		int xPixels = monTriangle.calculerPositionPixels(110);
		
		assertEquals(55, xPixels);
	}

    @Test
    public void testAddRoad() {
        //given
        IHMVoiture monTriangle = new IHMVoiture();
        Route route = new Route(30,20,50,60);

        //when
        monTriangle.addRoute(route);

        //assert
        Assert.assertTrue(monTriangle.getReseau().contains(route));
    }

}
