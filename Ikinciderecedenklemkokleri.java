
package com.mycompany.ikinciderecedenklemkokleri;

import java.util.Scanner;
public class Ikinciderecedenklemkokleri {

    public static void main(String[] args) {
       int a,b,c;
       double diskriminant;
       double kok1,kok2;
       
       Scanner giris= new Scanner(System.in);
       System.out.println("ifadedeki bilinmeyenin karesinin katsayısını giriniz:");
       a= giris.nextInt();
       System.out.println("ifadedeki bilinmeyenin katsayısını giriniz");
       b= giris.nextInt();
       System.out.println("Sabit sayıyı giriniz");
       c= giris.nextInt();
       
      diskriminant=(b*b)-4*a*c;
      
      if(diskriminant>0){
          kok1=(Math.sqrt(diskriminant)-b)/2*a;
          kok2=(-Math.sqrt(diskriminant)-b)/2*a;
          System.out.println("Birinci kök:"+kok1);
          System.out.println("İkinci kök"+kok2);
          
          
      }else{
          if(diskriminant<0){
              System.out.println("Denklemin reel kökü yok");
              
          }else{ 
              kok1= -b/2*a;
              System.out.println("Denklemin tek kökü vardır ve"+kok1+"'dir.");
        
               
     
            
    }
}
    }
}
