package a.ClassBasic;

public class Class_03_Scope {

    int number1 = 5;

    void changeNumber1 (){

        number1 = 6;
    }

    void printResults1(){
        System.out.print(number1);
    }


    void changeNumber2 (){
        int numeber2 = 0;
    }

    void printResults2(){
       // System.out.print(number2);
    }


}
