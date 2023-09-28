
(c) Give an example scenario where you will use a static member variable for a class.


#include <iostream>
using namespace std;
class Student {
private:
    string name;

    
    static int count;
public:
    
    Student(string name){
        this->name = name;
        // Increment the count of students when a new object is created
        ++count;
    }

    
    ~Student() {
        // Decrement the count of students when an object is destroyed
        --count;
    }

    // Static member function to get the count of students
    static int getCount() {
        return count;
    }


};

// Initialize the static member variable count to 0
int Student::count = 0;

int main() {
    Student s1("Alice");
    Student s2("Bob");
    Student s3("Charlie");

    cout << "Total number of students: " << Student::getCount() << endl;



    return 0;
}


