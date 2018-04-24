package b.DataType;

import java.math.BigDecimal;

public class Class_01_Primitives {

    /** Integers
     * 1)
     * 2) integers - byte 8, short 16, int 32
     *
     *
     */
                byte byteValue =1;
                short shortValue=1;
                int intValue=1;

                Byte byteValueObject1 = new Byte("1");
                Byte byteValueObject2 = Byte.valueOf("1");

                Short shortValueObject = new Short("1");
                Integer intValueObject1 = new Integer("1");
                Integer intValueObject2 = Integer.valueOf("1");

    //Equality
                boolean equality1 = byteValue == shortValue;
                boolean equality2 = byteValue == intValue;
                boolean equality3 = shortValue == intValue;

                boolean equality4 = intValueObject1 == intValue;
                boolean equality5 = intValueObject2 == intValue;


    /** Long
     * 1)
     *
     *
     */
                long longValue=1L;

                boolean equality6 = intValue==longValue;


    /** Decimals
     * 1) float - byte 32, double 64
     *
     *
     */
                //float floatValue = 1.0; TODO "F" or "f" need to be added
                float floatValue = 1.0f;

                double doubleValue = 1.0;


                float sumFloat = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f +0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
                double sumDouble = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 +0.1 + 0.1 + 0.1 + 0.1 + 0.1;

                BigDecimal getCorrectDoubleNumber(){
                        BigDecimal number=new BigDecimal("0");

                    for (int i=0; i<10; i++)
                        number=number.add(new BigDecimal("0.1"));

                    return number;
                }

    /** boolean
     * 1)
     *
     *
     */

                boolean booleanValue1 = false;
                boolean booleanValue2 = true;

                Boolean boleanObject = new Boolean("true");

                boolean equality7 = boleanObject==booleanValue2;


    /** char
     * 1) ASCII Table
     *
     *
     */

                char charValue1 = 'a';

                char charValue2 = 0;//null

}
