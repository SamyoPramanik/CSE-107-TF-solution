#include<iostream>
using namespace std;


class person{
    protected:
    string name;
    int age;

    public:
    person(string name, int age){
        this->name = name;
        this->age = age;
    }

    //virtual function
    virtual void show(){
        cout<<"person-> name: "<<name<<" age: "<<age<<endl;
    }

    //pure virtual function
    virtual void job()=0;

};

class student: public person{
int id;

public:
    student(string name, int age, int id):person(name,age){
        this->id = id;
    }

    void show(){
        cout<<"student-> name: "<<name<<" age: "<<age<<" Id: "<<id<<endl;
    }
    
    void job(){
        cout<<"Job: Student"<<endl;
    }
};

int main(int argc, char const *argv[])
{
    student stu("Robin",21,19);
    person &base = stu;

    base.show();
    base.job();
    return 0;
}

