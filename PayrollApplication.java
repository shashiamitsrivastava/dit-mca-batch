
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

class PayrollApplication{
    static ResourceBundle rb;
    static Locale locale; // Member of a class (Class Member Variable) - Bind with a Class
    static void loadBundle(){
        rb = ResourceBundle.getBundle("message", locale);
    }
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
    static String currencyFormat(double val){
        // 10000.0
        // $10,000 - String
        NumberFormat obj = NumberFormat.getCurrencyInstance(locale);
        return obj.format(val);
    }
    static String dateFormat(){
        // System Date 
        Date date = new Date();
       // System.out.println(date);
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        return df.format(date);
    }
    // SRP 
    static void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for English");
        System.out.println("हिंदी के लिए 2 दबाएँ");
        int choice = scanner.nextInt();
        
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
        loadBundle();
        System.out.println(rb.getString("id.msg"));
        int id = scanner.nextInt();
        
        scanner.nextLine(); // eat \n
        System.out.println(rb.getString("name.msg"));
        String name= scanner.nextLine();
        System.out.println(rb.getString("salary.msg"));
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
       System.out.println(rb.getString("date.msg")+dateFormat());
        System.out.println("Emp Name "+properCase(name));
        System.out.println( rb.getString("allowances.msg")+" \t Deduction");
        System.out.println("Hra "+currencyFormat(hra)+"\t\t PF "+currencyFormat(pf));
        System.out.println("DA  "+currencyFormat(da)+"\t\t Tax "+currencyFormat(tax));
        System.out.println("MA  "+currencyFormat(ma));
        System.out.println("TA  "+currencyFormat(ta));
        System.out.println("GS "+currencyFormat(gs));
       
        System.out.println("NS "+currencyFormat(ns));
        
    }

    public static void main(String[] args) {
        input();
        
       
       
       
      
        


    }
}