
package com.mycompany.taskagitmakas;

import java.util.Scanner;
public class Taskagitmakas {

    public static void main(String[] args) {
        int bilgisayarsecimi,kullanicisecimi;
        Scanner giris= new Scanner(System.in);
        System.out.println("Taş mı? Kağıt mı? Makas mı?");
        System.out.println("Taş için:0");
        System.out.println("Kağıt için: 1");
        System.out.println("Makas için: 2");
        kullanicisecimi= giris.nextInt();
        
        bilgisayarsecimi=(int) (Math.random()*3);
        
        if(kullanicisecimi==bilgisayarsecimi){
            
            System.out.println("Berabere");
        
        }else{if(kullanicisecimi==0 && bilgisayarsecimi==1){ 
            System.out.println("Oyuncu: Taş"+" "+"Bilgisayar: Kağıt");
            System.out.println("Kaybettin!!");
            
        }else{if(kullanicisecimi==0 && bilgisayarsecimi==2){
            System.out.println("Oyuncu:Taş"+" "+"Bilgisayar:Makas");
            System.out.println("Kazandın!!");
            
        }else{if(kullanicisecimi==1 && bilgisayarsecimi==0){
            System.out.println("Oyuncu:Kağıt"+" "+"Bilgisayar:Taş");
            System.out.println("Kazandın!!");
            
        }else{if(kullanicisecimi==1 && bilgisayarsecimi==2){
            System.out.println("Oyuncu:kağıt"+" "+"Bilgisayar:Makas");
            System.out.println("Kaybettin!!");
            
        }else{if(kullanicisecimi==2 && bilgisayarsecimi==0){
            System.out.println("Oyuncu:Makas"+" "+"Bilgisayar:Taş");
            System.out.println("Kaybettin!!");
        }else{if(kullanicisecimi==2 && bilgisayarsecimi==1){
            System.out.println("Oyuncu:Makas"+" "+"Bilgisayar:kağıt");
            System.out.println("Kazandın!!");
        }
            
        }
        
            
                
        }
        }
        }
        }
        }
    }
}
    

