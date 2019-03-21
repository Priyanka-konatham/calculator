import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcyTesting {

	@Test
	void test() {
		Calcy c = new Calcy();
		assertEquals(20,c.add(12, 8));   		//checks if 12+8 is 20
		assertEquals(10,c.multiply(2, 5)); 		//checks if 2*5 is 10
		assertEquals(3,c.divide(27, 9));		//checks if 27/9 is 3
	}

}
