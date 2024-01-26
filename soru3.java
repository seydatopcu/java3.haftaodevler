import java.util.HashMap;
import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        HashMap<String, Integer> oyuncular = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("1. Oyuncu Puan Ekle");
            System.out.println("2. Oyuncu Puanlarını Görüntüle");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    oyuncuPuanEkle(oyuncular, scanner);
                    break;
                case 2:
                    oyuncuPuanlariniGoruntule(oyuncular);
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        } while (secim != 3);
    }

    public static void oyuncuPuanEkle(HashMap<String, Integer> oyuncular, Scanner scanner) {
        System.out.print("Oyuncu adını girin: ");
        String oyuncuAdi = scanner.next();
        System.out.print("Puanı girin: ");
        int puan = scanner.nextInt();

        if (oyuncular.containsKey(oyuncuAdi)) {
            int mevcutPuan = oyuncular.get(oyuncuAdi);
            oyuncular.put(oyuncuAdi, mevcutPuan + puan);
        } else {
            oyuncular.put(oyuncuAdi, puan);
        }
        System.out.println(oyuncuAdi + " adlı oyuncunun puanı güncellendi.");
    }

    public static void oyuncuPuanlariniGoruntule(HashMap<String, Integer> oyuncular) {
        System.out.println("Oyuncu Puanları:");
        for (String oyuncu : oyuncular.keySet()) {
            int puan = oyuncular.get(oyuncu);
            System.out.println(oyuncu + ": " + puan);
        }
    }
}
