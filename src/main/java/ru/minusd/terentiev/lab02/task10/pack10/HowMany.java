package pack10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] words = new char[1024];
        String w;
        w = s.nextLine();
        words = w.toCharArray();
        String alf = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        char[] alphabet = alf.toCharArray();
        int sum = 0;
        boolean x = true;
        for(int i = 0; i<w.length(); i++)
        {
            for(int j = 0; j<alf.length();j++)
                if (x & words[i] ==alphabet[j])
                {
                    sum++;
                    x = false;
                    break;
                }
                else if (words[i] == alphabet[j])
                    break;
                else if (words[i]!=alphabet[j] & j == alf.length()-1)
                {
                    x = true;
                }
        }
        System.out.println("Count of words: " + sum);
    }
}
