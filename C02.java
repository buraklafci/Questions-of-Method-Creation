package day14_odevMethodCreation;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        //kullaniciya kac sayi toplamak istedigini sorun.
        // kullanici 2,3 veya 4 degerini girerse,kullanicidan bu sayilari girmesini isteyin
        // ve sayilarin toplamini yazdirin.Kullanici toplamak istedigi 4ten fazla sayi ise "cok girdiniz ben toplayamam"yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("kac sayi toplamak istiyorsunuz");
        int sayiAdedi = scanner.nextInt();
        sayitopla(sayiAdedi);
    }

    public static void sayitopla(int sayiAdedi) {
        Scanner scanner = new Scanner(System.in);


        if (sayiAdedi == 1) {
            System.out.println("1.sayiyi girin");
            int sayi1 = scanner.nextInt();
            System.out.println(sayi1);
        }

        else if (sayiAdedi == 2) {
            System.out.println("1.sayiyi girin");
            int sayi1 = scanner.nextInt();
            System.out.println("2.sayiyi girin");
            int sayi2 = scanner.nextInt();
            System.out.println(sayi1 + sayi2);
        } else if (sayiAdedi == 3) {
            System.out.println("1.sayiyi girin");
            int sayi1 = scanner.nextInt();
            System.out.println("2.sayiyi girin");
            int sayi2 = scanner.nextInt();
            System.out.println("3.sayiyi girin");
            int sayi3 = scanner.nextInt();
            System.out.println(sayi1 + sayi2 + sayi3);
        } else if (sayiAdedi == 4) {
            System.out.println("1.sayiyi girin");
            int sayi1 = scanner.nextInt();
            System.out.println("2.sayiyi girin");
            int sayi2 = scanner.nextInt();
            System.out.println("3.sayiyi girin");
            int  sayi3 = scanner.nextInt();
            System.out.println("4.sayiyi girin");
            int sayi4 = scanner.nextInt();
            System.out.println(sayi1 + sayi2 + sayi3 + sayi4);
        }else {
            System.out.println("cok girdiniz ben toplayamam");
        }
    }


}
