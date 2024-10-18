public class Variables {
    int I = 35;
    //Non-static variable, It can be accessed inside and outside the class
    // Needs creation of object and reference to that object
    //Needs the other class to create the object of the class that has the value

    static int J = 40;
    //Static variable, it can be accessed inside of class, method, outside of class
    //if it is called outside of class it should be called with class name

    public static void main(String [] args){
        int P = 10;//Local variable, It can be only accessed in method
        System.out.println(P);
        Variables v = new Variables();
        System.out.println(v.I);

        System.out.println(Variables.J);
        //It is easy to always use full static reference for calling static variable
        //It is not mandatory to use class reference inside of class,
        // but it makes it even, so that we don't have to keep track of them
        //on where and how they are written
    }
}
class Variable2{
    public static void main(String [] args){

        System.out.println(Variables.J);
        //Calling Static variable with Class name

        Variables v = new Variables();
        //Creating Variable class object, it can access all the non-static variables of class Variables
        System.out.println(v.I);
        //Printing the Value with object reference
    }
}
