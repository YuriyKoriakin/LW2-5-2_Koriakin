package nonstatic;

/**
 * Created by Yuriy on 22.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyInit init1=new MyInit(); //create object
        MyInit init2=new MyInit();//create object
        MyInit init3=new MyInit();//create object

        init1.printArray();//start method for object
        init2.printArray();//start method for object
        init3.printArray();//start method for object
    }
}
