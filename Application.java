import java.util.*;
public class Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);

		String aadhaarid;
		String name;
		int age;
		String email;
		 float salary;
		 int flatno;
			String street;
			String city;
			String country;
			int pincode;
			Address ad1;
ArrayList<Employee> emp =new ArrayList<Employee>();
HashMap<String,List<Employee>> map=new HashMap<String,List<Employee>>();  
for(int i=0;i<2;i++) {
System.out.println("enter aadhaarid;\r\n" + "name\r\n" + "age;\r\n" + "email;\r\n" + "salary flatno;\r\n" + 
		"Street;\r\n" + 
		"city;\r\n" + 
		"country;\r\n" + 
		"pincode;");
aadhaarid=sc.next();
name=sc.next();
age=sc.nextInt();
email=sc.next();
salary=sc.nextFloat();
flatno=sc.nextInt();
 street=sc.next();city=sc.next();
 country=sc.next();
 pincode=sc.nextInt();
ad1=new Address( flatno, street,city,country,pincode);
emp.add(new Employee(aadhaarid,name,age,email,salary,ad1));
map.put(aadhaarid,emp);
	}
for(int i=0;i<2;i++)
//while(emp.hasMoreElements())
System.out.println(emp);
Collections.sort(emp, new Sorter()
        .thenComparing(new AgeSorter())
        .thenComparing(new SalarySorter()));

for(int i=0;i<2;i++)
//while(emp.hasMoreElements())
System.out.println(emp);
System.out.println("enter aadhaar number");
aadhaarid=sc.next();	
if(map.containsKey(aadhaarid))
          System.out.println(aadhaarid+"==>"+map.get(aadhaarid));
else
	System.out.print("ddd"+map.size());
   
	// TODO Auto-generated method stub
	
}

	}
