public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Власов Георгий Владимирович", 18, "Студент");
        Student st2 = new Student("Кириллов Николай Алексеевич", 17, "Студент");
        Teacher tch1 = new Teacher("Сергеев Илья Александрович", 23, "Математик");
        Teacher tch2 = new Teacher("Спрыгин Николай Михайлович", 38, "Доцент");
        st1.setLogin("123");
        st1.setPassword("321");
        tch1.setLogin("thcccc");
        tch1.setPassword("126589");
        st1.display();
        tch1.display();
        People pp= new People("ghjk", 15, "vbnm");
        User u = new Meow("dfwf", 65646, "gfsgff");
    }
}
interface User{
    void setLogin(String login);
    String getLogin();
    void setPassword(String password);
    String getPassword();
}
abstract class People implements User{
    String login;
    String password;
    String fio;
    int age;
    String position;
    People(String fio, int age, String position){
        this.fio = fio;
        this.age = age;
        this.position = position;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public abstract void display();
}
class Teacher extends People{
    Teacher(String fio,int age, String position){
        super(fio,age,position);
    }
    public void display(){
        System.out.println("Преподаватель");
        System.out.println("ФИО: " + fio);
        System.out.println("Возраст: " + age);
        System.out.println("Должность: " + position);
        System.out.println("Логин: " + login);
        System.out.println("Пароль: " + password);
        System.out.println();
    }
}
class Student extends People{
    Student(String fio, int age, String position){
        super(fio,age,position);
    }
    public void display(){
        System.out.println("Cтудент");
        System.out.println("ФИО: " + fio);
        System.out.println("Возраст: " + age);
        System.out.println("Должность: " + position);
        System.out.println("Логин: " + login);
        System.out.println("Пароль: " + password);
        System.out.println();
    }
}
//class People extends People{
