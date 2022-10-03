package pack6;


public class Circle {
    private double r;
    public double getR()
    {
        return this.r;
    }
    public void setR(double R)
    {
        this.r = R;
    }
    public double Square()
    {
        return 3.14*this.r*this.r;
    }
    public double Len()
    {
        return 2*3.14*this.r;
    }
    public boolean equal(Circle obj)
    {
        if(this.r == obj.r)
            return true;
        else return false;
    }
}
