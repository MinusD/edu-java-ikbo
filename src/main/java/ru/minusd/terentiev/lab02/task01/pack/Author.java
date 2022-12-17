package pack;

public class Author {
    String name, email;
    char gender;

    public Author(String Name, String Email, char Gender) {
        name = Name;
        email = Email;
        gender = Gender;
    }

    ;

    public String getName() {
        return this.name;
    }

    ;

    public String getEmail() {
        return this.email;
    }

    ;

    public char getGender() {
        return this.gender;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String toString()
    {
        return this.name+" " +this.email+ " " + this.gender;
    }
}
