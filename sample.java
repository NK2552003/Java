
//making the class
//note: Everything should be inside the class and class name should be the same as file name
public class sample{
    int num1,num2;  // declaring the two variables

    //making the simple methods like addition and subtraction
    void Addition(){
        System.out.println("Addition of two numbers is:"+(num1+num2));
    }
    void Subtraction(){
        //putting the conditions based on the num1 or num2 that which one is greater and based on that do the subtraction
        if(num1>num2){
            System.out.println("Subtraction is:"+(num1-num2));
        }
        else{
            System.out.println("Subtraction is:"+(num2-num1));
        }
    }

    // creating the main function to call the class
    public static void main(String[] args){
        System.out.println("Hello Java!");
        //making the object of a class
        sample obj = new sample();
        //assigning the value to object variables
        obj.num1 =23;
        obj.num2 =45;
        //calling the methods using dot operator
        obj.Addition();
        obj.Subtraction();

        //Done Compiling
        System.out.println("Done Compiling");
    }
}