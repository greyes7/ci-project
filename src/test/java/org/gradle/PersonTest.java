package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
	@Test
	public void canConstructAPersonWithAName() {
		Person person = new Person("Glelia");
		assertEquals("Larry", person.getName());
	}
}
