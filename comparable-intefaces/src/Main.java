public class Main {
    public static void main(String[] args) {
        Book vikramaadheethan = new Book(200, "Vikramaadheethan Stories", "Balaji");
        Book vikramaadheethan_ = new Book(235, "Vikramaadheethan Story", "Bala");
        int compare = vikramaadheethan_.compareTo(vikramaadheethan);
        System.out.println(compare);

        // person static count chekc
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        System.out.println("(" + person4.localCount + "," + Person.instanceCount + ")");
    }
}
