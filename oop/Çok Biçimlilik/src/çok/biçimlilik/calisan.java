package çok.biçimlilik;
public class calisan {
    String ad;
    String soyad;
    public calisan()
    {
        ad="bos";
        soyad="bos";
    }
    public calisan(String ad, String soyad)
    {
        this.ad=ad;
        this.soyad=soyad;
    }
    
    public void yaz()
    {
        System.out.println("Suan calisan sinifindayiz.\n");
        calisanYaz();
    }
    
    public void calisanYaz()
    {
      System.out.println("Ad:\t"+ad+"\nSoyad:\t"+soyad);  
    }
}
