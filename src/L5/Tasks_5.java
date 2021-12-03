package L5;

public class Tasks_5 {

    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("Иван Васильевич Грозный", "Зам.директора", "vanyakol@mail.ru", "9086534764", 2340000, 57);
        employeeArray[1] = new Employee("Александр Сергеевич Пушкин", "Глава отдела рекламы", "pushka@mail.ru", "9047653423", 900000, 68);
        employeeArray[2] = new Employee("Джаред Лето", "Глава отдела по связям с общественностью", "cubbins@gmail.com", "9037658943", 850000, 41);
        employeeArray[3] = new Employee("Джеймс Оливер", "Разработчик", "genuislab@gmail.com", "9677852341", 902300, 32);
        employeeArray[4] = new Employee("Полина Ветрова", "middle android-разработчик", "noemail@mail.ru", "9023417123", 600000, 20);


        for (Employee employee : employeeArray) {
            if (employee.age >= 40) {
                employee.printEmployee();
            }
        }
    }
}
