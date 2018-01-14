package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.Junit;

public class MultiplyTest {

	@Test
	public void testMultiply() {
		Junit test = new Junit();
	int result = test.mutiplay(3, 4);
	assertEquals(12,result);
	}

}
