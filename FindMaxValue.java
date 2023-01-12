
package com.bridgelabs.Generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class FindMaxValue<E extends Comparable>
{
	E value1;
	E value2;
	E value3;
	
	public FindMaxValue(E value1,E value2,E value3)
	{
		this.value1=value1;
		this.value2=value2;
		this.value3=value3;
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
	
		
   FindMaxValue findmaxValue=new FindMaxValue(12, 11, 13);
    findmaxValue.findMaximumValue();
    
    FindMaxValue findmaxValueFloat=new FindMaxValue(12.1, 11.3, 13.0);
    findmaxValueFloat.findMaximumValue();
    
    FindMaxValue findMaxValueForCharacter = new FindMaxValue('A', 'Z', 'M');
    findMaxValueForCharacter.findMaximumValue();
    
    
	}
	
	/*
	 * public void printMaximum(E max) { System.out.println("Maximum value is: " +
	 * max); }
	 */
	
	 public E findMaximumValue(E value1, E value2, E value3) {
	        E maximumNumber = value1;
	        if (value2.compareTo(maximumNumber) > 0) {
	            maximumNumber = value2;
	        }
	        if (value3.compareTo(maximumNumber) > 0) {
	            maximumNumber = value3;
	        }
	        return maximumNumber;
	    }
	 
	  public E findMaximumValue() {
	        E max = findMaximumValue(value1, value2, value3);
	        //printMaximum(max);
	        System.out.println("Maximum Value is:"+max);
	        return max;
	    }
	  
}
