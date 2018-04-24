package b.DataType;

public class Starter_DataType {
    public static void main(String[] args) {

        /***********************************************************************************************************/
        System.out.println("*****************************************PRIMITIVES********************************************");

        Class_01_Primitives primitives = new Class_01_Primitives();

        System.out.println("Equality1: " + primitives.equality1);
        System.out.println("Equality2: " + primitives.equality2);
        System.out.println("Equality3: " + primitives.equality3);
        System.out.println("Equality4: " + primitives.equality4);
        System.out.println("Equality5: " + primitives.equality5);
        System.out.println("Equality6: " + primitives.equality6);
        System.out.println("Equality7: " + primitives.equality7);

        System.out.println("Floating sum: " + primitives.sumFloat);
        System.out.println("Double sum: " + primitives.sumDouble);
        System.out.println("BigDecimal sum: " + primitives.getCorrectDoubleNumber());

        System.out.println("*****************************************OBJECTS********************************************");

        Class_02_Object object = new Class_02_Object();

        System.out.println("Equality1: " + object.equality1);
        System.out.println("Equality2: " + object.equality2);
        System.out.println("Equality3: " + object.equality3);

        System.out.println("HashCode o1: " + object.hash1);
        System.out.println("HashCode o2: " + object.hash2);
        System.out.println("HashCode o3: " + object.hash3);

        /***********************************************************************************************************/
        System.out.println("*****************************************STRINGS********************************************");

        Class_03_Strings strings = new Class_03_Strings();

        //Approach 1
        strings.string1.concat("Adding Extra String Approach1");
        System.out.println("Immutability1: " + strings.string1);

        //Approach 2
        strings.string1 = strings.string1.concat("Adding Extra String Approach2");
        System.out.println("Immutability1: " + strings.string1);

        //Approach 3
        System.out.println("Immutability2: " + strings.string1.concat(" Adding Extra String Approach3"));

        System.out.println("Equality1: " + strings.equality1);
        System.out.println("Equality2: " + strings.equality2);
        System.out.println("Equality3: " + strings.equality3);
        System.out.println("Equality4: " + strings.equality4);


        System.out.printf("The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", primitives.floatValue, primitives.byteValue, strings.string1);

        String fs = String.format("The value of the float variable is " +
                "%f, while the value of the integer " +
                "variable is %d, and the string " +
                "is %s", primitives.floatValue, primitives.byteValue, strings.string1);

        System.out.println(fs);

        String.format("%.2f", 1.2399); // returns "1.24"
        String.format("%.3f", 1.2399); // returns "1.240"
        String.format("%.2f", 1.2); // returns "1.20"

        //%f - floating
        //%d - integer
        //%s - strings


        //StingBuffer / StringBuilder
        System.out.println("StringBuilder1: " + strings.sb1);
        System.out.println("StringBuffer1: " + strings.sb2);

        //BigDecimal/ BigInteger



        /***********************************************************************************************************/
        System.out.println("*****************************************LOCALDATE ********************************************");



    }
}
