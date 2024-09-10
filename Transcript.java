import java.util.ArrayList;

public class Transcript
{	
	private final int stu_id;
    private final ArrayList<grade> grades;
    private double final_GPA;

    public Transcript(int stu_id)
    {
        this.stu_id = stu_id;
        this.grades = new ArrayList<>();
    }

    public int get_stu_id()
    {
        return stu_id;
    }

    public void add_Grade(Grade gradeIn)
    {
        grades.add(gradeIn);
    }

    public void clearGrades()
    {
        grades.clear();
        final_GPA = 0.0;
    }

    public List<grade> getGrades()
    {
        return new ArrayList<>(grades);
    }

    public double calculate_GPA ()
    {
        return final_GPA = Register.add_all_grades(grades);
    }

    public toString()
    {   
        if (final_GPA == 0.0)
        {
            System.out.println("Student ", stu_id, "GPA Nan" );
        }
        else
        {
            System.out.println("Student ", stu_id, "GPA ",  final_GPA);
        }
    }

    public String printTranscript()
    {
        System.out.println("Student ", stu_id, "GPA ", final_GPA);
        for (Grade grade : grades)
        {
            grade.to_String();
        }
    }
}
