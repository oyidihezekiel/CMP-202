public class Person {
    private String schoolName = "Bingham University";
    private String name;
    private String password;
    private int staffNo;
    private String matricNo;

    Person() {
        System.out.println("object Constructor");
    }

    public Person (String name ,
                   String password,
                   String schoolName,
                   String matricNo) {
        this.name = name;
        this.password = password;
        this.matricNo = matricNo;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "person{" +
                "schoolName='" + schoolName + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", staffNo=" + staffNo +
                ", matricNo='" + matricNo + '\'' +
                '}';
    }

    public Person(String schoolName, String name, String password, int staffNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.staffNo = staffNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    void displayName() {
        System.out.println(name);
    }
}