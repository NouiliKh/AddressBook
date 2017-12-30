import java.rmi.registry.*;
import java.util.Scanner;


public class TreatmentClient {

    public static void main(String[] args) {
        String chosenNumber;

        if (args.length != 1)
        {
            System.out.println("Pass the institution name");
            System.exit(0);
        }
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            FabTreatmentInterface factory = (FabTreatmentInterface) reg.lookup("Factory");
            TreatmentInterface TraitmnentObj;
            TraitmnentObj = (TreatmentInterface) factory.newTreatmentImpl();


            System.out.print("--------------------------------------------------------------------------------\n");
            System.out.print("- 1.Add Employee                                                               -\n");
            System.out.print("- 2.Delete Employee                                                            -\n");
            System.out.print("- 3.Update Employee                                                            -\n");
            System.out.print("- 4.Find Employee                                                              -\n");
            System.out.print("- 0.Exit                                                                       -\n");
            System.out.print("--------------------------------------------------------------------------------\n");
            Scanner scanner = new Scanner(System.in);


           

            while (true) {
                do {
                    chosenNumber = scanner.next();
                } while ( chosenNumber.equals('1') || chosenNumber.equals('2') || chosenNumber.equals('3') || chosenNumber.equals('4') || chosenNumber.equals('0')  );

                switch (chosenNumber) {
                    case "1":
                        System.out.print("ektb el esm\n");
                        String EmployeeName=scanner.next();
                        System.out.print("ektb el la9ab\n");
                        String EmployeeFamilyName=scanner.next();
                        System.out.print("ektb el cin\n");
                        Integer EmployeeCIN= Integer.valueOf(scanner.next());
                        System.out.print("ektb el tel\n");
                        Integer EmployeeTel= Integer.valueOf(scanner.next());

                        Employee emp1 =new Employee(EmployeeName,EmployeeFamilyName,EmployeeCIN,EmployeeTel);

                        TraitmnentObj.addEmployee(args[0],emp1);
                       

                    break;
                    case "2":
                        System.out.print("CIN of the Employee to Upadte\n");
                        int cin1= Integer.parseInt(scanner.next());
                        TraitmnentObj.deleteEmployee(args[0],cin1);
                       

                    break;
                    case "3":
                        System.out.print("ektb el esm\n");
                        String EmployeeName2=scanner.next();
                        System.out.print("ektb el la9ab\n");
                        String EmployeeFamilyName2=scanner.next();
                        System.out.print("ektb el cin\n");
                        Integer EmployeeCIN2= Integer.valueOf(scanner.next());
                        System.out.print("ektb el tel\n");
                        Integer EmployeeTel2= Integer.valueOf(scanner.next());
                        Employee emp2 =new Employee(EmployeeName2,EmployeeFamilyName2,EmployeeCIN2,EmployeeTel2);
                        TraitmnentObj.updateEmployee(args[0],emp2);
                       

                    break;
                    case "4":
                        Employee emp3 ;
                        System.out.print("CIN of the Employee to find\n");
                        int cin2= Integer.parseInt(scanner.next());
                        emp3=TraitmnentObj.findEmployee(args[0],cin2);
                        System.out.print(emp3.getDescription());
                       

                    break;
                    case "0":
                        System.exit(0);
                    break;

                }
            }
        }

        catch(Exception e)
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!Access ERORR !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println(e.toString());
        }

    }
}