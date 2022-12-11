
package com.mycompany.ikisayitoplami;
import java.util.Scanner;
public class Ikisayitoplami {

    public static void main(String[] args) {
        int sayi1;
        int sayi2;
        int toplam;
        
        Scanner kullanicigirisi =new Scanner(System.in);
         
        
        System.out.println("Lütfen ilk sayıyı giriniz:");
          sayi1= kullanicigirisi.nextInt();
          System.out.println("Lütfen diğer sayıyı giriniz:");
          sayi2= kullanicigirisi.nextInt();
          toplam=sayi1+sayi2;
          System.out.println("Girilen iki sayının toplamı:"+ toplam);
         
    }
}
