package com.softserve.generic;

public class MyEntity<T extends Entity> {

	public void run(T entity) {
		entity.id();
	}
}
