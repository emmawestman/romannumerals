package net.praqma.codeacademy.romannumerals;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	// this is a test
	@Test
	public void testConvert() {
		assertEquals("I", App.convert(1));
		assertEquals("2", App.convert(2));
	}

}
