import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi = 1;
        int sayi1= 1;
        int sayi2= 1;
        int n;
        System.out.print("Bir Sayi Giriniz : ");
        n = input.nextInt();
        int r;
        System.out.print("Ikinci Sayiyi Giriniz : ");
        r = input.nextInt();

        for(int i=1; i<=n; i++) {

            sayi = sayi * i;


        }

        for (int i=1; i<=r; i++) {

            sayi1 = sayi1 * i;


        }

        for (int i=1; i<=(n-r); i++){

            sayi2= sayi2*i;


        }


        double kombinasyon = sayi/(sayi1*sayi2);


        System.out.print(kombinasyon);









    }

}
