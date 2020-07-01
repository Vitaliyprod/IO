import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee1 = new Employee("Alan", 8760087, 1000);
        Employee employee2 = new Employee("John", 7788545, 1120);
        Employee employee3 = new Employee("Mike", 2156279, 1200);
        Employee employee4 = new Employee("Fred", 9854310, 1250);
        Employee employee5 = new Employee("Deck", 9644712, 1275);
        Employee employee6 = new Employee("Creg", 5574216, 1300);
        List<Employee> empList= new LinkedList<>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);
        empList.add(employee6);
        Methods.serialize(empList);
        Methods.deserialize(empList);
    }
}