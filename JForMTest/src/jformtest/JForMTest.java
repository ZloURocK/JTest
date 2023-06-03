
package jformtest;

import jformtest.CommonCl;


public class JForMTest {

    public static void main(String[] args) {
      double d; 
      int a[] = new int[] {9,2};
      int b[] = new int[] {9,10};           
      CommonCl CCL = new CommonCl();
      d = CCL.retNumber(a,b);
      System.out.println("Случайное число= "+d);
      
      
    }
    
}
