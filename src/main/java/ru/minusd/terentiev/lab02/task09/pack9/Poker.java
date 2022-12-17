package pack9;

import java.util.Scanner;


public class Poker {
    public static int random(double i)
    {
        int num;
        double nu = Math.random() * 1000;
        num = ((int) nu)%(int)i;
        return num;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input count of players: ");
        int n = s.nextInt();
        while (n > 10) {
            System.out.print("Players count too much, try again: ");
            n = s.nextInt();
        }
        String[] suits = {
                " Diamonds", " Hearts", " Clubs", " Spades"
        };
        String[] cards = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
        };
        String[][] repeat = new String[n][n*5];
        for(int i = 0; i<n;i++)
            for (int j = 0; j<n*5; j++)
            {
                repeat[i][j] = "";
            }
        String card,suit;
        String tr;
        boolean x = true;
        int k = 0,m =0;
        for(int i = 0; i<n; i++)
        {
            System.out.print((i+1) + " Player: ");
            for(int j = 0; j<5; j++) {
                card = cards[random(cards.length)];
                suit = suits[random(suits.length)];
                tr = card + suit;
                for (int t = 0; t < n; t++)
                    for (int y = 0; y < n * 5; y++)
                    {
                        if (repeat[t][y].equals(tr))
                        {
                            x = false;
                            j--;
                        }
                    }
                if (x) {
                    repeat[k][m] = tr;
                    m++;
                    if (m == n * 5 - 1)
                    {
                        k++;
                        m = 0;
                    }
                    System.out.print(card + " of" + suit + "; ");
                }
                else x = true;
            }
            if (i != n-1)
            {
                System.out.println();
                System.out.println();
            }
        }
        System.out.println();
    }
}
