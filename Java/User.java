package Java;

public class User extends Account{
    Integer id;
    String name;
    String document;
    String email;
    String password;
    
    public User(Integer id, String name, String document, String email, String password){
        super(id, name, document, email, password);
    }
}