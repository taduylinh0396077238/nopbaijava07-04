
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TestStudent {
    public static void main(String[] args){
        ClassStud Class1 = new ClassStud(1 , "T2109M");

        Student student = new Student(20, "Linh ","08/04/1999",Class1,16);
        System.out.println(student);
        System.out.println(student.getDOB());

        Student student1 = new Student(30,"T2109M","05/5/2022",Class1,9);
        System.out.println(student1);
        System.out.println(student1.getDOB());
    }
}
