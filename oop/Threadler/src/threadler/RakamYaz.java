package threadler;
public class RakamYaz implements Runnable
{
    public int rakam;
    public int yazimSayisi;
    public int i;
    
    public RakamYaz(int rakam, int yazimSayisi)
    {
        this.rakam=rakam;
        this.yazimSayisi=yazimSayisi;
    }
    
     public void run()
    {
        for(i=0;i<yazimSayisi;i++)
        {
            System.out.print(rakam);
        }
    }
}
