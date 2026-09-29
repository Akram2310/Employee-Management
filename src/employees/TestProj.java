package employees;

import javax.swing.JOptionPane;

public class TestProj {

    // Null-safe input: a cancelled dialog returns "" instead of crashing.
    private static String ask(String message) {
        String result = JOptionPane.showInputDialog(null, message);
        return result == null ? "" : result.trim();
    }
    public static void main(String[] args) {
        Departments hrDepartment = new Departments("Human Resources", 5);
        Positions hrManagerPosition = new Positions("HR Manager", 80000);
        Departments itDepartment = new Departments("IT", 5);
        Positions itManagerPosition = new Positions("IT Manager", 90000);
        Manager hrManager1 = new Manager("david", "5 st.force", "adajg@djb.com", "036326323", hrDepartment, hrManagerPosition);
        Manager hrManager2 = new Manager("civic", "5 st.force56", "adajg@hvhab.com", "036354323", hrDepartment, hrManagerPosition);
        Manager hrManager3 = new Manager("civicO", "5 st.forcHHDe56", "adajg@hvhaSb.com", "036342323", hrDepartment, hrManagerPosition);
        
        Manager itManager1 = new Manager("Abdo", "5advncost.", "hfg@vuf", "0243435", itDepartment, itManagerPosition);
        Manager itManager2 = new Manager("Abdodd", "5nasrst..", "hello@jde3.com", "0243242435", itDepartment, itManagerPosition);
        Manager itManager3 = new Manager("sabf", "7nbhjqbd", "hhyhhw@dhh", "02487935", itDepartment, itManagerPosition);

        Developer javaDeveloper1 = new Developer("Mariam", "hybt5stvh.", "gvhyf@hghj", "0866564", "java");
        Developer javaDeveloper2 = new Developer("salma", "6nasrelost.", "bjdk@hf", "08668973", "c");
        Developer javaDeveloper3 = new Developer("kego", "9sandresoo", "hvjvjwq@hh", "08377", "java");
        

        hrDepartment.addEmployee(hrManager1);
        hrDepartment.addEmployee(hrManager2);
        hrDepartment.addEmployee(hrManager3);
        itDepartment.addEmployee(itManager1);
        itDepartment.addEmployee(itManager2);
        itDepartment.addEmployee(itManager3);
        itDepartment.addEmployee(javaDeveloper1);
        itDepartment.addEmployee(javaDeveloper2);
        itDepartment.addEmployee(javaDeveloper3);
        
        while (true) {
            String choice = ask("Please which department to enter\n1. Human Resources\n2. IT\n3. Exit");
            if(choice.isEmpty()){
                break;
            }
            else if(choice.equals("1")){
                String choice1 = ask("what is the operation required\n1.add \n2.remove");
                if(choice1.equals("1")){
                    String name = ask("Enter Manager's Name:");
                    String address = ask("Enter Manager's Address:");
                    String email = ask("Enter Manager's Email:");
                    String phoneNumber = ask("Enter Manager's Phone Number:");
                    Manager managerNew = new Manager(name, address, email, phoneNumber, hrDepartment, hrManagerPosition);
                    hrDepartment.addEmployee(managerNew);
                }
                else if(choice1.equals("2")){
                    String name = ask("Enter Manager's Name:");
                    hrDepartment.removeEmployee(name);
                }
            }
            else if(choice.equals("2")){
                String choice1 = ask("1.IT Manager\n2.Developer");
                if(choice1.equals("1")){
                    String choice2 = ask("what is the operation required\n1.add \n2.remove");
                    if(choice2.equals("1")){
                    String name = ask("Enter Manager's Name:");
                    String address = ask("Enter Manager's Address:");
                    String email = ask("Enter Manager's Email:");
                    String phoneNumber = ask("Enter Manager's Phone Number:");
                    Manager managerNew = new Manager(name, address, email, phoneNumber, itDepartment, itManagerPosition);
                    itDepartment.addEmployee(managerNew);
                    }
                else if(choice2.equals("2")){
                    String name = ask("Enter Manager's Name:");
                    itDepartment.removeEmployee(name);
                }
                }
                else if(choice1.equals("2")){
                    String choice2 = ask("what is the operation required\n1.add \n2.remove");
                    if(choice2.equals("1")){
                    String name = ask("Enter Developer's Name:");
                    String address = ask("Enter Developer's Address:");
                    String email = ask("Enter Developer's Email:");
                    String phoneNumber = ask("Enter Developer's Phone Number:");
                    String programmingLanguage = ask("Enter Developer's Programming Language:");
                    Developer developer = new Developer(name, address, email, phoneNumber, programmingLanguage);
                    itDepartment.addEmployee(developer);
                    }
                else if(choice2.equals("2")){
                    String name = ask("Enter Developer's Name:");
                    itDepartment.removeEmployee(name);
                }
                }
            }
            else if(choice.equals("3")){
                break;
            }
            else{
                System.out.println("Wrong Input");
            }
    }
    }
}
