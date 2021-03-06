package e.OOPConcept;


/** ABSTRACT CLASS
 * 1) at least on method need to be "abstract", can have abstract an no abstract methods
 * 2) Abstract cannot be initialized
 * 3) All abstract methods need to overridden on next concrete class
 * 4) Can declare non-static or non-final fields
 *
 *
 * */

abstract class AbstractClass_00_ClassTypes {

    // declare fields

    // declare nonabstract methods
    void simpleMethod (){
        System.out.println("I'm simple method");
    }

    abstract void simpleAbstractMethod ();

}

/** INTERFACE
 * 1) Many interfaces can be implemented in subclass "implements"
 * 2) Interface can extended many other interfaces "extends"
 * 3) All methods (except default) need to overridden on first concrete class
 * 4) All variables are public final
 * 5) Since Java8 "default" method has a body
 * */

interface IClass_00_ClassTypes {

    void doSomethingUsingInterface();

}


public class Class_00_ClassTypes extends AbstractClass_00_ClassTypes implements IClass_00_ClassTypes {


    @Override
    void simpleAbstractMethod() {

    }

    @Override
    public void doSomethingUsingInterface() {

    }
}




