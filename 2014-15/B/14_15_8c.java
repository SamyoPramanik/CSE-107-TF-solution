import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class tf {
    public static void main(String[] args) {
        List<String> fileTexts=new ArrayList<>();
        try{
        BufferedReader br=new BufferedReader(new FileReader("F:/TF_Codes_1_2-main/src.txt"));
        String line;
        while((line=br.readLine())!=null)
        {
            fileTexts.add(new String(line));
        }
         br.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }finally{
           
        }
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("F:/TF_Codes_1_2-main/dst.txt"));
            for(String l:fileTexts)
            {
                bw.write(l);
                bw.newLine();
            }
            bw.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }finally{
           // bw.close();
        }

    }
}