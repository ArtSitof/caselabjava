package task3_1;

public class Task3_1 {
    public static void main(String[] args) {
        SinglyLinkedList<Employee> employees = new SinglyLinkedList<>();

        employees.addToTail(new Employee(1, "Иванов", 10));
        employees.addToTail(new Employee(2, "Петров", 12));
        employees.addToTail(new Employee(3, "Сидоров", 14));

        System.out.println("Односвязный список до инвертирования");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        System.out.println(" ");

        // Инвертируем односвязный список с помощью метода reverse
        employees.revers();
        System.out.println("Односвязный список после инвертирования");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
