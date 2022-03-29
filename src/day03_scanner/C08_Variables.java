package day03_scanner;

import java.util.Scanner;

public class C08_Variables {
    public static void main(String[] args) {
        int sayi1=30;
        int sayi2=20;
        System.out.println("Swaptan once sayi1 : " +sayi1 + " " + "sayi2 : " + sayi2);
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("Swaptan sonra sayi1 : " +sayi1 + " " + "sayi2 : " + sayi2);

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        char ilkHarf=scan.next().charAt(0);
        System.out.println("Girdiginiz ismin ilk harfi : " + ilkHarf);





    }
}
