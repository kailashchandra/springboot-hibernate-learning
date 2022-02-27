package com.kdcoder;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

	public List<String> retriveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Yogendra Spring","Kailash");
	}

}
