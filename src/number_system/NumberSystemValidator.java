package number_system;

public class NumberSystemValidator {

    public static boolean isDecimal(String number)
    {
        try{
            Integer.parseInt(number);
            return true;
        }
        catch (NumberFormatException exception)
        {
            return false;
        }
    }
    public static boolean isBinary(String number)
    {
        try{
            Integer.parseInt(number,2);
            return true;
        }
        catch (NumberFormatException exception)
        {
            return false;
        }
    }
    public static boolean isOctal(String number)
    {
        try{
            Integer.parseInt(number,8);
            return true;
        }
        catch (NumberFormatException exception)
        {
            return false;
        }
    }
    public static boolean isHexadecimal(String number){
        try
        {
            Long.parseLong(number,16);
            return true;
        }
        catch (NumberFormatException exception)
        {
            return false;
        }
    }

    public static boolean choiceValidator(String number)
    {
        try{
            Integer.parseInt(number);
            if(!(Integer.parseInt(number)>=1 && Integer.parseInt(number)<=4))
            {
                throw new NumberFormatException();
            }
            return true;
        }
        catch (NumberFormatException exception)
        {
            return false;
        }
    }
}
