package a.ClassBasic;

public class Class_02_Methods {

    /** Basic knowledge
     *  1) loweCamel
     *  2) verbs
     *  3) overloading
     *  4) overriding
     *
     */

                public void foo(){
                    System.out.println("Method foo");
                }

    /** Handling with variables
     *  1) Class variables don't need to be initialized, scope whole class
     *  2) Method variables need to be initialized, scope method
     * */
        String outOfMethod;
                public void handleWithVaraible(){
                    String insideMethod="Must be initialized";
                    System.out.println(outOfMethod);
                    System.out.println(insideMethod);
                }

    /** Overloading*/

                public void foo(String firstName){

                    System.out.println("Method foo " + firstName);
                }

                public void foo(String firstName,String lastName){

                    System.out.println("Method foo " + firstName + "LastName " + lastName );
                }

    //TODO wrong overloading
               /* public int foo(String firstName){
                    System.out.println("Method foo " + firstName);
                    return 7;
                }*/
}
