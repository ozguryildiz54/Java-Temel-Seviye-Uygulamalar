package çok.biçimlilik;
public class ÇokBiçimlilik {
    public static void main(String[] args) {
        
        calisan c=new calisan("Ozgur","YILDIZ");
        isci i=new isci("YILDIZ","OZGUR");

        c.yaz();
        c=i;
        c.yaz();
        
        /*
        //-----------------------------------------
        //eger çok biçimlilik olmasaydı bu sekilde sürekli if blokları ile kontrol etmemiz gerekirdi.
        //erken bağlama derleme anında karar verilmesi buna örnek olarak if bloğu
        if(c instanceof calisan)
        {
            calisan c1=c;
            c1.yaz();
        }
        else if(c instanceof isci)
        {
            isci i1=(isci) c;
            i1.yaz();
        }
        //-----------------------------------------
         /*
        
        //-----------------------------------------
        //genişletilebilirlik yöntemi
        calisan[] c=new calisan[2];
        int indis;
        
        for(int i=0;i<2;i++)
        {
            indis=((int)(Math.random()*2));
            switch(indis)
            {
                case 0:
                    c[indis]=new isci("Ozgur","YIldız");
                    c[indis].yaz();
                    break;
                case 1:
                    c[indis]=new calisan("YILDIZ","Ozgur");
                    c[indis].yaz();
                    break;
            }
            
        }
        */
        //-----------------------------------------
        /*
         calisan c=new calisan("Ozgur","YILDIZ");
         isci i=new isci("YILDIZ","OZGUR");
         System.out.println(c.getClass());
         System.out.println(i.getClass());
        //-----------------------------------------
        */
                    

    }
}
