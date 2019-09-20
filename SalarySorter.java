import java.util.Comparator;
public class SalarySorter implements Comparator<Employee>
{
    public int compare(Employee o1, Employee o2)
    {
        return (int) (o2.getSalary() - o1.getSalary());
    }
}