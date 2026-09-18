@SuppressWarnings("unused")
public class Student_hvr {
   private int rollno;
    private String name;    
    private boolean isAttended;
    
    public Student_hvr(int rollno) {
        this.rollno = rollno;
    }
    public void setstudentattendance(boolean flag) {
        if(!isAttended) {
            isAttended = flag;
            System.out.println("Student is attended");
        }
    }
    public boolean getstudentattendance() {
        System.out.println("teacher accessed student attendance");
        return isAttended;
    }
}
