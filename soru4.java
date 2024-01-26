import java.util.HashMap;
import java.util.Map;

public class soru4 {
    public static void main(String[] args) {

        HashMap<String, Double> satislar = new HashMap<>();


        satislar.put("Aslı", 1500.0);
        satislar.put("Mahir", 2200.0);
        satislar.put("Ayla", 1800.0);
        satislar.put("Feyza", 2500.0);
        satislar.put("Ali", 2000.0);


        String enCokSatanMusteri = "";
        double enYuksekSatisMiktari = Double.MIN_VALUE;

        for (Map.Entry<String, Double> entry : satislar.entrySet()) {
            String musteriAdi = entry.getKey();
            double satisMiktari = entry.getValue();

            if (satisMiktari > enYuksekSatisMiktari) {
                enYuksekSatisMiktari = satisMiktari;
                enCokSatanMusteri = musteriAdi;
            }
        }


        System.out.println("En çok satış yapan müşteri: " + enCokSatanMusteri);
        System.out.println("Satış miktarı: " + enYuksekSatisMiktari);
    }
}
