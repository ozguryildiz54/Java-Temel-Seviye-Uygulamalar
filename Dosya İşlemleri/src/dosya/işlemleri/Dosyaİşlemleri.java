package dosya.işlemleri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Dosyaİşlemleri 
{
    public static void main(String[] args) throws IOException
    {
        File f=new File("D:/Basamakjava.txt");
        FileReader fr=new FileReader(f);
        FileWriter fw=new FileWriter(new File("D:/Degismisti.txt"));
        
        BufferedReader br=new BufferedReader(fr);
        BufferedWriter bw=new BufferedWriter(fw);
        String satir;
        satir=br.readLine();
        while(satir!=null)
        {
            System.out.println(satir);
            satir=br.readLine();
            bw.write(String.valueOf(satir));
            bw.newLine();
        }
        
        br.close();
        bw.close();
        
        /*
        char okunan[]=new char[(int)f.length()];
        fr.read(okunan);
        String okunan_String=new String(okunan);
        okunan_String=okunan_String.replace(" ","#");
        System.out.println(okunan_String);
        fw.write(okunan_String);
        fr.close();
        fw.close();
        */
    }
    
}
