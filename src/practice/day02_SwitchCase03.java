package practice;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class day02_SwitchCase03 {
    // Girilen uc haneli bir sayının onlar basamağının değerini yazı ile yazdırınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        int sayi= scan.nextInt();
        int onlarBasamagi=sayi/10%10;
        System.out.println("onlarBasamagi = " + onlarBasamagi);


    }

}
