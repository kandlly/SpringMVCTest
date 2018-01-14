package test;
import static org.junit.Assert.*;

import org.junit.Test;

import junit.Junit;

public class ConcateTest {

	@Test
	public void testContenate() {
		Junit test = new Junit();
		String result= test.concatenate("one","two");
		assertEquals("onetwo",result);
	}

	
}
