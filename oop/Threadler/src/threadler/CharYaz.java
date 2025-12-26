package threadler;
public class CharYaz implements Runnable
{
    public String karakter;
    public int yazimSayisi;
    public int i;
    
    public CharYaz(String karakter, int yazimSayisi)
    {
        this.karakter=karakter;
        this.yazimSayisi=yazimSayisi;
    }
    
    public void run()
    {
        for(i=0;i<yazimSayisi;i++)
        {
            Thread yaz5=new Thread(new RakamYaz(0,4));
            yaz5.start();
            
            try
            {
                for(i=0;i<this.yazimSayisi;i++)
                {
                    System.out.print(karakter);
                    if(i==5)
                    {
                        yaz5.join();
                    }
                }
            }
            catch(InterruptedException e)
            {
                System.err.println(e);
            }
        }
    }
    
}
