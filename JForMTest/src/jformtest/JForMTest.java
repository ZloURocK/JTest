
package jformtest;

import jformtest.CommonCl;


public class JForMTest {

    public static void main(String[] args) {
      double d; 
      int a[] = new int[] {1,2,3};
      int b[] = new int[] {100,20,10};           
      CommonCl CCL = new CommonCl();
      d = CCL.retNumber(a,b,0); // 3-ий параметр -   1 -писать логи остальное нет
      System.out.println("Результат= "+d);
      
      
    }
    
}
