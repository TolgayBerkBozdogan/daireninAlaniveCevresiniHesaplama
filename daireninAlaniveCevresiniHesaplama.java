import java.util.Scanner;
public class daireninAlaniveCevresiniHesaplama {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double pi=3.14,r,alan,cevre,dilimAlan,merkezAci=1;
        System.out.print("Dairenin Yarı Çapını Giriniz:");
        r = input.nextDouble();
        alan= pi*r*r;
        cevre = 2*pi*r;
        dilimAlan = (pi*(r*r)*merkezAci)/360;

        System.out.println("Dairenin Çevresi: "+cevre);
        System.out.println("Dairenin Alanı: "+alan);
        System.out.println("Daire Diliminin Alanı: "+dilimAlan);
    }
}
