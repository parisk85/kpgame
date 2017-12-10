package com.kiki.paris.kpgame;

public class Developer {

	private String name;
	private String stack;
	private String linkedin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public Developer(String name, String stack, String linkedin) {
		this.name = name;
		this.stack = stack;
		this.linkedin = linkedin;
	}
}
