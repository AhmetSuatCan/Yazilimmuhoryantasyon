
package com.mycompany.dairecevrealan;

import java.util.Scanner;
public class Dairecevrealan {
  
    public static void main(String[] args) {
        int yaricap,kullanicisecimi;
        final double PI_SAYISI= 3.14159;
         double cevre,alan;
         
         Scanner kullanicigirisi= new Scanner(System.in);
         System.out.println("Yarıçap değeri giriniz:");
         yaricap= kullanicigirisi.nextInt();
         cevre=2*PI_SAYISI*yaricap;
         alan=PI_SAYISI*yaricap*yaricap;
         System.out.println("Çevreyi öğrenmek için 1, Alanı öğrenmek için 2 değerini giriniz");
         kullanicisecimi= kullanicigirisi.nextInt();
         
         
         
         switch (kullanicisecimi){
             case 1 -> System.out.println(cevre);
             case 2 -> System.out.println(alan);
                
         
         
         
         
         
       
         
    }
}
    
}
