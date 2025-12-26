package soyut.sınıflar;
public class Daire extends Sekil{
    double r;
    double PI=3.14;
    
     public Daire(double r)
    {
        this.r=r;
    }
    
    public double alan()
    {
        return PI*r*r;
    }
    
   public String yazdir()
    {
        return yaz("Daire");
    }
}
