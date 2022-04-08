import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
        private int RollNa;
        private String Name;
        private String DOB;
        private ClassStud classCurent;
        private int status;


        public Student(int RollNa,String Name, String DOB, ClassStud classCurent, int status ){
            this.RollNa= RollNa;
            this.Name = Name;
            this.DOB = DOB;
            this.classCurent = classCurent;
            this.status = status;
        }

    public void setRollNa(int rollNa) {
        RollNa = rollNa;
    }

    public int getRollNa() {
        return RollNa;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public Date getDOB() {

        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yy").parse(this.DOB);
        } catch (ParseException e){
            System.out.println(e);
        }
        return date1;
    }

    public void setClassCurent(ClassStud classCurent) {
        this.classCurent = classCurent;
    }

    public ClassStud getClassCurent() {
        return classCurent;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }


    @Override
    public String toString() {
        return "Student{" +
                "RollNa=" + RollNa +
                ", Name='" + Name + '\'' +
                ", DOB=" + DOB +
                ", classCurent=" + classCurent +
                ", status=" + status +
                '}';
    }
}
