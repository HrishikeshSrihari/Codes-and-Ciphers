import java.util.*;

public class ROT47
{
    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
            'w', 'x', 'y', 'z'};
    
    //ROT-47 Cipher
    
    public static String encryptROT47(String s)
    {
        int key = 47;
        String encrypText = "";
        for (int i = 0; i < s.length(); i++) 
        {
            int temp = (int)s.charAt(i) + key;
            if((int)s.charAt(i) == 32)
            {
                encrypText += " ";
            }
            else if(temp > 126)
            {
                temp -= 94;
                encrypText += (char)temp;
            }
            else
            {
                encrypText += (char)temp;
            }
        }

        return encrypText;

    }

    public static void driverEncryptROT47(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a code to encrypt >>> ");
        String input = scan.next();

        System.out.println(encryptROT47(input));
    }

    public static String decryptROT47(String s)
    {
        int key = 47;
        String decrypted = "";
        for (int i = 0; i < s.length(); i++)
        {
            int temp = (int)s.charAt(i) - key;
            if ((int)s.charAt(i) == 32)
            {
                decrypted += " ";
            }
            else if (temp < 32)
            {
                temp += 94;
                decrypted += (char)temp;
            }
            else
            {
                decrypted += (char)temp;
            }
        }

        return decrypted;
    }

    public static void driverDecryptROT47(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a cipher to decrypt >>> ");
        String input = scan.next();

        System.out.println(decryptROT47(input));
    }
}