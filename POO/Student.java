public class Student extends Person {
     private int noCourses;

     public Student(String n, int a, int nc){
        super(n, a);
        this.noCourses = nc;
     }

     public int getNoCourses(){
        return noCourses;
     }
}
