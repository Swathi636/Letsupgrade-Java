public class EmployeeSalMain {

   public static void main(String args[]) {
      
	   EmployeeSal empOne = new EmployeeSal("Smith");
	   EmployeeSal empTwo = new EmployeeSal("Mary Anne");

      empOne.empAge(26);
      empOne.empDesignation("Senior Software Engineer");
      empOne.empSalary(1000);
      empOne.printEmployee();

      empTwo.empAge(21);
      empTwo.empDesignation("Software Engineer");
      empTwo.empSalary(500);
      empTwo.printEmployee();
   }
}