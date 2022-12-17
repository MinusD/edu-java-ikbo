package pack4;

public class Shop {
    String[] computers = new String[100];
    int k = 0;
    public Shop()
    {
        for(int i = 0; i<100; i++)
            computers[i] = "";
    }
    public void add(String comp) {
        computers[k] = comp;
        k++;
    }

    public void del(String comp)
    {
        for(int i = 0; i<100; i++)
            if (computers[i].equals(comp))
                computers[i] = "";
    }
    public void search(String comp)
    {
        boolean x = false;
        for(int i = 0; i<100; i++)
            if (computers[i]!=null & computers[i].equals(comp))
                x = true;
        if (x)
        {
            System.out.println("Computer was founded");
        }
        else
            System.out.println("Computer was not founded");

    }
}

