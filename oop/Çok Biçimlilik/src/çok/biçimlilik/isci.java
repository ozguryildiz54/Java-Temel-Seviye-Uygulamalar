package çok.biçimlilik;
public class isci extends calisan
{
    public isci()
    {
        super();
    }
    public isci(String ad,String soyad)
    {
        super(ad,soyad);
    }
    @Override
    public void yaz()
    {
        System.out.println("Suan isci sinifindasiniz.\n");
        isciyaz();
    }
    
    public void isciyaz()
    {
        System.out.println("Ad:\t"+ad+"\nSoyad:\t"+soyad);    }
}
