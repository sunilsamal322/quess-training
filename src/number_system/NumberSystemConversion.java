package number_system;

public class NumberSystemConversion {

    public static String decimalToDecimal(String number)
    {
        return number;
    }
    public static String decimalToBinary(String number)
    {
        return Integer.toBinaryString(Integer.parseInt(String.valueOf(number)));
    }
    public static String decimalToOctal(String number)
    {
        return Integer.toOctalString(Integer.parseInt(String.valueOf(number)));
    }
    public static String decimalToHexadecimal(String number)
    {
        return Integer.toHexString(Integer.parseInt(String.valueOf(number)));
    }

    public static String binaryToDecimal(String number)
    {
        return String.valueOf(Integer.parseInt(number,2));
    }
    public static String binaryToBinary(String number)
    {
        return number;
    }
    public static String binaryToOctal(String number)
    {
        return Integer.toOctalString(Integer.parseInt(number,2));
    }
    public static String binaryToHexadecimal(String number)
    {
        return Integer.toHexString(Integer.parseInt(number,2));
    }

    public static String octalToDecimal(String number)
    {
        return String.valueOf(Integer.parseInt(number,8));
    }
    public static String octalToBinary(String number)
    {
        return Integer.toBinaryString(Integer.parseInt(number,8));
    }
    public static String octalToOctal(String number)
    {
        return number;
    }
    public static String octalToHexadecimal(String number)
    {
        return Integer.toHexString(Integer.parseInt(number,8));
    }

    public static String hexadecimalToDecimal(String number)
    {
        return String.valueOf(Long.parseLong(number,16));
    }
    public static String hexadecimalToBinary(String number)
    {
        return Long.toBinaryString(Long.parseLong(number,16));
    }
    public static String hexadecimalToOctal(String number)
    {
        return Long.toOctalString(Long.parseLong(number,16));
    }
    public static String hexadecimalToHexadecimal(String number)
    {
        return number;
    }
}
