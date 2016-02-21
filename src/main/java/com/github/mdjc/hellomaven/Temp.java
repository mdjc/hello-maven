package com.github.mdjc.hellomaven;

public class Temp {
	private String name;

	public Temp(String name) {
		if (name == null) {
			throw new IllegalArgumentException();
		}

		this.name = name.toUpperCase();
	}

	@Override
	public String toString() {
		return this.name;
	}
}
