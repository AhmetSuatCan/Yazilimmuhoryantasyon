

package com.mycompany.faktoriyel;

import java.util.Scanner;
public class Faktoriyel {
 
    public static void main(String[] args) {
       int sayi; 
       int toplam;
       long faktoriyel = 1;
       
        
        Scanner sayigirisi = new Scanner(System.in);
        System.out.println("Faktöriyeli hesaplanmasını istediğiniz sayıyı giriniz:");
        sayi= sayigirisi.nextInt();
        toplam=1;
        for(int i=1; i<sayi; i++) {
            toplam=toplam+1;
            faktoriyel= faktoriyel*toplam;
            
        }
        
        System.out.println(sayi+" "+"Sayısının faktöriyeli:"+faktoriyel+"'dir");
        
       
       
    
    
    
    }
    
    
}
