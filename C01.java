package day14_odevMethodCreation;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin.sayinin tek mi cift mi oldugunu,sifirdan büyük mü kücük mü
        //100den büyükse birler,onlar,yüzler basamagindaki rakamlar toplamini
        //100den kücükse 1 ler basamagini yazdiran 3 method yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tam sayi girin");
        int sayi=scanner.nextInt();

        tekMiCiftMi(sayi);
        sifirdanBüyükMüKücükMü(sayi);
        yüzdenBüyükMüKücükMü(sayi);
    }

    public static void yüzdenBüyükMüKücükMü(int sayi) {
        int toplam=0;
        int birlerBasamagi=0;
        if (sayi>=100){
            birlerBasamagi=sayi%10;
            toplam+=birlerBasamagi;
            sayi/=10;

            birlerBasamagi=sayi%10;
            toplam+=birlerBasamagi;
            sayi/=10;

            birlerBasamagi=sayi%10;
            toplam+=birlerBasamagi;
            sayi/=10;
            System.out.println("sayinin rakamlar toplami ="+toplam);
        }else if (sayi<100){
            birlerBasamagi=sayi%10;
            System.out.println("birler basamagi :"+birlerBasamagi);
        }

    }

    public static void sifirdanBüyükMüKücükMü(int sayi) {
        if (sayi>0){
            System.out.println("sayi sifirdan büyüktür");
        }else if (sayi==0){
            System.out.println("sayi sifirdir");
        }
        else {
            System.out.println("sayi sifirdan büyüktür");
        }

    }

    public static void tekMiCiftMi(int sayi) {
        if(sayi%2==0){
            System.out.println("sayi ciftir");
        }else {
            System.out.println("sayi tektir");
        }
    }
}
