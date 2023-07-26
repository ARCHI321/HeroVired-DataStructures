package dataStructures.day4;


//Function Interfaces will have only one abstract method. It can have as many as default or static method
public interface FunctionalInterfaceEx {
    int find_sum(int a,int b);
}


//java predefined functional interfaces
//Consumer:
//   void accept(T t)
//
//Supplier:
//   T get()
//
//Predicate:
//   boolean test(T t);
//
//Function:
//   R apply(T t);