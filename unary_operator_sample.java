public class unary_operator_sample {
    public static void main(String[] args){
        System.out.println("Unary Operators: ->");
        //let there be variable
        int a = 34;
        System.out.println("Value of assigned variable is: "+a);
        //increment unary operator
        System.out.println("Value after the preincrement is: "+(++a));
        System.out.println("Changed value is:"+a);
        System.out.println("Value after the postincrement is:"+(a++));
        System.out.println("Changed value is: "+a);

        //decrement unary operator
        System.out.println("Value For Decrement is :"+a);
        System.out.println("Value after predecrement is:"+(--a));
        System.out.println("value is:"+a);
        System.out.println("Value after postdecrement is:"+(a--));
        System.out.println("value is:"+a);
    }
}
