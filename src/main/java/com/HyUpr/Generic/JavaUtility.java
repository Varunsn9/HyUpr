package com.HyUpr.Generic;

import java.util.Random;

public class JavaUtility {

	
 public int getRandomNumber(int Range) {
	 Random random=new Random();
	int ran=random.nextInt(Range); 
	return ran;
 }
}
