
//to create the multiple inheritance 
interface Name{
    // all methods are abstract by default means  there is no body of the methods tht you've created inside the interface
    void Multi();
    void Remainder();
}
public class interface_sample implements Name{
    int a,b;
    public void Multi(){
        System.out.println("Multiplication of thwo numbers are: "+a*b);
    }
    public void Remainder(){
        System.out.println("Remainder of the numbers are:"+a%b);
    }
    public static void main(String[] args){
        interface_sample obj = new interface_sample();
        obj.a = 23;
        obj.b =12;
        obj.Multi();;
        obj.Remainder();
        System.out.println("Done Compiling!");
    }
}
