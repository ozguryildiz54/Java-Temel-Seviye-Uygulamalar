package method.overloading;

public class MethodOverloading {

    public static void main(String[] args) {
        int birinciSayi=8;
        int ikinciSayi=5;
        
        double sayi1=8.5;
        double sayi2=5.8;
        
        int mutlakFark=farkiniAl(birinciSayi,ikinciSayi);
        System.out.println(birinciSayi+" ve"+ikinciSayi+" in mutlak farki"+mutlakFark);
        
        double mutlakFarkDouble=farkiniAl(sayi1,sayi2);
        System.out.println(sayi1+" ve"+sayi2+" in mutlak farki"+mutlakFarkDouble);
    }
    
    public static int farkiniAl(int x, int y)
    {
        int farkiniAl;
        if(x>y)
        {
            farkiniAl=x-y;
        }
        else
        {
            farkiniAl=y-x;
        }
        
        return farkiniAl;
    }
    
    public static double farkiniAl(double x, double y)
    {
        double farkiniAl;
        if(x>y)
        {
            farkiniAl=x-y;
        }
        else
        {
            farkiniAl=y-x;
        }
        
        return farkiniAl;
    }
}
