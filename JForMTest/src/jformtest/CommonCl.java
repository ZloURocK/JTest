
package jformtest;

import java.util.Arrays;
import java.util.Random;


public class CommonCl {

//Найти индекс в массиве по значению    
public static int findIndex(int[] arr, int element) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == element) {
            return i;
        }
    }
    return -1; // если элемент не найден
}

//Сумма чисел в массиве
public static int sumArray(int[] arr) {
    int Res=0;
    for (int i = 0; i < arr.length; i++) {
            Res=Res+arr[i];        
    }
   return Res; 
}

   public static double retNumber(int[] a1, int a2[])
   {
       int res=0;
       int LenA1 = a1.length;
       int LenA2 = a2.length;
       int LenA3;
       if (LenA1!=LenA2) 
          throw new IllegalArgumentException("Длины массивов не совпадают.Пока");      
       int SumA2=0;      
       //найдем сумму в массиве 2, что понять сколько значений должно быть в новом массиве
       SumA2=sumArray(a2);
       //создадим новый пустой массив с кол-вом элементов = сумме массива 2
       int a3[] = new int [SumA2]; 
       
       
              int j2=0;     //запоминаем, НА каком индексе остановились
              int j3=0; //запоминаем, ДО какого индекса заполнять
              for (int i=0;i<LenA1;i++) 
              {
                System.out.println("ЦИКЛ 1, Прогон: "+i); 
                 //Считаем сумму массива (оно же и является конечной итерацией для внутреннего цикла)
                j3=j3+a2[i];    
                for (int j=j2;j<j3;j++){
                    System.out.println("j= "+j); 
                    
                     a3[j] = a1[i];
                     j2++;
                }                
              } 
              
              for (int i=0;i<SumA2;i++)
                  System.out.println("Итоговый массив a3["+i+"] = "+a3[i]);
      
       //Случайный индекс из итогового массива      
       int rnd = new Random().nextInt(a3.length);
       //соответсвенно его значение
       res=a3[rnd]; 
       
       //Можно  конечно еще массив а3 перемешать до случайной выборки, но мне впадлу
       
     return res;      
    }
}  
