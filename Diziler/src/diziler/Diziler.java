
package diziler;


public class Diziler {

    public static void main(String[] args) {
        int[] dizi=new int[10];
        int x;
        
        for(x=0;x<dizi.length;x++)
        {
            dizi[x]=x+1;
        }
        for(x=0;x<dizi.length;x++)
        {
            
            System.out.println("indis: "+x+" degeri: "+dizi[x]);
            
        }
    }
    
}
