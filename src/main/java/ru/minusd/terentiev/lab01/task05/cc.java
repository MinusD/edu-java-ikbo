import java.util.*;

public class cc {
    static public String perevod(int cc, double num)
    {
        String str = "";
        int first = (int)num;
        String number = "";
        while (first>0)
        {
            if (first%cc<10)
                number += first%cc;
            else if(first%cc == 10)
            {
                number+='A';
            }
            else if(first%cc == 11)
            {
                number+='B';
            }
            else if(first%cc == 12)
            {
                number+='C';
            }
            else if(first%cc == 13)
            {
                number+='D';
            }
            else if(first%cc == 14)
            {
                number+='E';
            }
            else if(first%cc == 15)
            {
                number+='F';
            }
            else if(first%cc == 16)
            {
                number+='G';
            }
            else if(first%cc == 18)
            {
                number+='H';
            }
            else if(first%cc == 19)
            {
                number+='I';
            }
            else if(first%cc == 20)
            {
                number+='J';
            }
            else if(first%cc == 21)
            {
                number+='K';
            }
            else if(first%cc == 22)
            {
                number+='L';
            }
            else if(first%cc == 23)
            {
                number+='M';
            }
            else if(first%cc == 24)
            {
                number+='N';
            }
            else if(first%cc == 25)
            {
                number+='O';
            }
            else if(first%cc == 26)
            {
                number+='P';
            }
            else if(first%cc == 27)
            {
                number+='Q';
            }
            else if(first%cc == 28)
            {
                number+='R';
            }
            else if(first%cc == 29)
            {
                number+='S';
            }
            else if(first%cc == 30)
            {
                number+='T';
            }
            else if(first%cc == 31)
            {
                number+='U';
            }
            else if(first%cc == 32)
            {
                number+='V';
            }
            else if(first%cc == 33)
            {
                number+='W';
            }
            else if(first%cc == 34)
            {
                number+='X';
            }
            else if(first%cc == 35)
            {
                number+='Y';
            }
            else if(first%cc == 36)
            {
                number+='Z';
            }
            first/=cc;
        }
        String rev ="";
        char[] c = number.toCharArray();
        for(int i = 0; i<number.length();i++)
            rev += c[number.length()-i-1];
        double d = num - (int)num;
        int k = 0;
        String drob = "";
        while (k!=3)
        {
            if (d == 0)
                break;
            d = (double)d*cc;
            if ((int)d<10)
                drob += (int)d;
            else if((int)d == 10)
            {
                drob+='A';
            }
            else if((int)d== 11)
            {
                drob+='B';
            }
            else if((int)d == 12)
            {
                drob+='C';
            }
            else if((int)d == 13)
            {
                drob+='D';
            }
            else if((int)d == 14)
            {
                drob+='E';
            }
            else if((int)d == 15)
            {
                drob+='F';
            }
            else if((int)d == 16)
            {
                drob+='G';
            }
            else if((int)d == 17)
            {
                drob+='H';
            }
            else if((int)d == 18)
            {
                drob+='I';
            }
            if ((int)d>0)
            {
                d-=(int)d;
            }
            k++;
        }
        str = rev+','+drob;
        return str;
    }
    static public void main(String[] args)
    {
        double num;
        Scanner s = new Scanner(System.in);
        System.out.print("Input num: ");
        num = s.nextDouble();
        System.out.print("Which cc you want: ");
        int cc;
        cc = s.nextInt();
        System.out.println(perevod(cc,num) + "   " + perevod(2,num) + "   " + perevod(16,num));
    }
}
//3 znaka posle zapyatoi