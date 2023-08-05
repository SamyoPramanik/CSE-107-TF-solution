#include <iostream>
#include <fstream>
using namespace std;

int main(int argc, char *argv[])
{
    ifstream fin(argv[1]);

    if (!fin)
    {
        cout << "File not found" << endl;
        return 1;
    }

    char c;
    int count = 0;   // stores number of characters in file
    while (fin >> c) // takes input until eof
    {
        count++;
    }

    cout << "File size: " << count << " bytes" << endl;
}