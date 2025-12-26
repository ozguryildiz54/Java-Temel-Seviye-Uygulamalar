package MetotOverriding;
public class MetotOverriding extends metot{

     @Override
     public void mesaj()
    {
        System.out.println("YILDIZ Ozgur");
    }
    
    public static void main(String[] args) {
       MetotOverriding cikti=new MetotOverriding();
       cikti.mesaj();
    }
    
}
