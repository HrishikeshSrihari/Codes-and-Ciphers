import java.util.*;
import java.lang.*;

public class CaesarCipher
{
    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
            'w', 'x', 'y', 'z'};
    
    //Caesar Cipher
    
    public static String encryptCaesar(String s, int key)
    {  
        String cipherText = "";
        char alphabet;
        for(int i=0; i < s.length();i++) 
        {
            alphabet = s.charAt(i);

            if (alphabet >= 'a' && alphabet <= 'z') 
            {
                alphabet = (char) (alphabet + key);

                if (alphabet > 'z')
                {
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                cipherText = cipherText + alphabet;
            }
            else if (alphabet >= 'A' && alphabet <= 'Z')
            {
                alphabet = (char) (alphabet + key);    

                if (alphabet > 'Z') 
                {
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                cipherText = cipherText + alphabet;
            }
            else
            {
                cipherText = cipherText + alphabet;   
            }

        }
        return cipherText;
    }

    public static void driverEncryptCaesar(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a code to encrypt >>> ");
        String strInput = scan.nextLine();
        System.out.print("Enter the number of shifts >>> ");
        int intInput = scan.nextInt();
        scan.nextLine();

        System.out.println(encryptCaesar(strInput, intInput));
    }

    public static String decryptCaesar(String s, int key)
    {
        String decrypted = "";

        for(int i = 0; i < s.length();i++)  
        {
            char alphabet = s.charAt(i); 
            if (alphabet >= 'a' && alphabet <= 'z')
            {
                alphabet = (char) (alphabet - key);

                if (alphabet < 'a')
                {
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }

                decrypted = decrypted + alphabet;
            }
            else if (alphabet >= 'A' && alphabet <= 'Z')
            {
                alphabet = (char) (alphabet - key);

                if (alphabet < 'A')
                {
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                decrypted = decrypted + alphabet;            
            }
            else 
            {
                decrypted = decrypted + alphabet;            
            } 
        }
        return decrypted;
    }

    public static void driverDecryptCaesar(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a cipher to decrypt >>> ");
        String strInput = scan.nextLine();
        System.out.print("Enter the number of shifts >>> ");
        int intInput = scan.nextInt();
        scan.nextLine();

        System.out.println(decryptCaesar(strInput, intInput));
    }

}