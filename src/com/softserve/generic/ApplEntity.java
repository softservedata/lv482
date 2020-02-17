package com.softserve.generic;

public class ApplEntity {
	public static void main(String[] args) {
		MyEntity<OneEntity> me = new MyEntity<>();
		me.run(new OneEntity());
	}
}
