package week1.assignment1;
import java.time.LocalDate;
public class application {
    public static void main(String[] args){
        String [][] Students = new String [][]{
                {"Ahmet","Hakki", String.valueOf(LocalDate.parse("2008-11-03"))},
                {"Mehmet","Nafiz",String.valueOf(LocalDate.parse("2008-10-10"))},
                {"Recep","Sen",String.valueOf(LocalDate.parse("2008-09-09"))},
                {"Ugur","Yilmaz",String.valueOf(LocalDate.parse("2008-04-22"))},
                {"Naz","Nazli",String.valueOf(LocalDate.parse("2008-12-19"))},
                {"Emin","Demir",String.valueOf(LocalDate.parse("2008-07-22"))},
                {"Kazim","Karabekir",String.valueOf(LocalDate.parse("2008-09-11"))},
                {"Erdal","Kemirgen",String.valueOf(LocalDate.parse("2008-11-23"))},
                {"Hatice","Betül",String.valueOf(LocalDate.parse("2008-09-08"))},
                {"Feride","Kesin",String.valueOf(LocalDate.parse("2008-11-03"))},

        };

        String [][] Teachers = new String[][]{
                {"Arif","Karaibo",String.valueOf(LocalDate.parse("1987-05-15")),"Matemetik"},
                {"Mehmet","Hamdi",String.valueOf(LocalDate.parse("1976-01-12")),"Ingilizce"}
        };

        String[][] group1= {Students[0],Students[1],Students[2],Students[3],Students[4]};
        String[][] group2= {Students[5],Students[6],Students[7],Students[8],Students[9]};
        for (int i = 0; i <Students.length ; i++) {
            Person newStudent = new Student(Students[i][0],Students[i][1],Students[i][2]);
            System.out.println(newStudent.getFullPerson());
        }
        for (int i = 0; i <Teachers.length ; i++) {
            Person newTeacher = new Teacher(Teachers[i][0],Teachers[i][1],Teachers[i][2],Teachers[i][3]);
            System.out.println(newTeacher.getFullPerson()+" Bransi: "+ ((Teacher) newTeacher).getSpecialty());
        }
        classroom class1 = new classroom(Teachers[0], group1,"Schübelbach","A");
        classroom class2 = new classroom(Teachers[1], group2,"Schwyz","B");
        System.out.println(class1.getClasses());
        System.out.println(class2.getClasses());
    }
}