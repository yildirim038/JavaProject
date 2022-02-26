package week1.assignment1;

public class Person {

        private String firstName;
        private String lastName;
        private String birthday;
public Person(){

}
            public Person (String pFirstName,String pLastName, String pBirthday){
            this.firstName=pFirstName;
            this.lastName=pLastName;
            this.birthday= pBirthday;
            }

            public String getFullPerson (){
            return this.firstName +" "+this.lastName+" "+"Dogum Tarihi:"+this.birthday;
            }

}
