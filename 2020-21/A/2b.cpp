#include <iostream>
#include <cstring>
using namespace std;

class vector
{
    double x, y, z;
    char *description;

public:
    vector(double a = 0, double b = 0, double c = 0, char *description = NULL)
    {
        x = a;
        y = b;
        z = c;

        if (description != NULL)
        {
            this->description = new char[strlen(description) + 1];
            strcpy(this->description, description);
        }
        else
            this->description = NULL;
    }

    vector(const vector &v)
    {
        x = v.x;
        y = v.y;
        z = v.z;

        if (v.description != NULL)
        {
            description = new char[strlen(v.description) + 1];
            strcpy(description, v.description);
        }
        else
            description = NULL;
    }

    vector operator+(vector v)
    {
        vector temp(0, 0, 0);

        temp.x = x + v.x;
        temp.y = y + v.y;
        temp.z = z + v.z;

        temp.description = new char[strlen(description) + strlen(v.description) + 2];
        strcpy(temp.description, description);
        strcat(temp.description, " ");
        strcat(temp.description, v.description);

        return temp;
    }

    vector operator=(vector v)
    {
        x = v.x;
        y = v.y;
        z = v.z;

        if (v.description != NULL)
        {
            description = new char[strlen(v.description) + 1];
            strcpy(description, v.description);
        }
        else
            description = NULL;
    }

    vector operator+=(vector v)
    {
        x += v.x;
        y += v.y;
        z += v.z;

        if (v.description != NULL)
        {
            char *temp = new char[strlen(description) + 1];
            strcpy(temp, description);
            description = new char[strlen(description) + strlen(v.description) + 2];
            strcpy(description, temp);
            strcat(description, " ");
            strcat(description, v.description);
        }

        return *this;
    }

    vector operator+(double d)
    {
        vector temp(0, 0, 0);

        temp.x = x + d;
        temp.y = y + d;
        temp.z = z + d;

        temp.description = new char[strlen(description) + 1];
        strcpy(temp.description, description);

        return temp;
    }

    friend vector operator+(double d, vector v)
    {
        vector temp(0, 0, 0);

        temp.x = v.x + d;
        temp.y = v.y + d;
        temp.z = v.z + d;

        temp.description = new char[strlen(v.description) + 1];
        strcpy(temp.description, v.description);

        return temp;
    }

    // used for testing only
    void display()
    {
        cout << x << " " << y << " " << z << " " << description << endl;
    }
};

int main()
{
    vector v1(1, 2, 3, "v1");
    vector v2(4, 5, 6, "v2");
    vector v3;

    v3 = v1 + v2;
    v3.display();

    vector v4;
    vector v5(7, 8, 9, "v5");

    v4 = v5 + 10;
    v4.display();

    v4 = v5 += v1;
    v4.display();
    v5.display();

    v4 = 10 + v5;
    v4.display();
}