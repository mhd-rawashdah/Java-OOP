public class Person {
    // counter should still public so it is static
    public static int counter;
    private String firstName;
    private  String lastName;
    private  String address;
    private int dateOfBirth;
    private String nationality;
    private String city;
    private double weight;
    private double height;
    private boolean isMale;


    public Person() {

        this("Sonia", "Kaboor", "Bollywood", 1980, "indian", "Mombi", 50, 165, false);
    }

    public Person(String firstName, String lastName, String address, int dateOfBirth, String nationality, String city, double weight, double height, boolean isMale) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.city = city;
        this.weight = weight;
        this.height = height;
        this.isMale = isMale;

        System.out.println( ++ counter);
    }

    public String getFullName() {
        return  this.firstName + " " + this.lastName;
    }

    public  double getHeightInFeet() {
        return  this.height;
    }

    public int getAge() {
        return  2019 - this.dateOfBirth;
    }

    public void eating() {
        this.weight++;
        System.out.println("I am eating!");
    }

    public void getInfo() {
        System.out.println("FullName: "+ getFullName() + ", address: " + this.address + ", Age: " + this.getAge() + ", Nationality: "+ this.nationality + ", City: " + this.city);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
