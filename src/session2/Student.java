package session2;
public class Student {
    private String name;

    private String javaLevel;

    public void setName (String studentName) {
        name = studentName;
    }
    public void setJavaLevel (String JavaLevel) {
        javaLevel = JavaLevel;
    }
        public void printDetails() {
        System.out.println(name + " Java skills level is " + javaLevel);
    }
}
