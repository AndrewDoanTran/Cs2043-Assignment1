public class Grade
{	
	private final String Course_name;
	private final String grade_Let;
	private final double grade_point;
	private final double credit_Hours;
    
    public Grade(String Course_name, String grade_Let, double grade_Point, double credit_Hours)
    {   
        if (Course_name == "" || grade_Let == "" || credit_Hours <= 0.0) throw new Exception ("Empty Grade items are not allowed");
        this.Course_name = nameIn;
        this.grade_Let = grade_Let;
        this.grade_Point = grade_Point;
        this.credit_Hours = credit_Hours;
    }

    public String get_Course_name ()
    {
        return Course_name;
    }

    public String get_grade_Let ()
    {
        return grade_Let;
    }

    public double get_grade_point ()
    {
        return grade_point;
    }

    public double get_credit_Hours()
    {
        return credit_Hours;
    }

    public String toString()
    {
        System.out.println("Course name: %s,Grade Letter: %s, Grade_Point: %d, Credit Hours: %d", Course_name, grade_Let, grade_point, credit_Hours);
    }
}
