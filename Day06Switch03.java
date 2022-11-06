package day06Switch;

import java.util.Scanner;

public class Day06Switch03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("hangi islemi yapmak istiyorsunuz (+,-,*,/,%");
        char kar=scan.next().charAt(0);

            System.out.println("ilk  sayiyi girin");
            double ilkSayi = scan.nextDouble();
            System.out.println("ikinci  sayiyi girin");
            double ikiSayi = scan.nextDouble();
            switch (kar) {
                case '+':
                    System.out.println(ilkSayi + ikiSayi);
                    break;
                case '-':
                    System.out.println(ilkSayi - ikiSayi);
                    break;
                case '*':
                    System.out.println(ilkSayi * ikiSayi);
                    break;
                case '/':
                    System.out.println(ilkSayi / ikiSayi);
                    break;
                case '%':
                    System.out.println(ilkSayi / ikiSayi * 100);
                    break;
                default:
                    System.out.println("Dogru islem seciniz");


            }











    }
}
