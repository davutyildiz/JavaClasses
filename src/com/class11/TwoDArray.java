package com.class11;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		String[][] names= {
                {"Khan","Yousuf","Alex","Zynab","jjj"},
                {"Mohammad","Ann","aslyhan","Weqas"},
                {"Diago","Asif","Zubair","Shogofa"},
        };
        
        
        int lengthOfRows=names.length;
        System.out.println(lengthOfRows);
        
        int lengthOfCols=names[1].length;
        System.out.println(lengthOfCols);
        
        for(String getArrays[]: names) {
        	System.out.println(Arrays.deepToString(getArrays));
            for(String getName: getArrays) {
                
                System.out.print(getName+" ");
                
            }
            System.out.println();
            
        }

	}

}
