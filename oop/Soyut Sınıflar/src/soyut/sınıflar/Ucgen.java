package soyut.sınıflar;
public class Ucgen extends Sekil{
    double taban;
    double yukseklik;
    public Ucgen(double taban, double yukseklik)
    {
        this.taban=taban;
        this.yukseklik=yukseklik;
    }
    public double alan()
    {
        return (taban*yukseklik)/2;
    }
    
    public String yazdir()
    {
        return yaz("Ucgen");
    }
}
