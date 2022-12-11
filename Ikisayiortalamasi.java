
package com.mycompany.ikisayiortalamasi;

import java.util.Scanner;
public class Ikisayiortalamasi {

    public static void main(String[] args) {
        int sayi1,sayi2;
        double ortalama;
        Scanner kullanicigirisi =new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz:");
          sayi1= kullanicigirisi.nextInt();
        System.out.println("Lütfen diğer sayıyı giriniz:");
          sayi2= kullanicigirisi.nextInt();
        ortalama= (sayi1+sayi2)/2;
        System.out.println("Girilen iki sayının ortalaması:"+ortalama);
        
       
    }
}
