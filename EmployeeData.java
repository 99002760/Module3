import java.util.ArrayList;
import java.util.List; 
class Employee{  
int id;  
String name,address;  
int mobile;  
public Employee(int id, String name, String address, int mobile) {
	// TODO Auto-generated constructor stub
	 this.id = id;  
	 this.name = name;  
	 this.address = address;    
	 this.mobile = mobile; 
}
}  
public class EmployeeData {  
public static void main(String[] args) {   
    List<Employee> list=new ArrayList<Employee>();  
    Employee e1=new Employee(1,"Jo","Bangalore",834565755);  
    Employee e2=new Employee(2,"Mini","Mysore",987654332);  
    Employee e3=new Employee(3,"Lak","Chennai",807421566);  
    list.add(e1);  
    list.add(e2);  
    list.add(e3);   
    for(Employee e:list){  
        System.out.println("Empid:"+e.id+" "+"Empname:"+e.name+" "+"Empaddress:"+e.address+" "+"Empmobile:"+e.mobile);  
    }  
}  
}  