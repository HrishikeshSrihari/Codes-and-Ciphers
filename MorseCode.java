import java.util.*;

public class MorseCode
{
    //Morse Code
    
    public static String encodeMorse(String s)
    {
        Scanner scan = new Scanner(System.in);

        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?' };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };

        String input = s.toLowerCase();

        char[] chars = input.toCharArray();

        String str = "";
        for (int i = 0; i < chars.length; i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (alphabet[j] == chars[i])
                {
                    str = str + morse[j] + " ";  
                }
            }
        }
        return str;
    }

    public static void driverEncodeMorse(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a phrase to encode in morse >>> ");
        String input = scan.nextLine();

        System.out.println(encodeMorse(input));
    }

    public static String decodeMorse(String s)
    {
        Scanner scan = new Scanner(System.in);
        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?' };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };

        
        String[] words = null;
        if(s.contains("|"))
        {
            words = s.split("[|]");
        }
        else
        {
            words = new String[1];
            words[0] = s;
        }

        for (String word : words)
        {
            String[] characters = word.split(" ");
            for (int h = 0;h < characters.length;h++)
            {
                for (int i = 0;i < morse.length;i++)
                {
                    if (characters[h].equals(morse[i]))
                    {
                        System.out.println(alphabet[i]);
                    }
                }
            }
            System.out.print(" ");    
        }    
        return s;
    }
    
    public static void driverDecodeMorse(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a sentence in Morse Code >>> ");
        String s = scan.nextLine();
        
        System.out.println(decodeMorse(s));
    }
}