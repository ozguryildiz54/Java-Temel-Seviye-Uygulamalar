package soyut.sınıflar;
public class SoyutSınıflar {
    public static void main(String[] args) {
        Ucgen u=new Ucgen(3,5);
        Daire d=new Daire(6);
        
        System.out.println("Sinif : "+u.yazdir());
        System.out.println("Alan : "+u.alan());
        System.out.println("----------------------");
        
        System.out.println("Sinif : "+d.yazdir());
        System.out.println("Alan : "+d.alan());
    }
    
}









