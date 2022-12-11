

package com.mycompany.vizefinalortalamahesabi;

import java.util.Scanner;
public class Vizefinalortalamahesabi {

    public static void main(String[] args) {
        double vizeNot,finalNot,ortalama;
        
                
        Scanner giris= new Scanner(System.in);
        System.out.println("Vize notunu giriniz:");
        vizeNot= giris.nextInt();
        System.out.println("Final notunu giriniz:");
        finalNot= giris.nextInt();
        ortalama=(vizeNot*0.4)+(finalNot*0.6);
        
       if(ortalama<50 && finalNot<50){
           System.out.println("Kaldınız.");
           
       }else{ if(ortalama>50&& finalNot<50){ System.out.println("Kaldınız");
        
        
                
       
    }else{ System.out.println("Geçtiniz");
    
       }
    }
}
    }
