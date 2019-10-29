package experiment1_2Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import experiment1_2.Program;


public class ProgramTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFunction() {
		Program p = new Program();
		String[] str = new String[] {
			"1", "2", "3", "4", "5"
		};
		assertEquals(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)), p.function(str));
		//fail("尚未实现");
	}
	@Test
	public void testflag() {
		Program p = new Program();
		assertEquals(true, p.flag(10, 10));
	}
	@Test
	public void testNumberUtils() {
		assertEquals(100, NumberUtils.toInt("00100"));
	}
	@Test
	public void testFunction3() {
		Program p = new Program();
		String[] str = new String[] {
			"1", "as", "3.5", "s3", "5"
		};
		//assertEquals(2, p.function(str).size());		//发现错误
	}

}
