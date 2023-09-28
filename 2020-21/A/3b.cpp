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

    char *c = new char;
    int count = 0; // stores number of characters in file

    fin.seekg(0, ios::end);
    count = fin.tellg();

    cout << "File size: " << count << " bytes" << endl;
}