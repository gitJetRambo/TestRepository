package com.test.proj;

public class TestEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(EnumTutorial tutorial: EnumTutorial.values())
		{
			System.out.println("THIS IS TUTORIAL "+tutorial+ " " );
			System.out.println("THIS IS SEASON NUMBER "+ tutorial.setSeason() + " ");
		    System.out.println("TEST IS CLIMATE NAMTURE "+ tutorial.setNature() + " ");
			
		}

	}

}
