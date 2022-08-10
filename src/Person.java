public class Person {
    private String name;
    private String surname;
    private int ticketsCount;

    public Person(String name, String surname, int ticketsCount) {
        this.name = name;
        this.surname = surname;
        this.ticketsCount = ticketsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTicketsCount() {
        return ticketsCount;
    }

    public void setTicketsCount(int ticketsCount) {
        this.ticketsCount = ticketsCount;
    }

    public int pickUpTicket() {
        if (ticketsCount > 0) {
            ticketsCount--;
        }

        return ticketsCount;
    }

    @Override
    public String toString() {
        return name + ' ' + surname;
    }
}
