package OOP_1;

public class Student extends User{

    String matric_no;
    String admission_no;


    String login() {

        if (admission_no.equals("") || matric_no.equals("")){
            return "Can't be empty";
        }
        else {
            return "Success";
        }
    }
    void registerCourses() {
        System.out.println("Course");
    }
    String checkResult() {
        return "cmp202" + "" +70;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.registerCourses();
        System.out.println(student.checkResult());
    }
}