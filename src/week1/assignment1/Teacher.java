package week1.assignment1;

public class Teacher extends Person {
    private String specialty;
    public String getSpecialty(){
        return this.specialty;
    }

    public Teacher(String pFirstName, String pLastName, String pBirthday,String pSpecialty) {
        super(pFirstName,pLastName,pBirthday);
        this.specialty=pSpecialty;
    }
}
