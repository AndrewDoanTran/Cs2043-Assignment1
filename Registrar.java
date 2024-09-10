import java.util.List;

public class Registar
{
    public static double convertLetterToGPA(String letterGradeIn)
    {
        switch (letterGradeIn.toUpperCase()) 
        {
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                throw new IllegalArgumentException("Invalid letter grade: " + letterGrade);
        }

    }

    public static double calculateGPA(List<Grade> grades)
    {
        double final_Points = 0.0;
        double total_Credits = 0.0;

        for (Grade grade : grades)
        {
            final_Points += grade.get_grade_point()*grade.get_credit_Hours();
            total_Credits += grade.get_credit_Hours();
        }

        if (totalCredits == 0.0)
        {
            return 0.0;
        }
        else
        {
            return final_Points/total_Credits;
        }
    }
}