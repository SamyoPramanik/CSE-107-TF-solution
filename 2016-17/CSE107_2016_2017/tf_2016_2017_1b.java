// import java.util.ArrayList;

class boxingClass{
    public Integer value;
    boxingClass(Integer a){
        value = a;
    }
}



public class tf_2016_2017_1b {



    public static void swap(boxingClass [] arr){

        // // arraylist to hold the values
        // ArrayList<Integer> tmp = new ArrayList<>();
        // tmp.add(a);
        // tmp.add(b);

        // // swapping the valued inside arrayList
        // Integer tempValue = tmp.get(0);
        // tmp.set(0, tmp.get(1));
        // tmp.set(1, tempValue);

        // a = tmp.get(0);
        // b = tmp.get(1)
        // Integer tmp = a;
        // a = b;
        // b = tmp;
        
        // return new Integer[]{a, b};

        int tmp = arr[0].value;
        arr[0].value = arr[1].value;
        arr[1].value = tmp;

        // System.out.println(arr[0] + ", " + arr[1]);
    }
    public static void main(String [] args){
        boxingClass a = new boxingClass(5);
        boxingClass b = new boxingClass(10);
        System.out.println("Before swapping: " + a.value + ", " + b.value);
        boxingClass [] arr = new boxingClass[2];

        arr[0] = a;
        arr[1] = b;
        swap(arr);
        // arr[0].value = 100;
        // Integer [] swapped = swap(a, b);
        // a = swapped[0];

        // b = swapped[1];
        System.out.println("After swapping: " + a.value + ", " + b.value);
    }
}
