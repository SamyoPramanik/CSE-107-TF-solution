#include <iostream>
#include <string>
using namespace std;
class Date
{
    int day, month, year;

public:
    Date(int m, int d, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    int operator-(Date &temp)
    {
        int days = abs(day - temp.day + (month - temp.month) * 30 + (year - temp.year) * 360);
        return days;
    }

    friend ostream &operator<<(ostream &out, Date &temp);
};

ostream &operator<<(ostream &out, Date &temp)
{
    out << temp.day << "-" << temp.month << "-" << temp.year; // "out"
    return out;
}

int main()
{
    Date d1(1, 1, 2012), d2(12, 30, 2011);
    cout << "Difference between two dates is: " << d1 - d2 << endl;
    cout << d1 << endl;
    cout<<d2<<endl;
    return 0;
}
