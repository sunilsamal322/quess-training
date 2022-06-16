package number_system;

import java.util.Scanner;

public class NumberSystemConversionCalculator {

    public static final String COLOR_RED="\u001B[31m";
    public static final String COLOR_RESET = "\u001B[0m";

    private static void showOptions()
    {
        System.out.println("1. Decimal\n2. Binary\n3. Octal\n4. Hexadecimal");
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while (true)
        {
            String number=null;
            int choiceForInput=Integer.MIN_VALUE;
            System.out.println("Choose one input type from these options");
            showOptions();
            System.out.println("Choose your input type : ");
            while (true)
            {
                boolean validChoice=false;
                String choiceInputInString= scan.next().trim();
                boolean choiceValidator = NumberSystemValidator.choiceValidator(choiceInputInString);
                if(choiceValidator)
                {
                    choiceForInput=Integer.parseInt(choiceInputInString);
                }
                switch (choiceForInput) {
                    case 1 -> {
                        validChoice = true;
                        while (true) {
                            try {
                                System.out.println("Enter number in decimal format,floating point not allowed");
                                number = scan.next().trim();
                                boolean isDecimal = NumberSystemValidator.isDecimal(number);
                                if (!isDecimal)
                                    throw new InvalidNumberFormatException();
                                else
                                    break;
                            } catch (InvalidNumberFormatException exception) {
                                System.out.println(COLOR_RED + "Error: Invalid input,it is not a decimal number" + COLOR_RESET);
                            }
                        }
                    }
                    case 2 -> {
                        validChoice = true;
                        while (true) {
                            try {
                                System.out.println("Enter number in binary format");
                                number = scan.next().trim();
                                boolean isBinary = NumberSystemValidator.isBinary(number);
                                if (!isBinary)
                                    throw new InvalidNumberFormatException();
                                else
                                    break;
                            } catch (InvalidNumberFormatException exception) {
                                System.out.println(COLOR_RED + "Error: Invalid Input,It is not a binary number" + COLOR_RESET);
                            }
                        }
                    }
                    case 3 -> {
                        validChoice = true;
                        while (true) {
                            try {
                                System.out.println("Enter number in octal format");
                                number = scan.next().trim();
                                boolean isOctal = NumberSystemValidator.isOctal(number);
                                if (!isOctal)
                                    throw new InvalidNumberFormatException();
                                else
                                    break;
                            } catch (InvalidNumberFormatException exception) {
                                System.out.println(COLOR_RED + "Error: Invalid Input,It is not a octal number" + COLOR_RESET);
                            }
                        }
                    }
                    case 4 -> {
                        validChoice = true;
                        while (true) {
                            try {
                                System.out.println("Enter number in hexadecimal format");
                                number = scan.next().trim();
                                boolean isHexadecimal = NumberSystemValidator.isHexadecimal(number);
                                if (!isHexadecimal)
                                    throw new InvalidNumberFormatException();
                                else
                                    break;
                            } catch (InvalidNumberFormatException exception) {
                                System.out.println(COLOR_RED + "Error: Invalid Input,It is not a hexadecimal number" + COLOR_RESET);
                            }
                        }
                    }
                    default -> System.out.println(COLOR_RED + "Error: Invalid Choice.Enter a valid choice " + COLOR_RESET);
                }
                if(validChoice)
                    break ;
            }

            System.out.println("Choose one conversion type from these options");
            showOptions();
            System.out.println("Choose conversion type : ");
            int choiceForOutput;
            while (true)
            {
                String choiceOutputInString= scan.next().trim();
                boolean choiceValidator = NumberSystemValidator.choiceValidator(choiceOutputInString);
                if(choiceValidator)
                {
                    choiceForOutput=Integer.parseInt(choiceOutputInString);
                    break;
                }
                System.out.println(COLOR_RED+"Error: Invalid choice,Enter a valid choice"+COLOR_RESET);
            }

            switch (choiceForOutput){
                case 1:
                    if(choiceForInput==1)
                    {
                        String decimalConversion=NumberSystemConversion.decimalToDecimal(number);
                        System.out.println("Decimal Number : "+number);
                        System.out.println("Decimal Conversion : "+decimalConversion);
                    }
                    else if(choiceForInput==2)
                    {
                        String decimalConversion=NumberSystemConversion.binaryToDecimal(number);
                        System.out.println("Binary Number : "+number);
                        System.out.println("Decimal Conversion : "+decimalConversion);
                    }
                    else if(choiceForInput==3)
                    {
                        String decimalConversion=NumberSystemConversion.octalToDecimal(number);
                        System.out.println("Octal Number : "+number);
                        System.out.println("Decimal Conversion : "+decimalConversion);
                    }
                    else {
                        String decimalConversion=NumberSystemConversion.hexadecimalToDecimal(number);
                        System.out.println("Hexadecimal Number : "+number);
                        System.out.println("Decimal Conversion : "+decimalConversion);
                    }
                   break;
                case 2:
                    if(choiceForInput==1)
                    {
                       String binaryConversion= NumberSystemConversion.decimalToBinary(number);
                       System.out.println("Decimal Number : "+number);
                       System.out.println("Binary Conversion : "+binaryConversion);
                    }
                    else if(choiceForInput==2)
                    {
                        String binaryConversion=NumberSystemConversion.binaryToBinary(number);
                        System.out.println("Binary Number : "+number);
                        System.out.println("Binary Conversion : "+binaryConversion);
                    }
                    else if(choiceForInput==3)
                    {
                        String binaryConversion=NumberSystemConversion.octalToBinary(number);
                        System.out.println("Octal Number : "+number);
                        System.out.println("Binary Conversion : "+binaryConversion);
                    }
                    else
                    {
                        String binaryConversion=NumberSystemConversion.hexadecimalToBinary(number);
                        System.out.println("Hexadecimal Number : "+number);
                        System.out.println("Binary Conversion : "+binaryConversion);
                    }
                    break;
                case 3:
                    if(choiceForInput==1)
                    {
                        String octalConversion= NumberSystemConversion.decimalToOctal(number);
                        System.out.println("Decimal Number : "+number);
                        System.out.println("Octal Conversion : "+octalConversion);
                    }
                    else if(choiceForInput==2)
                    {
                        String octalConversion=NumberSystemConversion.binaryToOctal(number);
                        System.out.println("Binary Number : "+number);
                        System.out.println("Octal Conversion : "+octalConversion);
                    }
                    else if(choiceForInput==3)
                    {
                        String octalConversion=NumberSystemConversion.octalToOctal(number);
                        System.out.println("Octal Number : "+number);
                        System.out.println("Octal Conversion : "+octalConversion);
                    }
                    else
                    {
                        String octalConversion=NumberSystemConversion.hexadecimalToOctal(number);
                        System.out.println("Hexadecimal Number : "+number);
                        System.out.println("Octal Conversion : "+octalConversion);
                    }
                    break;
                case 4:
                    if(choiceForInput==1)
                    {
                        String hexadecimalConversion= NumberSystemConversion.decimalToHexadecimal(number);
                        System.out.println("Decimal Number : "+number);
                        System.out.println("Hexadecimal Conversion : "+hexadecimalConversion);
                    }
                    else if(choiceForInput==2)
                    {
                        String hexadecimalConversion=NumberSystemConversion.binaryToHexadecimal(number);
                        System.out.println("Binary Number : "+number);
                        System.out.println("Hexadecimal Conversion : "+hexadecimalConversion);
                    }
                    else if(choiceForInput==3)
                    {
                        String hexadecimalConversion=NumberSystemConversion.octalToHexadecimal(number);
                        System.out.println("Octal Number : "+number);
                        System.out.println("Hexadecimal Conversion : "+hexadecimalConversion);
                    }
                    else
                    {
                        String hexadecimalConversion=NumberSystemConversion.hexadecimalToHexadecimal(number);
                        System.out.println("Hexadecimal Number : "+number);
                        System.out.println("Hexadecimal Conversion : "+hexadecimalConversion);
                    }
                    break;
            }

            System.out.println("\nDo you want continue? Enter Y for Yes || any other key gor quit");
            String choice= scan.next().trim();
            if(!choice.equalsIgnoreCase("y"))
            {
                break;
            }
        }
    }
}
