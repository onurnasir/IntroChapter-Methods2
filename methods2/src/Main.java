public class Main {

    public static void main(String[] args) { //Args argümandan geliyor.
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(15, 7); // 15 ve 7 topla metoduna gönderdiğimiz argüman yada parametre olarak nitelendirilir.
        System.out.println(sayi);
        int toplam = topla2(2, 3, 4, 5, 6, 10);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
        //return; // Sadece bitir demek.
    }

    public static int topla(int sayi1, int sayi2) { //Bu fonsiyon yani metod yani operasyon int türünde bir değer döndürür demek.
        return sayi1 + sayi2; //Burda bitir ama 5 değerini döndür demek.
    }

    public static int topla2(int... sayilar) { // int yanına 3 nokta koymak dizi yani array olarak kullanılmasını sağlıyor.
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }
}
