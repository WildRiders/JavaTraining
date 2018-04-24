package b.DataType;

public class Class_04_Operators {

    /*************************************************UNARY***************************************************/

    int i = 0;

    void unary() {
        i += 1;
        i++;
    }


    void equality() {
        boolean e;
        e = 1 == 1;
        e = 1 != 1;
        e = 1 >= 1;
        e = 1 <= 1;
    }

    void conditionalOperators(){
        boolean e;
        e= 1==1 && 1==2;
        e= 1==1 || 1==2;

        //** if-then-else
        e= 1==1?true:false;
    }

    void instanceOfExample (){
        boolean e;
        String string="Example";
        e= string instanceof String;
    }


}
