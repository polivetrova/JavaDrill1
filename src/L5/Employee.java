package L5;

public class Employee {
    //закрыть поля прайватом! добавить геттера для возраста — потому что в задании нужен только возраст
    String fullName;
    String occupation;
    String email;
    String phoneNum;
    int salary;
    int age;

    public Employee(String fullName,String occupation, String email, String phoneNum, int salary, int age){
        this.fullName = fullName;
        this.occupation = occupation;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;

    }

    protected void printEmployee(){
        System.out.printf("ФИО сотрудника: %S.%nДолжность: %s. %nEmail: %s%nНомер телефона: %s%nОклад: %d руб.%n",fullName, occupation, email, phoneNum, salary);
        if(age % 10 == 1) {
            System.out.printf("Возраст: %d год.%n", age);
        } else if (age % 10 >= 2 && age % 10 <= 4){
            System.out.printf("Возраст: %d года.%n", age);
        } else {
            System.out.printf("Возраст: %d лет.%n", age);
        }
        System.out.println();
    }
}
