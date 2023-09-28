#include <iostream>
using namespace std;

class TwiceArray
{
    int *arr;

public:
    TwiceArray(int *values)
    {
        this->arr = values;
    }

    TwiceArray(const TwiceArray &obj)
    {
        this->arr = obj.arr;
        for (int i = 0; i < 4; i++)
            arr[i] *= 2;
    }

    void print()
    {
        for (int i = 0; i < 4; i++)
            cout << arr[i] << " ";
        cout << endl;
    }
};

int main()
{
    int arr[] = {1, 2, 3, 4};
    TwiceArray orginal(arr);
    TwiceArray copied = orginal;

    orginal.print();
    copied.print();
}