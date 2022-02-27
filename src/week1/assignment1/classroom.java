package week1.assignment1;

import java.util.Arrays;

public class classroom {
        private final String[] teacher;
        private final String[][] students;
        private final String location;
        private final String name;


    public classroom(String[] teacher, String[][] group1, String Ort, String zimmer) {
        this.teacher= teacher;
        this.students=group1;
        this.location=Ort;
        this.name=zimmer;
    }
    public String getClasses (){
        return Arrays.toString(this.teacher) +" "+ Arrays.deepToString(this.students) +" "+" location: "+this.location+" Sinif: "+this.name;
    }

}
