#include <iostream>
using namespace std;

class WithoutCopyConstructor
{
    int *ptr;
public:
    WithoutCopyConstructor(int i=0)
    {
        ptr = new int(i);
    }
    ~WithoutCopyConstructor()
    {
        delete ptr;
    }
    void display()
    {
        cout << *ptr << endl;
    }
    void setValue(int i)
    {
        *ptr = i;
    }
};

class WithCopyConstructor
{
    int *ptr;
public:
    WithCopyConstructor(int i=0)
    {
        ptr = new int(i);
    }
    ~WithCopyConstructor()
    {
        delete ptr;
    }
    WithCopyConstructor(const WithCopyConstructor &obj)
    {
        ptr = new int;
        *ptr = *obj.ptr;
    }
    void display()
    {
        cout << *ptr << endl;
    }
    void setValue(int i)
    {
        *ptr = i;
    }
};

void function1(WithoutCopyConstructor obj)
{
    obj.display();
}

void function2(WithCopyConstructor obj)
{
    obj.display();
}

int main(){
    WithoutCopyConstructor obj1(10);
    function1(obj1); // two ways to resolve this for this situation. i) Either use refference to the main object or ii) implement the copy constructor for this class.
    obj1.display(); // since the dynamically allocated member variable was freed this will not show the intended output

    WithCopyConstructor obj2(20); // Solution to the problem with copy constructor implemented
    function2(obj2); 
    obj2.display();
    
    return 0;
}

/*
    Original Output:(with error message from the compiler)
        10
        0
        20
        20
        Section_B_5_a(78240,0x1ed34e080) malloc: Double free of object 0x13e606cb0
        Section_B_5_a(78240,0x1ed34e080) malloc: *** set a breakpoint in malloc_error_break to debug
        zsh: abort      ./Section_B_5_a
*/


/*
    Question :  What are the possible problems if we use "call by value" for passing an object to a
                function? Explain with an example. How can we solve this problem? Explain in details
                with the example you provided. 

    Answer :    If we use "call by value" for passing an object to a function, then the function will
                create a copy of the object and will work on the copy.
                This is fine if our intention wasn't to change the object itself. 
                But if we want to change the object itself, then we will have to use "call by reference".
                In "call by reference", the function will work on the original object itself.

                Another issue that can rise from this is when our object has memb er vaiables that use
                dynamically allocated memory. Since when copying the object the new object is simply created
                through bit-wise copy the new copied object's member varaibles also points to the same address 
                as our initial object's respective dynmaically allocated members did. While return the copied 
                object calls it Destructor which eventually can free up the memeory space thus resulting in double 
                free of the object member.

                In order to avoid this we can simply define copy constructor which will be called when copying 
                the object instead of plain bit-wise copy. We can work thourgh the logistics of our copy 
                ocnstructor so that this complication doesn't come up again.
 */