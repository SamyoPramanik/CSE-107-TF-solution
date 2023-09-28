#include <bits/stdc++.h>
using namespace std;

template<class X>
X cubic(X item)
{
    return item * item * item;
}

int main()
{
    list<int> v;
    for(int i = 0; i < 10; i++)
    {
        v.push_back(i);
    }
    transform(v.begin(), v.end(), v.begin(), cubic<int>);
    list<int>::iterator it = v.begin();
    while(it != v.end())
    {
        cout << *it << ' ';
        ++it;
    }
    cout << '\n';

    return 0;
}