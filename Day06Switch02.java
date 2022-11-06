package day06Switch;

import java.util.Scanner;

public class Day06Switch02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hangi ayda dogdunuz");
        String ayIsmi= scan.next().toLowerCase();

        switch (ayIsmi){
            case "ocak":
                System.out.println("Subat");
            case "subat":
                System.out.println("Mart");
            case "mart":
                System.out.println("Nisan");
            case "nisan":
                System.out.println("Mayis");
            case "mayis":
                System.out.println("Haziran");
            case "haziran":
                System.out.println("Temmuz");
            case "temmuz":
                System.out.println("Agustos");
            case "agustos":
                System.out.println("Eylul");
            case "eylul":
                System.out.println("Ekim");
            case "ekim":
                System.out.println("Kasim");
            case "kasim":
                System.out.println("Aralik");
            case "aralik":
                System.out.println("bundan sonra yil biter");
                break;
            default:
            System.out.println("dogru ay yazin");
        }







    }
}
