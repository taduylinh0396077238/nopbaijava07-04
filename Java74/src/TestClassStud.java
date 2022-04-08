public class TestClassStud {
    public static void main(String[] args) {
        ClassStud lane1 = new ClassStud(1, "Duy Linh");
        System.out.println(lane1);
        System.out.println(lane1.getClassId());
        System.out.println(lane1.getClassName());

        lane1.setClassId(10);
        lane1.setClassName("Linh Đẹp Zai");
        System.out.println(lane1);
    }
}
