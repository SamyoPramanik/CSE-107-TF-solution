if we don't use virtual function, the output would be like that instead of previous output.
/*
output:
shape::draw() called drawing nothing
shape::draw() called drawing nothing
shape::draw() called drawing nothing
*/

Because in the shape_ptr array, there are address of different objects but the array type
is "shape pointer" (which is actually pointer of base class).Base class pointer is pointing to different objects and when
we try to calls draw method, it invokes the method function according to the pointer class not as per the object pointed to. 
That's why above output is showed.


Actually here comes the significance of polymorphism. 
In case of not decalaring virtual function,we can still 
now call the respective draw function of the objects by
calling individually using its object.


here is the driver code for above abstraction

/*
code snippets:

shape shape1;
rectangle rect1(5, 4);
square sq1(5);

shape1.draw(); //shape::draw() called drawing nothing
rect1.draw(); //rectangle::draw() called drawing: length = 5 width = 4
sq1.draw(); //square::draw() called drawing: length = 5

//alternative which will give u same output

shape *ptr1 = shape1;
rectangle *ptr2 = rect1;
square *ptr3 = sq1;
ptr1->draw(); //shape::draw() called drawing nothing
ptr2->draw(); //rectangle::draw() called drawing: length = 5 width = 4
ptr3->draw(); //square::draw() called drawing: length = 5

*/

Here comes the actual trouble. If there are hundreds of thousands of different type of objects, 
we need to invoke draw method individually. That kind of code is not well optimized to be honest since we need to create
different class-pointer to point different type of objects but to call draw function. It will not properly serve the benefits of
the concept of inheritance.

Again suppose there are 100 objects of rectangle class and 100 objects of square class. At that time, we need to create an array of
rectangle-class-pointers for rectangle class's objects and another array of square-class-pointers for square class's objects.
here is the code snippet:
/*
rectangle *rect_ptr[] = {&rect1, &rect2, &rect2,... ... ..., &rectN};
    for (auto it : rect_ptr)
    {
        it->draw();
    }
square *square_ptr[] = {&sq1, &sq2, &sq2,... ... ..., &sqN};
    for (auto it : square_ptr)
    {
        it->draw();
    }
*/

But there are some problems too. 
If there are 100 derived classes, we need to create 100 pointer arrays which is very time consuming and well optimized in that case.
That's why we can make draw function as virtual so that whenever we call draw function of different objects with same base class
pointer, it always shows output according to the object pointed to.

Whereas if we use vutual methods,it helps us to deal with different objects of different classes with single base class pointer.
It increases the readability, understandability of the code.

That's the main reason behind calling the function overriding and virtual function as runtime polymorphism.