package ana_paket;
import java.util.Scanner;
public class yapiciMethod 
{
	Scanner girdi = new Scanner(System.in);
	public int a;
	public int b;
	public int c;
	public int d;
	public int sayac=1;
	public int puan=100;
	
	
	
	public void rastgele()
	{
		System.out.println("Ilk tahminde 100 kalan tahminlerde bilirseniz tam puanýn deneme sayýnýza oranýnda puan alirsiniz.");
		System.out.println("Tahmin gir.Toplam 5 hakkiniz vardir.");
		this.c=(a+(int)(Math.random()*this.b));
		System.out.println("Caktirma Panpa programi test ediyorum. Random deger:"+c);
		this.d=girdi.nextInt();
		if(this.c==this.d)
		System.out.println("BINGO! Tam 100 puan aldiniz.");	
		kalanIhtimaller();
	}
	public void kalanIhtimaller()
	{
	while(this.c!=this.d)
	{
	 int formul=puan/sayac;
			if(sayac==5)
			{
				System.out.println("Butun deneme haklariniz bitti.");
				break;
			}
		System.out.println("Yanlis tahmin tekrar deneyin."+(5-sayac)+"hakkiniz kaldi.");
		if(this.c>this.d)
		{
			System.out.println("sayi"+this.d+"ile"+b+"arasindadir.");
			System.out.println("Tahmin gir.");
			this.d=girdi.nextInt();
			sayac++;
			if(this.c==this.d)
			{
			System.out.println("BINGO! Tam "+formul+" puan aldiniz.");
			break;
			}
			else
				System.out.println("Yanlis tahmin.");
	    }
		
		if(this.c<this.d)
		{
			System.out.println("sayi"+a+"ile"+this.d+"arasindadir.");
			System.out.println("Tahmin gir.");
			this.d=girdi.nextInt();
			sayac++;
			if(this.c==this.d)
			{
			System.out.println("BINGO! Tam "+formul+" puan aldiniz.");
			break;
			}
			else
				System.out.println("Yanlis tahmin.");
		}
				
	}
		
	}
}
