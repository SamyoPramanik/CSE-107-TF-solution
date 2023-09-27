package tf_2016_2017_1d;

import tf_2016_2017_1d.OuterClass2.InnerClass2;

class OuterClass2{
    // additional logic if needed
    public class InnerClass2{
        // additional logic if needed
    }
}

public class NestedDemoNonStatic {
    public static void main(String[] args) {
        OuterClass2 obj = new OuterClass2();

        var innerClass = obj.new InnerClass2();

        // do something with the inner class
    }
}
