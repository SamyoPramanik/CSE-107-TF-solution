#include <iostream>
using namespace std;

class myClass{
    int x;
public:
    myClass(int x=0){
        this->x = x;
    }
    void print(){
        cout << x << endl;
    }
};

int main(){
    myClass ob[2] = {-1,-2}; // This is a valid way of initializing the array
    ob[0].print();
    ob[1].print();
}

/*
Output:
        -1
        -2
*/

/*
    Question:   Consider the following statement inside main function:    
                            myClass ob[2] = {-1, -2 };
                Is this a valid statement? If yes, then what does it mean? If no, then what is the problem?

    Answer:     Yes, this is a valid statement. 
                If a class type includes a constructor, an array of objects can be initialized.
                This is a shorthand form of a more formal initialization like-
                            mtClass ob[2] = {myClass(-1), myClass(-2)};
*/