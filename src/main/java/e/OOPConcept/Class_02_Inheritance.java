package e.OOPConcept;

public class Class_02_Inheritance {
    public String title1 = "Title1";
    public String title2 = "Title2";

    void print1(){
        System.out.println("print1 - super");
    }

    void print2(){
        System.out.println("print2 - super");
    }

    void print3(){
        System.out.println("print3 - super");
    }

}

class Sub extends Class_02_Inheritance {

    String title1 = "Title1 - Sub";

    void print1(){
        System.out.println("print1 - sub");
    }

    void print4(){
        super.print3();
        System.out.println("print4 - sub");
    }


}
