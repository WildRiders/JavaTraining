package f.ErrorHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Starter_ErrorHandling {

    public static void main(String[] args) {

        /***********************************************************************************************************/
        System.out.println("*****************************************ERROR HANDLING*********************************************");

        /**
         * 1) Exception (Check Exception)
         * 2) RuntimeException (Unchecked Exception)
         *
         * Actions:
         * - TryCatchFinally (TryCatch, TryFinally)
         * - Throws
         * - Try with resources
         * - Custom Exceptions
         *
         */

        /**
         * Dealing with Exceptions
         * */

        new Starter_ErrorHandling().test1();
        new Starter_ErrorHandling().test2();
        new Starter_ErrorHandling().test3();
        new Starter_ErrorHandling().test4();
        //new Starter_ErrorHandling().test5();//Add "throws Exception"

    }

    //Exception - Example 1 - RuntimeException
    int number = 12;
    private void test1() {
        //System.out.println(number/0);
    }

    //Exception - Example 2
    private void test2() {
        //PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
    }

    //Exception - Example 3 - try-catch-finally
    void test3(){
        try {
            PrintWriter out= new PrintWriter(new FileWriter("OutFile.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }

    //Exception - Example 4 - Try-with-resources
    void test4() {
        try(PrintWriter out = new PrintWriter(new File("OutFile.txt"))){
            System.out.println("Have a file");
        }catch (IOException e){
            System.out.println("I find any file");
        }
    }

    //Exception - Example 5 - Throwing Exception
    void test5() throws Exception{
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        }

}



