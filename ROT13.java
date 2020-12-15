import java.util.*;

public class ROT13
{
    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
            'w', 'x', 'y', 'z'};

    //ROT-13 Cipher        
    public static String encryptROT13(String s)
    {
        char[] values = s.toCharArray();

        for (int i = 0; i < values.length; i++)
        {
            char letter = values[i];

            if (letter >= 'a' && letter <= 'z')
            {
                if (letter > 'm')
                {
                    letter -= 13;
                }
                else
                {
                    letter += 13;
                }
            }
            else if (letter >= 'A' && letter <= 'Z')
            {
                if (letter > 'M')
                {
                    letter -= 13;
                }
                else
                {
                    letter += 13;
                }
            }
            values[i] = letter;
        }
        return new String(values);
    }

    public static void driverEncryptRot13(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a code to encrypt >>> ");
        String input = scan.nextLine();
        String rot13 = encryptROT13(input);
        String roundTrip = encryptROT13(rot13);

        System.out.println(input);
        System.out.println(rot13);
    }

    public static String decryptROT13(String s)
    {
        char[] values = s.toCharArray();

        for (int i = 0; i < values.length; i++)
        {
            char letter = values[i];

            if (letter >= 'a' && letter <= 'z')
            {
                if (letter > 'm')
                {
                    letter -= 13;
                }
                else
                {
                    letter += 13;
                }
            }
            else if (letter >= 'A' && letter <= 'Z')
            {
                if (letter > 'M')
                {
                    letter -= 13;
                }
                else
                {
                    letter += 13;
                }
            }
            values[i] = letter;
        }
        return new String(values);
    }

    public static void driverDecryptRot13(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a cipher to decrypt >>> ");
        String input = scan.nextLine();
        String rot13 = encryptROT13(input);

        System.out.println(input);
        System.out.println(rot13);
    }

}