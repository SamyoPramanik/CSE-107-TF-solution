public class solve {
    public static void main(String[] args) {

        // Boxing: Converting int to Integer
        int primitiveInt = 42;
        Integer boxedInt = Integer.valueOf(primitiveInt);

        // Unboxing: Converting Integer to int
        Integer boxedInt2 = new Integer(42);
        int primitiveInt2 = boxedInt2.intValue();
    }
    
}

/*
    What are boxing and unboxing?
    Answer:
        Boxing: This operation involves converting a primitive data type to its wrapper class object. 
        It's primarily used when you need to use a primitive data type in a context that expects an object.

        Unboxing: This operation involves converting a wrapper class object to a primitive data type.
        It's primarily used when you need to use a wrapper class object in a context that expects a primitive data type.
*/
