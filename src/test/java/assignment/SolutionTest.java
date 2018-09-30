package assignment;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSing() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		 
        System.setOut(new PrintStream(outContent));
        Bird hw = new Bird();
        hw.sing();
        assertEquals("I am singing", hw.sing());
	}

}
