#include <iostream>
#include <cstring>

using namespace std;

template <class T>
int find(T obj, T *list, int size)
{
    for (int i = 0; i < size; i++)
    {
        if (list[i] == obj)
            return i;
    }

    return -1;
}

int main()
{
    char str[] = "Samyo Pramanik";

    int idx = find('z', str, strlen(str));
    cout << idx << endl;
}