public class Course
{
    public String courseName;
    public int numberOfStudent;
    public Student[] students;

    public Course()
    {
    }

    public Course(String courseName, int numberOfStudent)
    {
        this.courseName = courseName;
        this.numberOfStudent = numberOfStudent;
    }

    public Student[] getStudents()
    {
        return students;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public int getNumberOfStudent()
    {
        return numberOfStudent;
    }

    // Description:
    //  Check whether the course is full
    // Return:
    //  boolean(true or false)
    //
    public boolean isFull()
    {
        if (numberOfStudent == 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Description:
    //  Register students to this course
    // Return:
    //  void
    //
    public void registerStudent(Student student)
    {
        if (!isFull())
        {
            students[numberOfStudent ++] = student;
        }
        else
        {
            System.out.println("Student " + student.getName() + ": The " + courseName + " course is full, please register another course.");
        }

    }
}
