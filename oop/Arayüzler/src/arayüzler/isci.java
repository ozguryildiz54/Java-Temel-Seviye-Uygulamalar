package arayüzler;
public class isci implements calisan{
    double ucret;
    
    public void bolumYazdir()
    {   System.out.println("İsci.");    } 
    
    public double ucret()
    {   return ucret*katsayi;   }
    
    public void ucretBelirle(double ucret)
    {
        this.ucret=ucret;
        System.out.println("Ucret : "+ucret());
    }
    
    
}
