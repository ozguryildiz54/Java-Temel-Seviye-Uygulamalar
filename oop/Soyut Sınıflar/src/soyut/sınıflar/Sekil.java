package soyut.sınıflar;
public abstract class Sekil {
    String isim;
    
    public abstract double alan();
    
    public String yaz(String isim)
    {
        this.isim=isim;
        return this.isim;
    }
    
}
