import java.util.HashMap;
import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        HashMap<String, Integer> ogrenciler = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Öğrenci Notunu Sorgula");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    ogrenciEkle(ogrenciler, scanner);
                    break;
                case 2:
                    notSorgula(ogrenciler, scanner);
                    break;
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        } while (secim != 3);
    }

    public static void ogrenciEkle(HashMap<String, Integer> ogrenciler, Scanner scanner) {
        System.out.print("Öğrenci adını girin: ");
        String ad = scanner.next();
        System.out.print("Notunu girin: ");
        int not = scanner.nextInt();

        ogrenciler.put(ad, not);
        System.out.println(ad + " adlı öğrenci eklendi.");
    }

    public static void notSorgula(HashMap<String, Integer> ogrenciler, Scanner scanner) {
        System.out.print("Notunu sorgulamak istediğiniz öğrencinin adını girin: ");
        String ad = scanner.next();

        if (ogrenciler.containsKey(ad)) {
            int not = ogrenciler.get(ad);
            System.out.println(ad + " adlı öğrencinin notu: " + not);
        } else {
            System.out.println("Bu isimde bir öğrenci bulunamadı.");
        }
    }
}
