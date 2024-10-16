public class App {
    public static void main(String[] args) {
        Student student = new Student("Peruano", 20, 2);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getNoCourses());
        student.celebrateBday();
        System.out.println(student.getAge());
    }
}
