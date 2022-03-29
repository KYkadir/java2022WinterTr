package practice;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class day01_practice4 {
    public static void main(String[] args) {

    // basit dort islem yapan bir hesap makinasi kodlayiniz
        //kullanicidan yapacapi islemi islem sembolu ile yapmasini saglayiniz
        //kullanicidan iki sayi girmesini isteyiniz
        //girilen iki sayi ve isleme gore dogru sonucu ekrana yazdiriniz

        Scanner scan =new Scanner(System.in);
        System.out.print("Yapacaginiz dort islemi  * + - / olarak seciniz");
        char ıslem=scan.next().charAt(0);
        System.out.println("Birinci sayi: " );
        double num1= scan.nextDouble();
        System.out.println("Ikinci sayi: ");
        double num2=scan.nextDouble();

        hesapMakinesi(ıslem,num1,num2);

    }

    private static void hesapMakinesi(char islem, double num1, double num2) {
        switch (islem){
            case '+' :
                System.out.println(num1+"+"+num2+"=");

        }
    }
}










