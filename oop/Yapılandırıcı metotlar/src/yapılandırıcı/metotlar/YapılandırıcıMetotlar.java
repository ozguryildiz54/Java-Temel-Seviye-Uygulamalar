package yapılandırıcı.metotlar;
public class YapılandırıcıMetotlar extends kisi {
 public YapılandırıcıMetotlar(String ad, String soyad, int yasi)
    {
        super(ad,soyad,yasi);
    }
    public static void main(String[] args) {
        kisi insan=new kisi("YILDIZ","Ozgur",20);
        insan.kisiAdi="emre";
        insan.yazdir();
        
        kisi people=new kisi("Ozgur","YILDIZ",22);
        people.yazdir();
        int a=5;
        int b=0;
        int c=b+a;
        System.out.println(c);
    }
}
