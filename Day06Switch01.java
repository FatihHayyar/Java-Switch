package day06Switch;

import java.util.Scanner;

public class Day06Switch01 {
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        System.out.println("gun numarisini girin");
        byte gunno= data.nextByte();
//        if (gunno==1){
//            System.out.println("gun= Pazartesi");
//        }
//        else if (gunno==1){
//            System.out.println("gun= Pazartesi");
//        }
//        else if(gunno==2){
//            System.out.println("gun= Sali");
//        }
//        else if(gunno==3){
//            System.out.println("gun= Carsamba");
//        }
//        else if(gunno==4){
//            System.out.println("gun= Persembe");
//        }
//        else if(gunno==5){
//            System.out.println("gun= cuma");
//        }
//        else if(gunno==6){
//            System.out.println("gun= Cumartesi");
//        }
//        else if(gunno==7){
//            System.out.println("gun= Pazar");
//        }
//        else {System.out.println("1 den 7 ye kadar bir sayi giriniz");}
        switch (gunno){
            case 1:
                System.out.println("gun=Pazartesi");
                break;
            case 2:
                System.out.println("gun=Sali");
                break;
            case 3:
                System.out.println("gun=Carsamba");
                break;
            case 4:
                System.out.println("gun=Persembe");
                break;
            case 5:
                System.out.println("gun=Cuma");
                break;
            case 6:
                System.out.println("gun=Cumartesi");
                break;
            case 7:
                System.out.println("gun=Pazar");
                break;
            default:
                System.out.println("gecerli gun sayisi girin");
        }
    }
}
