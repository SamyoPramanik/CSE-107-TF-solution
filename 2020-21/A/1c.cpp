#include <iostream>
#include <string>
#include <list>

using namespace std;

class tollbooth{
    list<string> lst;
    u_int cars;
    double amount;
    public:
    tollbooth(){
        cars = amount = 0;
    }

    list<string> getList() const {
        return lst;
    }

    double getAmount() const{
        return amount;
    }

    u_int getCars() const{
        return cars;
    }
    // no setter should be needed as the system is automated and adding setter options
    // might make it vulnerable to corrupted information
    void payingCar(string registration_no){
        cars++;
        amount += 0.5;
        lst.push_back(registration_no);
    }

    void noPayingCar(string registration_no){
        cars++;
        lst.push_back(registration_no);
    }

    void display() const{
        for(auto itr: lst){
            cout << itr << endl;
        }
        cout << "Total Cars : " << cars << endl << "Total amount: " << amount << endl;
    }
};
