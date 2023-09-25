/*
static variable is not an object property.Actually it's the property of whole class 

*/
#include <iostream>
using namespace std;

class Student {

    string name;
    int id;
    
    static int studentCount; // Static member variable to count the number of students

public:
    Student(string name, int id) {
        this->name = name;
        this->id = id;
        studentCount++; // Increment the student count for each new student
    }

    static int getStudentCount() {
        return studentCount;
    }
};

int Student::studentCount = 0; // Initialize the static member variable

int main() {
    Student s1("XO", 2105019);
    Student s2("YO", 2105020);
    Student s3("ZO", 2105021);
    Student s4("PO", 2105022);
    Student s5("QO", 2105023);
    Student s6("RO", 2105024);

   cout << "Total students: " << s1.getStudentCount() <<endl;
   return 0;
}
