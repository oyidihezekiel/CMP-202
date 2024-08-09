package OOP_1

public class Admin extends User{
    String staffNo;
    String uploadResult(
        String course ,Float score){
        System.out.println(course=" "+ score);
        return course;
    }
}
