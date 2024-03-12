//contains at least one non implemented method here
abstract class MyAbstract{
    
    //making the abstract method
    abstract void fun();
    //contains body function or method
    void print(){
        System.out.println("Done Coding");
    }
}

//extending the abstract class using "extends" keyword here
public class abstract_sample extends MyAbstract{
    //writing the body of the abstract method
    void fun(){
        System.out.println("This is the Abstract method that is extended inside the main class");
    }

    //implementing the method here
    public static void main(String[] args){
        //creating the object of the class
        abstract_sample obj = new abstract_sample();
        //calling the methods 
        obj.fun();
        obj.print();

    }
}
