package day14_odevMethodCreation;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        //Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
        //@ isareti icermiyorsa gecersiz email yazdirin
        //@gmail.com icermiyorsa "lütfen gmail adresinizi girin" yazdirin
        //@gmail.com ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz"
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen email adresinizi girin");
        String email=scanner.nextLine();
        mailKontrolü(email);

    }

    public static void mailKontrolü(String email) {
        if(!email.contains("@")) {
            System.out.println("gecersiz email");
        }else if(!email.contains("@gmail.com")) {
            System.out.println("lütfen gmail adresinizi girin");
        }else if(!email.endsWith("@gmail.com")) {
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
        }
    }
}
