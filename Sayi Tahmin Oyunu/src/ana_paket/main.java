package ana_paket;
import java.util.Scanner;
public class main {
	
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Hangi aralikta tahmin istersiniz?\n");
		
		yapiciMethod sayi1 =new yapiciMethod();
		
		sayi1.a=girdi.nextInt();
		sayi1.b=girdi.nextInt();
		sayi1.rastgele();

	}


}
