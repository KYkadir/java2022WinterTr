package Day07_ifElseStatements;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        int rakam=0;
        int rakamlartoplami=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tam sayi giriniz");
        int sayi=scan.nextInt();

        rakam=sayi%10;
        rakamlartoplami +=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlartoplami +=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlartoplami +=rakam;
        sayi/=10;


        rakam=sayi%10;
        rakamlartoplami +=rakam;
        sayi/=10;





    }
}
