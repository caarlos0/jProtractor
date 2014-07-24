package com.jprotractor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import com.jprotractor.mocks.JavascriptExecutorSpy;

public class NgByTest {
	private static JavascriptExecutorSpy driver;

	@BeforeClass
	public static void init() {
		driver = new JavascriptExecutorSpy();
	}

	@Test
	public void testModel() throws Exception {
		By by = NgBy.model("person.name");
		assertThat(by, notNullValue());
		assertThat(by.toString(),
				equalTo("By.model: person.name"));
	}

	@Test
	public void testBindingModel() throws Exception {
		By by = NgBy.binding("person.address", driver);
		assertThat(by, notNullValue());
		assertThat(by.toString(),
				equalTo("By.binding: person.address"));
	}
}