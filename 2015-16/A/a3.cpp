#include <bits/stdc++.h>
using namespace std;

ostream& setup(ostream& out, double num)
{
    int deg = static_cast<int>(num);
    double min = (num - deg) * 60.0;
    out << deg << " deg " << fixed << setprecision(2) << min << " min";
    return out;
}

class Place
{
    char name[40];
    double latitude, longitude;

public:
    friend istream& operator>>(istream& in, Place& p)
    {
        cout << "Enter name of place: ";
        in >> p.name;
        cout << "Enter latitude of " << p.name << ": ";
        in >> p.latitude;
        cout << "Enter longitude of " << p.name << ": ";
        in >> p.longitude;
        return in;
    }

    friend ostream& operator<<(ostream& out, Place& p)
    {
        out << p.name << " (" << setup << p.latitude << ", " << setup << p.longitude << ")";
        return out;
    }
};

int main()
{
    Place p;
    cin >> p;
    cout << p;

    return 0;
}
