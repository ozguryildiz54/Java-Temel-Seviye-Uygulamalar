package yapılandırıcı.metotlar;
public class kisi {
    public String kisiAdi;
    public String kisiSoyadi;
    public int yas;
    
    public kisi(String ad, String soyad, int yasi)
    {
        kisiAdi=ad;
        kisiSoyadi=soyad;
        yas=yasi;
    }
    public void yazdir()
    {
        System.out.println("AD: "+kisiAdi);
        System.out.println("Soyad: "+kisiSoyadi);
        System.out.println("Yas: "+yas);
    }
    
}
