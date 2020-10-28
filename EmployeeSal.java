 import java.util.Scanner;

    class EmployeeSal
    {
        int Id;
        String Name;
        int Age;
        long Salary;

        void GetData()  
        {

            Scanner sc = new Scanner(System.in);

            System.out.print("\n\tEnter Employee Id : ");
            Id = Integer.parseInt(sc.nextLine());

            System.out.print("\n\tEnter Employee Name : ");
            Name = sc.nextLine();

            System.out.print("\n\tEnter Employee Age : ");
            Age = Integer.parseInt(sc.nextLine());

            System.out.print("\n\tEnter Employee Salary : ");
            Salary = Long.parseLong(sc.nextLine());

        }

        void PutData()          
        {

            System.out.print("\n\tEmployee Id : "+Id);
            System.out.print("\n\tEmployee Name : "+Name);
            System.out.print("\n\tEmployee Age : "+Age);
            System.out.print("\n\tEmployee Salary : "+Salary);

        }

        public static void main(String args[])
        {

            EmployeeSal E = new EmployeeSal();

            E.GetData();          
            E.PutData();         

        }
    }
