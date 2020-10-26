public class Employee {


			   String name;
			   int age;
			   String city;

			   public void empName(String empName) {
			      name = empName;
			   }

			   public void empAge(int empAge) {
			      age = empAge;
			   }

			   public void empCity(String empCity) {
			      city = empCity;
			   }

			   public void printEmployee() {
			      System.out.println("Name:"+ name );
			      System.out.println("Age:" + age );
			      System.out.println("City:" + city );
			      
			   }
			}
		
