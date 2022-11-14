package Class24_27_Review;

import java.util.Objects;

public class ArrayListDemo_Student {


        private String firstName;
        private String lastName;
        private String rollNumber;

    @Override
    public String toString() {
        return
                "firstName is '" + firstName + '\'' +
                ", lastName is '" + lastName + '\'' +
                ", rollNumber is '" + rollNumber + '\'' ;
    }

    void printName(){
        System.out.println(firstName+" "+lastName);
    }

   //If we dont overRide this method , java by default checks the address only to figuree out if two objects are same or not
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListDemo_Student student = (ArrayListDemo_Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, rollNumber);
    }

    public ArrayListDemo_Student(String firstName, String lastName, String rollNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;





    }
}

