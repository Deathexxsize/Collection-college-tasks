package mapTasks.task1;


public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone();

        phone.addContact("Nur", 552323342);
        phone.addContact("Kamola", 777665055);
        phone.addContact("Kurmash",222357954);

        phone.getAllContacts();

        phone.removeContact("Kurmash", 777665055);

        phone.getContact("Nur"); // хз кароче не понял почему не работает


    }

}
