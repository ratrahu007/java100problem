public class TypeCastingExample {
    public static void main(String[] args) {
        
        // 1. Implicit Type Conversion (Widening)
        byte byteValue = 10;
        short shortValue = byteValue; // byte → short
        int intValue = shortValue; // short → int
        long longValue = intValue; // int → long
        float floatValue = longValue; // long → float
        double doubleValue = floatValue; // float → double

        System.out.println("Implicit Type Conversion (Widening):");
        System.out.println("byte to short: " + shortValue);
        System.out.println("short to int: " + intValue);
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        // 2. Explicit Type Casting (Narrowing)
        double d = 99.99;
        float f = (float) d; // double → float
        long l = (long) f; // float → long
        int i = (int) l; // long → int
        short s = (short) i; // int → short
        byte b = (byte) s; // short → byte

        System.out.println("\nExplicit Type Casting (Narrowing):");
        System.out.println("double to float: " + f);
        System.out.println("float to long: " + l);
        System.out.println("long to int: " + i);
        System.out.println("int to short: " + s);
        System.out.println("short to byte: " + b);

        // Special Case: Character Type Casting
        char ch = 'A'; // Character 'A' has ASCII value 65
        int asciiValue = ch; // char → int (Implicit)
        char newChar = (char) (asciiValue + 1); // Explicit casting back to char

        System.out.println("\nCharacter Type Conversion:");
        System.out.println("Character to ASCII: " + asciiValue);
        System.out.println("Incremented ASCII to Character: " + newChar);
    }
}
