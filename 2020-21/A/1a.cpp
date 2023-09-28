#include <iostream>
using namespace std;

// Abstract Base Class: Vehicle
class Vehicle
{
public:
    virtual void start() = 0; // Pure virtual function
    virtual void stop() = 0;  // Pure virtual function
};

// Concrete Derived Class: Car
class Car : public Vehicle
{
public:
    void start()
    {
        cout << "Car started." << endl;
    }

    void stop()
    {
        cout << "Car stopped." << endl;
    }
};

// Concrete Derived Class: Bicycle
class Bicycle : public Vehicle
{
public:
    void start()
    {
        cout << "Bicycle started pedaling." << endl;
    }

    void stop()
    {
        cout << "Bicycle stopped." << endl;
    }
};

int main()
{
    Car car;
    Bicycle bicycle;

    // Polymorphism using abstraction
    Vehicle *vehicle1 = &car;
    Vehicle *vehicle2 = &bicycle;

    vehicle1->start(); // Calls Car's start method
    vehicle1->stop();  // Calls Car's stop method

    vehicle2->start(); // Calls Bicycle's start method
    vehicle2->stop();  // Calls Bicycle's stop method

    return 0;
}
