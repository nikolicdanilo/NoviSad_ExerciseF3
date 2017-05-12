import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	PlanetExplorer vozilo;
	@Test
	public void test_executeCommand() {
		vozilo = new PlanetExplorer(100,100,"(10,10)(20,20");
		for(int i=0;i<vozilo.getPrepreke().length;i++){
			System.out.println(vozilo.getPrepreke()[i]);
		}
	}
}
