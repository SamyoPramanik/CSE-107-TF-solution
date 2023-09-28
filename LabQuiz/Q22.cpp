#include <iostream>
#include <sstream>

using namespace std;
class Course
{
    string name;
    string courseID;
    float credit;

public:
    Course() { credit = 0; }
    Course(string name, string courseID, float credit)
    {
        this->name = name;
        this->courseID = courseID;
        this->credit = credit;
    }

    template <class T>
    string toString(T a)
    {
        string s, s1;
        stringstream ss(s);
        ss << a;
        ss >> s1;
        return s1;
    }

    string operator[](int i)
    {
        switch (i)
        {
        case 0:
            return toString(name);
            break;
        case 1:
            return toString(courseID);
            break;
        case 2:
            return toString(credit);
            break;

        default:
            break;
        }
    }
};
class Student
{
    string name;
    string stdId;
    Course *courses;
    int courseCount;

public:
    Student(string name, int numCourses)
    {
        this->name = name;
        courses = new Course[numCourses];
        courseCount = 0;
    }

    Student(string name, string stdId, int numCourses)
    {
        this->name;
        this->stdId = stdId;
        courses = new Course[numCourses];
        courseCount = 0;
    }

    void addCourse(Course course)
    {
        courses[courseCount++] = course;
    }

    Course operator[](int i)
    {
        return courses[i];
    }
};

int main()
{
    Course c1("OOP", "CSE108", 3);
    Course c2("DSA-I", "CSE106", 3);
    Student alex("Alex", "2105182", 5);
    alex.addCourse(c1);
    alex.addCourse(c2);
    cout << alex[0][0] << endl; // print name of the first course
    cout << alex[1][1] << endl; // print courseID of the second course
    cout << alex[0][2] << endl; // print credit of the first course return 0;
}