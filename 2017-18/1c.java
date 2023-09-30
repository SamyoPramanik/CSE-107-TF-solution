// Unfinished
// Need to explain why test mathod can access Inner class even tho it is declared later

public class solve{
    public static void main(String[] args) {
        class Outer{
            int outer_x = 5;
            void test(){
                Inner inner = new Inner();
                inner.display();
            }
            class Inner{
                int z = 60;
                void display(){
                    System.out.println(outer_x);
                }
            }
            void showz(){
                // System.out.println(z);
                /* 
                  The above line will cause error since  z variable is declared
                  in the Inner class and is not directly accessible
                  from the Outer class's showz() method. 
                */
            }
        }
    }
}


/*
    Question: What is an inner class?
    Ans: An inner class is a class that is defined inside another class.
*/