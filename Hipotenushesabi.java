
package com.mycompany.hipotenushesabi;

import java.util.Scanner;
public class Hipotenushesabi {

    public static void main(String[] args) {
        double a,b,c;
     Scanner giris=new Scanner(System.in);
 
        System.out.print("Birinci dik kenarı giriniz:");
        a=giris.nextDouble();
        System.out.print("İkinci dik kenarı giriniz:");
        b=giris.nextDouble();
 
        c=Math.sqrt(a*a+b*b);
 
        System.out.printf("\nHipotenüs:%.2f",c);
 
}
}

 
    

