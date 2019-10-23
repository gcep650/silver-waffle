
public class Student extends Converters
{
    private String m_name;
    private long m_id;
    private double m_balance;
    private double m_gpa;

    public Student(String name, long id, double gpa, double balance)
    {
        m_name = name;
        m_id = id;
        m_balance = balance;
        m_gpa = gpa;
    }
    
    public String toString()
    {
        return "Student: " + m_name + "\n - ID: " + m_id + "\n - Balance: " 
        + getPrice(m_balance) + String.format("\n - GPA: %2.2f", m_gpa);
    }
    
    public static void main()
    {
        Student s = new Student("Billy Bob", 93469368, 5.432, 100.32);
        System.out.println(s);
    }
}
