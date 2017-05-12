import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	PlanetExplorer vozilo;
	@Test
	public void test_executeCommandf() {
		vozilo = new PlanetExplorer(100,100);
		String ocekivaniIspis="(0,1,N)";
		
		assertEquals(ocekivaniIspis,vozilo.executeCommand("f"));
		
	}
}
