package threadler;
public class Threadler 
{
    public static void main(String[] args) 
    {
        CharYaz yaz1=new CharYaz("ada ",7);
        RakamYaz yaz2=new RakamYaz(5,4);
        CharYaz yaz3=new CharYaz("sakarya ",7);
        RakamYaz yaz4=new RakamYaz(4,7);
        
        Thread is1=new Thread(yaz1);
        is1.start();
        
        Thread is2=new Thread(yaz2);
        is2.start();
        
        Thread is3=new Thread(yaz3);
        is3.start();
        
        Thread is4=new Thread(yaz4);
        is4.start();
        
    }
    
}
