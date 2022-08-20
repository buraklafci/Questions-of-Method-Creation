package day14_odevMethodCreation;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
   //kullanicidan ismini,soyismini ve bosluk bırakmadan 16 hane olarak kredi karti
        //numarasi alin.İsim ve soyismi ilk harfleri büyük diger harfleri kücük olacak sekilde
        //KK numarasi ise 4 rakamli 4 blok ve aralarinda bosluk olacak sekilde düzelten iki method yazin ve
        //programda kullanabilmek icin düzenlenmis hallerini geri döndürün
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi,soyisminizi ve kredi kart numaranizi girin");
        String isim=scanner.nextLine(),
                soyisim=scanner.next(),
                cardnumber=scanner.next();
        isimSoyisim(isim,soyisim);
        kk(cardnumber);
    }

    public static void kk(String cardnumber) {
        cardnumber=cardnumber.substring(0,4)+" "+cardnumber.substring(4,8)
                +" "+cardnumber.substring(8,12)+" "+cardnumber.substring(12,16);
        System.out.println(cardnumber);
    }

    public static void isimSoyisim(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
        System.out.println(isim+" "+soyisim);
    }
}
