#include <iostream>
#include <cstring>
#include <map>
using namespace std;

class student
{
    int stdId;
    char name[20];
    char address[100];
    int mobileNo;
    double cgpa;

public:
    student(int stdId, char *name, char *address, int mobileNo, double cgpa)
    {
        this->stdId = stdId;
        strcpy(this->name, name);
        strcpy(this->address, address);
        this->mobileNo = mobileNo;
        this->cgpa = cgpa;
    }

    int getStdId()
    {
        return stdId;
    }

    void display()
    {
        cout << "Student ID: " << stdId << endl;
        cout << "Name: " << name << endl;
        cout << "Address: " << address << endl;
        cout << "Mobile No: " << mobileNo << endl;
        cout << "CGPA: " << cgpa << endl;
    }
};

int main()
{

    // assume student id is integer
    map<int, student> m;

    int n; // number of students
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int stdId;
        char name[20];
        char address[100];
        int mobileNo;
        double cgpa;

        cin >> stdId >> name >> address >> mobileNo >> cgpa;

        student s(stdId, name, address, mobileNo, cgpa);
        s.display();

        m.insert(make_pair(stdId, s)); // making pair and insert student object into map
    }

    int q; // number of queries
    cin >> q;
    for (int i = 0; i < q; i++)
    {
        int stdId;
        cin >> stdId;

        // finds stdid in map and displays it
        for (auto std : m)
        {
            if (std.first == stdId)
            {
                std.second.display();
                break;
            }
        }
    }
}