package OOP_1;

public class User {
    String name;
    String password;


    String login(){
      return " You're logged In";
    }

    String Register(){
        if(name.equals("obianuju") || password.equals("123456")){
            return "can't be Empty";
        }
        else {
            return "Successfully Registered";
        }
    }
}