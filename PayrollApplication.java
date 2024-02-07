
import java.util.Locale;
import java.util.Scanner;

class PayrollApplication{

    static String properCase(String name){
        // rAm KuMaR sHarMA
        // names[0] = rAm
        //names[1]= KuMaR
        //names[2]=sHarMA
        String fullName = "";
        String names[] = name.split(" ");
        for(int i = 0; i<names.length; i++){
            String n = String.valueOf(names[i].charAt(0))
            .toUpperCase() + 
            names[i].substring(1).toLowerCase();
            fullName = fullName+n+" ";

            // String val = names[i]; // rAm
            // char firstLetter = val.charAt(0);
            // String firstCapLetter = String.valueOf(firstLetter).toUpperCase();
            // String remName = names[i].substring(1)
            // .toLowerCase();
            // String n = firstCapLetter + remName;
            // fullName = fullName+n+" ";
        }
        return fullName;
    }
    // SRP 
    static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for English");
        System.out.println("हिंदी के लिए 2 दबाएँ");
        int choice = scanner.nextInt();
        Locale locale;
        if(choice == 1){
            locale = new Locale("en","US");
        }
        else if(choice ==2){
            locale =new Locale("hi", "IN");
        }
        else{
            locale = new Locale("en","US");
            System.out.println("Wrong Choice... Taking English as Default");
        }
        System.out.println("Enter the Id");
        int id = scanner.nextInt();
        
        scanner.nextLine(); // eat \n
        System.out.println("Enter the Name");
        String name= scanner.nextLine();
        System.out.println("Enter the Basic Salary");
        double basicSalary = scanner.nextDouble();
        compute(name, basicSalary);
        scanner.close();
    }
    static void compute(String name, double basicSalary){
        double hra  = basicSalary * 0.50;
        double ta = basicSalary * 0.40;
        double ma = basicSalary * 0.25;
        double da = basicSalary * 0.20;
        double pf = basicSalary * 0.05;
        double gs = basicSalary + hra + da + ta + ma;
        double tax = computeTax(gs);
        double ns = gs - pf - tax;
        print(name, gs, hra, ta, ma, da, pf, tax, ns);
    }
    static double computeTax(double gs){
        
        double annual = gs * 12;
        if(annual>500000 && annual <700000){
            return (annual * 0.10)/12;
        }
        else if(annual>700000 && annual<900000){
            return (annual * 0.20)/12;
        }
        else if(annual>900000){
            return (annual * 0.30)/12;
        }
        return 0.0;
    }
    static void print(String name , double gs, double hra, double ta, double ma, double da, double pf, double tax, double ns){
        System.out.println("Emp Name "+properCase(name));
        System.out.println("Earning Allowances  \t Deduction");
        System.out.println("Hra "+hra+"\t\t PF "+pf);
        System.out.println("DA  "+da+"\t\t Tax "+tax);
        System.out.println("MA  "+ma);
        System.out.println("TA  "+ta);
        System.out.println("GS "+gs);
       
        System.out.println("NS "+ns);
        
    }

    public static void main(String[] args) {
        input();
        
       
       
       
      
        


    }
}