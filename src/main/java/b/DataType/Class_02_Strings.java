package b.DataType;

public class Class_02_Strings {

    /** Strings
     * 1) String are immutable - can't be modified
     * 2) String Pool
     * 3) String Object
     *
     *
     */

    //String Pool
                    String string1 = "String";
                    String string2 = "String";

    //String Object
                    String stringObj = new String("String");

    //Immutability

                    String string3 = string1.concat("String");

    //Equality
                    boolean equality1 = string1 == string2;
                    boolean equality2 = string1.equals(string2);

                    boolean equality3 = string1 == stringObj;
                    boolean equality4 = string1.equals(stringObj);

    //StringBuffer - mutable
                    StringBuilder sb1 = new StringBuilder("String Builder");
                    StringBuffer sb2 = new StringBuffer("String Buffer");

}
