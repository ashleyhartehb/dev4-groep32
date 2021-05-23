package user;

public class User {
    //initializing objects
    private String username;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int phone;
    private String[] subjects;
    private String[] interests;

    //constructor
    public User(String username, String firstName, String lastName, int age, String email, int phone, String[] interests){
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.subjects= new String[]{"C++", "C#", "java", "SQL", "javascript", "HTML", "CSS"};
        this.interests = interests;
    }
    //setters
    public void setUsername(String username){ this.username = username; }
    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    public void setAge(int age){ this.age = age; }
    public void setEmail(String email){ this.email = email; }
    public void setPhone(int phone){this.phone = phone;}
    public void setInterests(String[] interests){
        this.interests = interests;

    }

    //getters
    public String getUsername(){ return username;}
    public String getFirstName(){ return firstName;}
    public String getLastName(){ return lastName;}
    public int getAge(){ return age;}
    public String getEmail(){ return email;}
    public int getPhone(){ return phone;}
    public String[] getSubjects(){ return subjects;}
    public String[] getInterests(){ return interests;}

}

