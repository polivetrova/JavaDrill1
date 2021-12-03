package L15;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phoneNum;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNum, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNum =  phoneNum;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee(){
        System.out.printf("ФИО: %S%nДолжность: %s%nEmail: %s%nНомер телефона: %s%nЗарплата: %d руб.%n", name, position, email, phoneNum, salary);
        if(age % 10 == 1) {
            System.out.printf("Возраст: %d год%n", age);
        } else if (age % 10 >= 2 && age % 10 <= 4){
            System.out.printf("Возраст: %d года%n", age);
        } else {
            System.out.printf("Возраст: %d лет%n", age);
        }
        System.out.println();
    }

    public int getAge() {
        return age;
    }
}
