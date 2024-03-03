import java.io.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();

    public static void dosyaOku(){

        try {
            FileInputStream in = new FileInputStream("marş.mp3");//okuyacağımız dosya hazır

            int oku;

            while ((oku = in.read()) != -1){

                icerik.add(oku);

            }

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void kopyala (String dosyaismi){

        try {
            FileOutputStream out = new FileOutputStream(dosyaismi);
            // yeni dosya oluşturup yazdık

            for (int deger : icerik){

                out.write(deger);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //FileOutputStream yazmak içim kullanılır



    }


    public static void main(String[] args) {


        dosyaOku();

        long baslangic = System.currentTimeMillis(); //şuanki zaman mili saniye
        kopyala("marş2.mp3");
        kopyala("marş3.mp3");
        kopyala("marş5.mp3");
        kopyala("marş6.mp3");
        kopyala("marş7.mp3");
        kopyala("marş8.mp3");
        kopyala("marş9.mp3");
        kopyala("marş10.mp3");

        long bitis = System.currentTimeMillis(); // başlangıçla bitişi çıkartırsan kopyalama süresini verir
        //çünkü kodun yazıldığı yere kadar zamanı ölçüyor System.currentTimeMillis() kodu .
        //bize milisaniye verir bine bölersek saniyeyi buluruz

        System.out.println("Üç dosyanın kopyalanma süresi : " + ((bitis - baslangic)/1000) + " saniye sürmüştür.");


    }
}