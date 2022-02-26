package week1.assignment1;

public class classroom {
        private String[] teacher;
        private String[][] students;
        private String location;
        private String name;


    public classroom(String[] teacher, String[][] group1, String Ort, String zimmer) {
        this.teacher= teacher;
        this.students=group1;
        this.location=Ort;
        this.name=zimmer;
    }
    public String getClasses (){
        return this.teacher +" "+this.students+" "+" location: "+this.location+" Sinif: "+this.name;
    }

}
