package experiment1_2Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import experiment1_2.Programex;

public class ProgramexTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	//驱动模块
	@Test
	public void testFunction() {
		Programex pe = new Programex();
		String[] str = new String[] {
				"1", "as", "3.5", "s3", "5"
		};
		assertEquals(new ArrayList<Integer>(Arrays.asList(1,5)), pe.function(str));
		//fail("尚未实现");
	}

}
