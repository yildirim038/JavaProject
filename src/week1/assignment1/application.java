package week1.assignment1;
public class application {
    public static void main(String[] args){
        String [][] Students = new String [][]{
                {"Ahmet","Hakki","15/3/2007"},
                {"Mehmet","Nafiz","4/3/2008"},
                {"Recep","Sen","22/3/2008"},
                {"Ugur","Yilmaz","16/8/2008"},
                {"Naz","Nazli","12/12/2008"},
                {"Emin","Demir","11/11/2008"},
                {"Kazim","Karabekir","12/6/2006"},
                {"Erdal","Kemirgen","12/3/2009"},
                {"Hatice","Betül","15/3/2007"},
                {"Feride","Kesin","22/3/2008"},

        };

        String [][] Teachers = new String[][]{
                {"Arif","Karaibo","22/1/1982","Matemetik"},
                {"Mehmet","Hamdi","15/3/1986","Ingilizce"}
        };

        for (int i = 0; i <Students.length ; i++) {
            Person newStudent = new Student(Students[i][0],Students[i][1],Students[i][2]);
            System.out.println(newStudent.getFullPerson());
        }
        for (int i = 0; i <Teachers.length ; i++) {
            Person newTeacher = new Teacher(Teachers[i][0],Teachers[i][1],Teachers[i][2],Teachers[i][3]);
            System.out.println(newTeacher.getFullPerson()+" Bransi: "+ ((Teacher) newTeacher).getSpecialty());
        }

    }
}