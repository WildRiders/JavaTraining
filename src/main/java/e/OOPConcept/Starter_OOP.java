package e.OOPConcept;

public class Starter_OOP {
    public static void main(String[] args) {

        /***********************************************************************************************************/
        System.out.println("*****************************************COMPOSITION*********************************************");

        /**Composition*/

        Person person = new Person();

        person.setJob(new Job("Developer",343543.12));
        person.setName("Janusz");

        System.out.println(person);

        System.out.println();
        System.out.println();

        /***********************************************************************************************************/
        System.out.println("*****************************************INHERITANCE*********************************************");

        /**Inheritance
         * 1) Class can be extended only by one class
         * 2) every Class extends Object class (methods toString(), equals(), hashCode())
         *
         */

        Class_02_Inheritance superClass = new Class_02_Inheritance();
        Sub subClass = new Sub();

        System.out.println(superClass.title1);
        System.out.println(subClass.title1);

        System.out.println(superClass.title2);
        System.out.println(subClass.title2);


        superClass.print1();
        subClass.print1();

        superClass.print2();
        subClass.print2();

        //superClass.print4();
        subClass.print3();
        subClass.print4();

    }
}
