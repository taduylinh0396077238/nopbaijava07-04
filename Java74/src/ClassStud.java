public class ClassStud {
    private int ClassId;
    private String ClassName;


    public ClassStud(int ClasId, String ClassName){
        this.ClassId = ClasId;
        this.ClassName = ClassName;

    }
    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int classId) {
        ClassId = classId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    @Override
    public String toString() {
        return "ClassStud{" +
                "ClassId=" + ClassId +
                ", ClassName='" + ClassName + '\'' +
                '}';
    }
}
