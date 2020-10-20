import java.util.*; 
class Employee implements Comparable<Employee> 
{ 
    private int id; 
    private String name; 
    private String address; 
  
    public int compareTo(Employee e) 
    { 
        return this.id - e.id; 
    } 
  
    public Employee(String ename, int eid, String eaddress) 
    { 
        this.name = ename; 
        this.id = eid; 
        this.address = eaddress; 
    } 
  
    public int getId() { return id; } 
    public String getName()   {  return name; } 
    public String getAddress()      {  return address;  } 
    } 
      
    class JavaComparable
    { 
        public static void main(String[] args) 
        { 
            ArrayList<Employee> list = new ArrayList<Employee>(); 
            list.add(new Employee("Jo", 1, "Bnglr")); 
            list.add(new Employee("Mini", 5, "Chennai")); 
            list.add(new Employee("Sree", 3, "Mysore")); 
            list.add(new Employee("Lak", 2, "Vellore")); 
      
            Collections.sort(list); 
      
            System.out.println("After sorting : "); 
            for (Employee emp: list) 
            { 
                System.out.println(emp.getId() + " " + 
                                   emp.getName() + " " + 
                                   emp.getAddress()); 
            } 
        } 
    } 