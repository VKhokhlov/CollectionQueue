import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<Person> attractionQueue = new LinkedList<>(generateClients());

        while (!attractionQueue.isEmpty()) {
            Person person = attractionQueue.poll();

            if (person.pickUpTicket() > 0) {
                attractionQueue.add(person);
            }

            System.out.println(person + " прокатился на аттракционе (осталось билетов: " + person.getTicketsCount() + ")");
        }
    }

    public static List<Person> generateClients() {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Иван", "Иванов", 3));
        persons.add(new Person("Петя", "Пупкин", 5));
        persons.add(new Person("Джек", "Воробей", 7));
        persons.add(new Person("Вова", "Путин", 9));
        persons.add(new Person("Дима", "Медведев", 2));

        return persons;
    }
}
