package c.Arrays;

import b.DataType.Class_01_Primitives;

import java.util.Arrays;
import java.util.List;

public class Starter_Arrays {
    public static void main(String[] args) {

        /***********************************************************************************************************/
        System.out.println("*****************************************ARRAYS********************************************");

        /**Arrays
         * 1) Can contain objects and primitives ( Types can be mixed )
         * 2) size (length) cannot be modified
         * 3) Length should be known during initialization
         * 4) the faster method to store data
         * */

        /** Initialization*/
                    int[] intArray1 = new int[4];
                    int intArray2[] = new int[4];
                    int[][] intArray3 = new int[4][];
                    int[] intArray4[] = new int[4][];

                    int[] intArray5 = {0, 1, 2, 3, 4};
                    int intArray6[] = new int[]{0, 1, 2, 3, 4};

                    Class_01_Primitives[] primitivesArrays = new Class_01_Primitives[2];
                    primitivesArrays[0] = new Class_01_Primitives();
                    primitivesArrays[1] = new Class_01_Primitives();


        /** Looping*/

                    //One line
                    for (int i = 0; i < intArray1.length; i++)
                        System.out.println("Looping One Line " + i);

                    //More than one line
                    for (int i = 0; i < intArray1.length; i++) {
                        String loopName = "Looping More Than One";
                        System.out.println(loopName + " " + i);
                    }

                    //For Each
                    for (int item:intArray1){
                        System.out.println("Looping For Each " + item);
                    }

        /** Converting to d.Containers*/

                    //Array Object to List Object
                    List<Class_01_Primitives> listFromArray= Arrays.asList(primitivesArrays);

                    //Array primitives to List Object
                    //List<Integer> listFromArray= Arrays.asList(intArray1); //can't use asList to convert primitives to list

    }
}
