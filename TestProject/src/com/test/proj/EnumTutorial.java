package com.test.proj;

public enum EnumTutorial {
	SPRING (1, "FLURISH UP"),
	SUMMER (2, "WARM UP"),
    FALL (3, "LIGHTEN UP"),
    WINTER (4, "TIGHTEN UP");
    
    private final int season;
	private final String nature;
	
    EnumTutorial(int seas, String nat){
		this.season = seas;
		this.nature =  nat;
	}
    
    public int setSeason(){
    	return season;
    }
    public String setNature(){
    	return nature;
    }


}
