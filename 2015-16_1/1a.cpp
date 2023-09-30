#include <iostream>
#include <sstream>
using namespace std;

class Date
{
    int date, month, year;

public:
    Date()
    {
    }

    Date(int date, int month, int year)
    {
        this->date = date;
        this->month = month;
        this->year = year;
    }

    friend istream &operator>>(istream &in, Date &d)
    {
        string str;
        cout << "Enter date in Bangladeshi form: ";
        in >> str;

        for (int i = 0; i < str.size(); i++)
        {
            if (str[i] == '/')
                str[i] = ' ';
        }
        stringstream ss(str);
        ss >> d.date >> d.month >> d.year;
        return in;
    }

    friend ostream &operator<<(ostream &out, Date &d)
    {
        out << d.year << "/" << d.month << "/" << d.date;
        return out;
    }
};

int main()
{
    Date d;
    cin >> d;
    cout << d;
}
