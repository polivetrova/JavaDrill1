package L15;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Васин Вася Василич", "Директор", "imaboss@mail.ru", "89645105770", 999999990, 50);
        employees[1] = new Employee("Иванов Иван Иваныч", "Инженер", "lablabla@mail.ru", "89635281446", 24239000, 38);
        employees[2] = new Employee("Петров Петр Петрович", "еще один инженер", "blalabla@mail.ru", "89462956204", 12263200, 29);
        employees[3] = new Employee("Иванова Анна Петровна", "Главный инженер", "anna@gmail.com", "89026881208", 234328999, 41);
        employees[4] = new Employee("Петрова Анастасия Ивановна", "младший стажер", "youngandwild@bk.ru", "89036871230", 543200, 24);


        for (Employee employee : employees) {
            if(employee.getAge() > 40){
                employee.printEmployee();
            }
        }
    }
}
