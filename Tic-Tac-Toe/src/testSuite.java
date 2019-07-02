import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testSuite {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void playerMoveEnvironmentVariablesTest() {
		EnvironmentVariables test = new EnvironmentVariables();
		
		test.setPlayerMove(true);
		
		assertTrue(test.isPlayerMove());
	}
	
}
