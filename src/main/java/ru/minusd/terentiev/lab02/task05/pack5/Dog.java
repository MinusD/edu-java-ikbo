package pack5;

public class Dog {
    private String name ="";
    private int age = 0;

    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setName(String Name)
    {
        this.name = Name;
    }
    public void setAge(int Age)
    {
        this.age = Age;
    }
    public int trans()
    {
        return this.age*7;
    }
    public String toString()
    {
        return this.name+" "+this.age;
    }
}
