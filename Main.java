import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        /* While döngüsü ile ATM programı yapmaya calısma

        İşlemler;

        1.İşlem : Bakiye Öğrenme
        2.İşlem : Para Çekme
        3.İşlem : Para Yatırma
        Çıkış : q
         */

        Scanner scanner = new Scanner(System.in);

        int bakiye = 1000;
        String islemler =
                  "1. İşlem : Bakiye Öğrenme \n"
                + "2. İşlem : Para Çekme\n"
                + "3. İşlem : Para Yatırma\n"
                + "Çıkış : q\n" ;

        System.out.println("*********************************");

        System.out.print(islemler);


        System.out.println("*********************************");


        while (true) {

            System.out.print("Yapmak İstediginiz İşlemi Seçiniz..:");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {

                System.out.println("Programdan Çıkılıyor..");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Bakiyeniz..:" + bakiye);
                
            } else if (islem.equals("2")) {
                System.out.print("Çekmek İstediğiniz Tutarı Giriniz..:" );
                int tutar = scanner.nextInt();
                scanner.nextLine();

                if ( bakiye - tutar < 0) {

                    System.out.println("Yeterli Bakiye Yoktur.. Bakiyeniz..: " + bakiye);
                } else {
                    bakiye -= tutar;
                    System.out.print("Yeni Bakiyeniz..:" + bakiye);
                }


            } else if (islem.equals("3")) {
                System.out.print("Yatırmak İstediğiniz Tutarı Giriniz..:");
                int yatırılantutar = scanner.nextInt();
                scanner.nextLine();
                bakiye+= yatırılantutar;
                System.out.println("Yeni Bakiyeniz..:" + bakiye);

            } else {

                System.out.println("Geçersiz Bir İşlem Girdiniz");
            }

        }









    }
}
