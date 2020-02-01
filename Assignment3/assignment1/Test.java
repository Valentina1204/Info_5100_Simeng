
public class Test
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Vincent",1);
        Student student2 = new Student("Peter",2);
        Student student3 = new Student("Apple",3);
        Student student4 = new Student("Bob",4);
        Student student5 = new Student("Charlie",5);
        Student student6 = new Student("David",6);
        Student student7 = new Student("Emma",7);
        Student student8 = new Student("Fred",8);
        Student student9 = new Student("Helen",9);
        Student student10 = new Student("Ice",10);
        Student student11 = new Student("Jack",11);

        Course Course1 = new Course("INFO 5100",0);
        Course1.students = new Student[10];
        Course Course2 = new Course("INFO 6205",0);
        Course2.students = new Student[10];

        Course1.registerStudent(student1);
        Course1.registerStudent(student2);
        Course1.registerStudent(student3);
        Course1.registerStudent(student4);
        Course1.registerStudent(student5);
        Course1.registerStudent(student6);
        Course1.registerStudent(student7);
        Course1.registerStudent(student8);
        Course1.registerStudent(student9);
        Course1.registerStudent(student10);
        Course1.registerStudent(student11);

        Course2.registerStudent(student3);
        Course2.registerStudent(student6);

        Student[] studentsOfCourse1 = Course1.getStudents();
        System.out.print("These students register " + Course1.courseName + " course : ");
        for (int i = 0; i < Course1.numberOfStudent; i ++)
        {
            System.out.print(studentsOfCourse1[i].getName() + " ");
        }

        System.out.print("\n");

        Student[] studentsOfCourse2 = Course2.getStudents();
        System.out.print("These students register " + Course2.courseName + " course : ");
        for (int i = 0; i < Course2.getNumberOfStudent(); i ++)
        {
            System.out.print(studentsOfCourse2[i].name + " ");
        }
    }
}
