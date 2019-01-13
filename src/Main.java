public class Main {
    public static void main (String[] args) {

        // create  array of object from Person class that contain 4 object

        Person[] arrayOfPersons = new Person[4];

        arrayOfPersons[0] = new Person("Mohamad", "Hasan", "Amman", 1994, "syrian", "amman", 100, 183, true);
        arrayOfPersons[1] = new Person("Walid", "haj", "amman", 1991, "jordinan", "amman", 100, 176, true);
        arrayOfPersons[2] = new Person("omar", "omar", "amman", 1994, "iraqian", "Amman", 75, 179, true);
        arrayOfPersons[3] = new Person("Mohannad", "Mohannad", "Amman", 1994, "jordinan", "amman", 100, 180, true);


        System.out.println(Person.counter);

        Task task= new Task("toDO", false);
        task.runTask();
    }
}
