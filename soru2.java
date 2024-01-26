import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class soru2 {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        HashSet<Integer> ciftSayilar = new HashSet<>();
        ArrayList<Integer> tekSayilar = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            int rastgeleSayi = random.nextInt(100);
            sayilar.add(rastgeleSayi);
        }

        System.out.println("Rastgele Sayılar: " + sayilar);

        // Çift ve Tek sayıları ayır
        for (int sayi : sayilar) {
            if (sayi % 2 == 0) {
                ciftSayilar.add(sayi);
            } else {
                tekSayilar.add(sayi);
            }
        }

        System.out.println("Çift Sayılar: " + ciftSayilar);
        System.out.println("Tek Sayılar: " + tekSayilar);
    }
}
