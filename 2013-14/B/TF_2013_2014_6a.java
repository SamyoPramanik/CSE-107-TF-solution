
import java.io.BufferedReader;
import java.io.FileReader;


public class TF_2013_2014_6a {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("./text.txt"));
            int count = 0;
            boolean flag = false;

            while(true){
                count++;
                String line = br.readLine();
                if(line == null){
                    break;
                }
                String[] arr = line.split(" ");
                
                for(var s: arr){
                    if(s.equals("Bangladesh")){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
                
            }
            if(flag){
                System.out.println(count);
            }
            
            br.close();
        } catch(Exception e){
            System.out.println("comes here");
            e.printStackTrace();
        }
    }
}
