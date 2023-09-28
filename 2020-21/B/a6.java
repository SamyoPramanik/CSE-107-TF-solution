import java.util.Scanner;

class MyStringTokenizer {
    private String[] arr;
    private int cnt;
    public MyStringTokenizer(String str, String delim)
    {
        arr = str.split(delim);
        cnt = 0;
    }
    public int countTokens() {
        return arr.length;
    }
    public boolean hasMoreTokens() {
        if(cnt >= arr.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public String nextToken() {
        ++cnt;
        return arr[cnt-1];
    }
}

public class a6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        MyStringTokenizer st = new MyStringTokenizer(s, ",");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        sc.close();
    }
}