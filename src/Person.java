public class Person {
    private String fName;
    private String LName;
    private String email;

    public Person(String fName, String LName, String email, String gb009898674544579, double v) {
        this.fName = fName;
        this.LName = LName;
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public String getLName() {
        return LName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", LName='" + LName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
