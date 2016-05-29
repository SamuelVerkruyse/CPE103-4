Project 4 is comprised of 4 classes:
myBinaryHeap has two constructors, one which makes a heap of size 100, and one that makes a heap of the user requested size.
Insert takes an anytype variable and adds it to the heap. deleteMin removes the smallest value and adjusts the heap.
findMin returns the smallest value in the heap. percolateDown adjusts the heap. isEmpty returns whether the heap is empty or not.
makeEmpty makes the heap empty by changing current size. enlargeArray makes the array large. size returns the size of the array.
toString returns a formatted string of the heap's contents.

myBinaryHeap_Test is a class that allows for the user to manipulate a string heap, controlled by a switch statement.

Employee is a class that constructs an object called an employee, who has an id and a lastname, can be compared to other employees 
by employee id using compareTo, and a toString method to print its information in a formatted manner. 

EmployeePrinter makes a myBinaryHeap out of employees that are found in a read in file that the user request, and then prints it out 
as specified by the program guidelines. 