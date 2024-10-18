public class Methods {

    //Static method
    //Can be accessed outside of class with class name
    public static void m1(){
        System.out.println("m1");
    }
    //Non-static method
    //Can be accessed outside of class with the following conditions
    //needs creation of object for reference
    //needs the object to be created again in the different class to be called
    public void m2(){
        System.out.println("m2");
    }
    public static void main(String[] args) {
        Methods m = new Methods();
    }
}
class Methods2{
    public static void main(String[] args) {
        //Using class name to call a static method
        Methods.m1();

        //Creating the method host class object
        //Using the object reference to call the method
        Methods m = new Methods();
        m.m2();
    }
}