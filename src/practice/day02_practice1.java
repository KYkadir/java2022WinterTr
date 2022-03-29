package practice;

import java.util.Scanner;

public class day02_practice1 {/*
    Kullanici dan yas bilgisini alarak
        oy kullanma yasi :
        age >= 18  ==> oy kullanmaya uygun
        age >= 70  ==> uc kez oy kullanabilir
        70 > age >=50 ==> iki kez oy kullanabilir
        50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

     */

          public static void main(String[] args) {
              Scanner scan=new Scanner(System.in);
              System.out.println("Yasinizi Giriniz...");
              int age= scan.nextInt();
              if (age>=18){
                  if (age>=70){
                      System.out.println("oy kullanmaya uygundur");
                      System.out.println("uc kez oy kullanabilir");
                  } else if (age>=50){
                      System.out.println("oy kullanmaya uygundur");
                      System.out.println("iki kez oy kullanabilir");
                  }else {
                      System.out.println("23oy kullanmaya uygundur");
                      System.out.println("bir kez oy kullanabilir");
                  }
              }else if (age<18 && age>0){
                  System.out.println("oy kullanmaya uygun degildir");
              }else
                  System.out.println("hatali giris yaptin canim");





          }




}
