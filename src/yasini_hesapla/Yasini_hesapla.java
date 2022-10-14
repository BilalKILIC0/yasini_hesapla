//Kaç Yaşında Olduğunu Hesaplayan Program.

/*
Adım 1: Başla.
Adım 2: Kullanıcan kaç yılında doğduğunun bilgisini al.
Adım 3: int yıl =2022; güncel yıl belirle.
Adım 4: (yil-dogumyas) ile kaç yaşında olduğunu bul.
Adım 5: Bulduklarını Ekrana Yazdır.
Adım 6: Dur.
*/

package yasini_hesapla;
import java.util.Scanner;



public class Yasini_hesapla {

  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen Hangi Yılda Doğduğunuzu Giriniz :");
        int dogumyil = input.nextInt();
        
        int yil = 2022;
        
        int yas =(yil-dogumyil);
        
        System.out.println("Şu an ki yaşınız :"+yas);
        
        
        
    }
    
}
