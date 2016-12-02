package algorithms.array;

/**
 * Created by joshik on 10/21/16.
 */
public class Person {
    String lastName;
    String firstName;
    int age;

    public Person(String last, String first, int a){
        lastName = last;
        firstName = first;
        age = a;
    }

    public void displayPerson(){
        System.out.print("Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);

    }

    public String getLastName(){
        return lastName;
    }
}
