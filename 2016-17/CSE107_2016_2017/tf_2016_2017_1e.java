public class tf_2016_2017_1e {
    public static int minmax(String str, int ... intArr){
        if(str.equals("min")){
            int min = Integer.MAX_VALUE;
            for(var x: intArr){
                if(x < min) min = x;
            }
            return min;
        }
        else if(str.equals("max")){
            int max = Integer.MIN_VALUE;
            for(var x: intArr){
                if(x > max) max = x;
            }
            return max;
        }
        return -1;
    }

    public static void main(String [] args){
        int a = minmax("min", 2, 1, 6, 4, 5);
        int b = minmax("min", 3, 0, 6);
        int c = minmax("max", 1, 2, 6, 5);
        int d = minmax("max", 1, 3, 7);

        // System.out.println(a + ", " + b + ", " + c + ", " + d);

    }
}
