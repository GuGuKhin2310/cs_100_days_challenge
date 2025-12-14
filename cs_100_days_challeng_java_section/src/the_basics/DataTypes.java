package the_basics;

public class DataTypes {
    public static void main(String[] args) {
        byte byteNumber = 127;  //-128 <--> 127 byte 8bits
        short shortNumber = 32000; // -32768 <--> 32767 short  16bits
        int intNumber = 12345678; //32bits
        long longNumber = 12345678901234567L;  //64bits

        float floatNumber = 12345.6789f;    //32bits
        double doubleNumber = 123456.789123456; //64bits (use)

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        boolean booleanValue = true;
        boolean booleanValue2 = false;

        System.out.println(booleanValue);

        char character = 95; //ascii 95 = - 
        System.out.println(character);

    }
}
