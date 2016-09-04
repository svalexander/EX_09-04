package nyc.c4q.shannonalexandernavarro;

/**
 * Created by shannonalexander-navarro on 9/4/16.
 */

//In your project, create a new Java class called Student.
//
//        Build out your Student class to contain private fields for a first name, last name, ID number and favorite food. Create a getter and setter method for each field.
//
//        Create a constructor for your class.
//
//        Write a static method called checkSameFavoriteFood which accepts as input two Student instances and checks if they have the same favorite food. The method should return a boolean value.


public class Student {
    private String firstName = "Shannon";
    private String lastName = "Alexander";
    private int idNumber = 3331;
    private String favFood = "Coconut ice-cream";

    public int getIdNumber() {
        return idNumber;
    }

    public String getFavFood() {
        return favFood;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student(int idNumber, String firstName, String lastName, String favFood) {
       this.firstName = "Shannon";
        this.lastName = "Alexander";
        this.favFood = "Coconut ice-cream" ;
        this.idNumber= 3331;
    }

    //student2?
    public static Boolean checkSameFavoriteFood(Student, Student){
        if (Student.favFood.equals() == Student.favFood.equals()) {
            return true;
        }
    }
}
