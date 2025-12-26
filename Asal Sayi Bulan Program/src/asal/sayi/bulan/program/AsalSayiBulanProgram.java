package asal.sayi.bulan.program;
import java.util.Scanner;
public class AsalSayiBulanProgram 
{
    public static void main(String[] args) 
    {
        Scanner girdi=new Scanner(System.in);
        int deger=girdi.nextInt();
        int kalan=1;
        if(deger==1)
               {
                   System.out.println("Bir sayisi asal olamaz!");
               }
        else
        {
            try
       {
           for(int i=2;i<deger;i++)
           {       
               kalan=deger%i;
               if(kalan==0)
               {
                   System.out.println("Girilen sayi asal değildir!");
                   break;
               }
           }
           if(kalan==1)
           {
                   System.out.println("Girilen sayi asaldir!");
           }
       }
       catch(Exception e)
       {
           System.out.println("Hatali giris yaptiniz!");
       }
        }
           }
}
