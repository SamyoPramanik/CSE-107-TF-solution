public class Ques4A {
    static int f(Integer v) {
        return v; // v is getting auto unboxed
    }

    public static void main(String args[]) {
        
        Integer a = f(100);
        // int 100 is getting autoboxed
        // return value is also autoboxed

        Integer iOb, iOb2;
        int i;

        iOb = 100; // int 100 is getting autoboxed

        ++iOb;
        // iob first auto unboxes
        // then it increments the int
        // finally reboxes again

        iOb2 = iOb + (iOb / 3);
        // iob unboxes
        // expression gets evaluated
        // iob gets reboxed and assigend

        i = iOb + (iOb / 3);
        // // iob unboxes
        // expression gets evaluated
        // but it does not get reboxed

        Integer intOb = 100; // int 100 is getting autoboxed
        Double doubleOb = 98.6; // double 98.6 is getting autoboxed
        
        doubleOb = doubleOb + intOb; 
        // doubleOb and intOb gets unboxed
        // expression executes
        // gets converted and reboxod as Double object and gets assigned
    }
}
