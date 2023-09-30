#include <iostream>
#include <map>
using namespace std;

class Employee
{
    int id;
    string name;
    string qualification;
    string designation;
    double salary;

public:
    Employee() {}

    Employee(int id, string name, string qualification, string designation, double salary)
    {
        this->id = id;
        this->name = name;
        this->qualification = qualification;
        this->designation = designation;
        this->salary = salary;
    }

    void setName(string name)
    {
        this->name = name;
    }

    void setQualification(string qualification)
    {
        this->qualification = qualification;
    }

    void setDesignation(string designation)
    {
        this->designation = designation;
    }

    void setSalary(double salary)
    {
        this->salary = salary;
    }

    void setId(int id)
    {
        this->id = id;
    }

    int getId()
    {
        return id;
    }

    string getName()
    {
        return name;
    }

    string getQualification()
    {
        return qualification;
    }

    string getDesignation()
    {
        return designation;
    }

    double getSalary()
    {
        return salary;
    }
};

class Database
{
    map<int, Employee> employees;

public:
    void addEmployee(Employee employee)
    {
        employees[employee.getId()] = employee;
    }

    void removeEmployee(int id)
    {
        employees.erase(id);
    }

    void updateEmployee(int id, Employee employee)
    {
        employees[id] = employee;
    }

    Employee searchEmployee(int id)
    {
        return employees[id];
    }

    void showAll()
    {
        for (map<int, Employee>::iterator it = employees.begin(); it != employees.end(); it++)
        {
            cout << it->second.getName() << endl;
        }
    }
};

int main()
{
    Database database;
    database.addEmployee(Employee{1, "Rahul", "B.Tech", "Software Engineer", 50000});
    database.addEmployee(Employee{2, "Rohit", "B.Tech", "Software Engineer", 50000});
    database.addEmployee(Employee{3, "Raj", "B.Tech", "Software Engineer", 50000});

    Employee employee = database.searchEmployee(1);
    cout << employee.getName() << endl;

    database.removeEmployee(1);
    employee = database.searchEmployee(1);
    cout << employee.getName() << endl;

    database.updateEmployee(2, Employee{2, "Rohit", "B.Tech", "Senior Software Engineer", 60000});
    employee = database.searchEmployee(2);
    cout << employee.getDesignation() << endl;
    database.showAll();
}