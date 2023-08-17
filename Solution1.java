package example;

public class Solution1 {
	public static void main(String[] args) {
		Employee e1=new Employee(1234,"tom");
		Employee e2=new Employee(124,"smith");
        Employee e3=new Employee(123,"jerry");
        
        Employee []emp= {e1,e2,e3};
        
        for(int i=0;i<emp.length;i++) {
        	System.out.println(emp[i]);
        }
        System.out.println("=================");
        for(int i=0;i<emp.length;i++) {
        	System.out.println(emp[i].id+" "+emp[i].name);
        }
        
	}

}
