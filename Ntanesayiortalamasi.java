

package com.mycompany.ntanesayiortalamasi;

import java.util.Scanner;
public class Ntanesayiortalamasi {

    public static void main(String[] args) {
     double n;
     double toplam;
     double ortalama;
     toplam=0;
        Scanner adetgirisi= new Scanner(System.in);
        System.out.println("hesaplanmasını istediğiniz tam sayı adedini yazınız:");
        n= adetgirisi.nextInt();
        
        for (int i=0; i<=n; ++i) {
            toplam=toplam+i;
            
                   
        }
        
        ortalama=toplam/n;
        
        System.out.println("1'den"+" "+n+" "+"sayısına kadar olan tam sayıların ortalaması:"+ortalama+"dır");
      
    }
}
