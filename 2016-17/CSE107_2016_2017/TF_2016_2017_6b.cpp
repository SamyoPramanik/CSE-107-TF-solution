#include <iostream>

using namespace std;

class ListItem{
    int item;
    ListItem * next;

    public:
    ListItem(int item){
        this->item = item;
        next = NULL;
    }

    int getItem(){
        return item;
    }

    void setNext(ListItem * next){
        this->next = next;
    }

    ListItem * getNext() const{
        return next;
    }
};

class List{
    private:
    ListItem* head;
    ListItem * tail;
    public:
    List(){
        head = tail = NULL;
    }
    virtual void store(int item) = 0;
    virtual int retrieve() = 0;
    virtual void print() = 0;

    ListItem* getHead(){
        return head;
    }

    ListItem* getTail(){
        return tail;
    }

    void setHead(ListItem * head){
        this->head = head;
    }

    void setTail(ListItem* tail){
        this->tail = tail;
    }
};

class Queue: public List{
    public:
    Queue(): List(){

    }

    void store(int item){
        ListItem * lst = new ListItem(item);
        if(getTail() == NULL){
            setTail(lst);
            setHead(lst);
            return;
        }
        ListItem * tail = getTail();
        tail->setNext(lst);
        tail = tail->getNext();
        setTail(tail);
    }

    int retrieve(){
        ListItem * head = getHead();
        if(head == NULL){
            return -1;
        }
        ListItem * lst = head;
        int item = lst->getItem();
        head = head->getNext();
        setHead(head);
        delete lst;
        return item;
    }

    void print(){
        ListItem * itr = getHead();

        while(itr != NULL){
            if(itr->getNext()){
                cout << itr->getItem() << ", ";
            }
            else{
                cout << itr->getItem()<< endl;
            }
            itr = itr->getNext();
        }
    }
};

int main(){
    // testing
    Queue q;
    q.store(1);
    q.store(2);
    q.store(3);
    q.store(4);

    q.print();

    cout << q.retrieve() << endl;

    cout << q.retrieve() << endl;

    q.print();
    q.store(5);
    q.store(6);
    q.print();
}