#include <iostream>
#include <string>
using namespace std;

class tollbooth
{
private:
    string regNumber[100];
    unsigned int totalCars;
    double totalMoney;

public:
    // getter
    unsigned int getTotalCars()
    {
        return totalCars;
    }

    double getTotalMoney()
    {
        return totalMoney;
    }

    // constructor
    tollbooth()
    {
        totalCars = 0;
        totalMoney = 0;
    }

    // to add a car who paid the toll
    void payingCar()
    {
        totalCars++;
        totalMoney += 0.5;
    }

    // to add a car who didn't pay the toll
    void nopayCar()
    {
        totalCars++;
    }

    void display()
    {
        cout << "Car registration numbers: " << endl;

        for (int i = 0; i < totalCars; i++)
        {
            cout << regNumber[i] << endl;
        }

        cout << "Total cars: " << totalCars << endl;
        cout << "Total money: " << totalMoney << endl;
    }
};