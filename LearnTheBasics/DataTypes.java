package LearnTheBasics;


public class DataTypes {
    /*
     * 
     *  There are 8 main primitive data types in java as mentioned below:
        boolean 1 bit
        byte 8 bit
        char 16 bit
        short 16 bit
        int 32 bit
        long 64 bit
        float 32 bit
        double 64 bit

        Non-Primitive Data Type 
        1. Strings 
        2. Class
        3. Object
        4. Interface
        5. Array
        
     */

    // Main driver method
    public static void main(String args[]) {

        // Creating and initializing custom character
        char a = 'G';

        // Integer data type is generally
        // used for numeric values
        int i = 89;

        // use byte and short
        // if memory is a constraint
        byte b = 4;

        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;
        short s = 56;

        // this will give error as number is
        // larger than short range
        // short s1 = 87878787878;

        // by default fraction value
        // is double in java
        double d = 4.355453532;

        // for float use 'f' as suffix as standard
        float f = 4.7333434f;

        // need to hold big range of numbers then we need
        // this data type
        long l = 12121;

        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
    }
}