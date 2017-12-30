import java.rmi.registry.*;
import java.util.Scanner;


public class TreatmentClient {

    public TreatmentClient(){
        String chosenNumber;
        String InstitustionName;

        Scanner scanner = new Scanner(System.in);

            System.out.println("Pass the institution name");
            InstitustionName=scanner.next();



            System.out.print("--------------------------------------------------------------------------------\n");
            System.out.print("- 1.Add Employee                                                               -\n");
            System.out.print("- 2.Delete Employee                                                            -\n");
            System.out.print("- 3.Update Employee                                                            -\n");
            System.out.print("- 4.Find Employee                                                              -\n");
            System.out.print("- 0.Exit                                                                       -\n");
            System.out.print("--------------------------------------------------------------------------------\n");


           

            while (true) {
                do {
                    chosenNumber = scanner.next();
                } while ( chosenNumber.equals('1') || chosenNumber.equals('2') || chosenNumber.equals('3') || chosenNumber.equals('4') || chosenNumber.equals('0')  );

                switch (chosenNumber) {
                    case "1":
                        System.out.print("Pass Employee name\n");
                        String EmployeeName=scanner.next();
                        System.out.print("Pass Emloyee Family Name\n");
                        String EmployeeFamilyName=scanner.next();
                        System.out.print("pass Employee CIN\n");
                        Integer EmployeeCIN= Integer.valueOf(scanner.next());
                        System.out.print("Pass Employee Telephone Number\n");
                        Integer EmployeeTel= Integer.valueOf(scanner.next());

                        try {
                            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
                            FabTreatmentInterface factory = (FabTreatmentInterface) reg.lookup("Factory");
                            TreatmentInterface TraitmnentObj;
                            TraitmnentObj = (TreatmentInterface) factory.newTreatmentImpl();

                            Employee emp1 =new Employee(EmployeeName,EmployeeFamilyName,EmployeeCIN,EmployeeTel);

                            TraitmnentObj.addEmployee(InstitustionName,emp1);
                        }
                        catch(Exception e)
                        {
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!Access ERORR !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println(e.toString());
                        }
                       

                    break;
                    case "2":
                        System.out.print("pass CIN of the Employee to Delete\n");
                        int cin1= Integer.parseInt(scanner.next());
                        try {
                            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
                            FabTreatmentInterface factory = (FabTreatmentInterface) reg.lookup("Factory");
                            TreatmentInterface TraitmnentObj;
                            TraitmnentObj = (TreatmentInterface) factory.newTreatmentImpl();
                            TraitmnentObj.deleteEmployee(InstitustionName,cin1);
                        }
                        catch(Exception e)
                        {
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!Access ERORR !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println(e.toString());
                        }
                       

                    break;
                    case "3":
                        System.out.print("Pass Employee Name\n");
                        String EmployeeName2=scanner.next();
                        System.out.print("Pass Employee Family Name\n");
                        String EmployeeFamilyName2=scanner.next();
                        System.out.print("Pass Employee CIN\n");
                        Integer EmployeeCIN2= Integer.valueOf(scanner.next());
                        System.out.print("Pass Employee Telephone Number\n");
                        Integer EmployeeTel2= Integer.valueOf(scanner.next());
                        try {
                            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
                            FabTreatmentInterface factory = (FabTreatmentInterface) reg.lookup("Factory");
                            TreatmentInterface TraitmnentObj;
                            TraitmnentObj = (TreatmentInterface) factory.newTreatmentImpl();
                            Employee emp2 =new Employee(EmployeeName2,EmployeeFamilyName2,EmployeeCIN2,EmployeeTel2);
                            TraitmnentObj.updateEmployee(InstitustionName,emp2);
                        }
                        catch(Exception e)
                        {
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!Access ERORR !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println(e.toString());
                        }
                    break;
                    case "4":
                        Employee emp3 ;
                        System.out.print("Pass CIN of the Employee to find\n");
                        int cin2= Integer.parseInt(scanner.next());
                        try {
                            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
                            FabTreatmentInterface factory = (FabTreatmentInterface) reg.lookup("Factory");
                            TreatmentInterface TraitmnentObj;
                            TraitmnentObj = (TreatmentInterface) factory.newTreatmentImpl();
                            emp3=TraitmnentObj.findEmployee(InstitustionName,cin2);
                            System.out.print(emp3.getDescription());
                        }
                        catch(Exception e)
                        {
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!Access ERORR !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println(e.toString());
                        }

                    break;
                    case "0":
                        System.exit(0);
                    break;

                }
            }
        }

       
    }