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
    int operator-(Date& temp)
    {
        int days = abs(day - temp.day)+abs(month - temp.month)*30+abs(year - temp.year)*365;
    }
    friend ostream& operator<<(ostream& out, Date& temp);
};

ostream& operator<<(ostream& out, Date& temp)
{
    out << temp.day << "-" << temp.month << "-" << temp.year;  // "out"
    return out;
}

int main()
{
    Date d1(1, 1, 2000), d2(1, 1, 2001);
    cout << "Difference between two dates is: " << d1 - d2 << endl;
    cout << d1 << endl;     
    return 0;
}
