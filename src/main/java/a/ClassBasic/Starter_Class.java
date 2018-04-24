package a.ClassBasic;

public class Starter_Class {

    /**
     *
     * public static void main (String[] args) - Intellij: psvm/Enter
     *
     * https://docs.oracle.com/javase/tutorial/index.html
     * https://docs.oracle.com/javase/tutorial/java/TOC.html
     *
     *
     */

    public static void main(String[] args) {

        System.out.println("*****************************************CLASS BASICS****************************************");
        /** Refers to Class_01_Basic */
                        Class_01_Basic classBasic = new Class_01_Basic();

        /** Refers to public field*/
                        System.out.println(classBasic.id); //id is public field
                        //classBasic.name = "John"; //TODO Compile Error

        /** Refers to  methods*/
                        //void
                        classBasic.doSomething();

                        //return
                        int returnIntValue = classBasic.calculateNumbers();
                        System.out.println(returnIntValue);
                        System.out.println(classBasic.calculateNumbers());

        /** Refers to  static methods*/
                        //void/return
                        Class_01_Basic.doSomethingStatic();

        /***********************************************************************************************************/
        System.out.println("*****************************************METHODS********************************************");

        /** classMethods initialization*/
                        Class_02_Methods classMethods = new Class_02_Methods();

                        classMethods.foo();

                        classMethods.handleWithVaraible();

        /** Method Overloading*/
                        String firstName = "Johnny";
                        String lastName = "Bravo";

                        classMethods.foo(firstName);
                        classMethods.foo(firstName,lastName);
    }
}
