package com.kdcoder;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TodoBuisnessImplTest {

	@Test
	public void test() {
		TodoService todoService = new TodoServiceStub(); 
		TodoBuisnessImpl todoBuisnessImpl = new TodoBuisnessImpl(todoService);
		
		List<String> filterValues = todoBuisnessImpl.retriveTodosReleatedToSpring("Dummy");
		
		assertEquals(1, filterValues.size());
	}

}
