 /********************************************************************
 * Programmer:      sveinson
 * Class:           CS30S
 *
 * Assignment:      CS30S Inheritance example
 *
 * Description:     a first look at inheritance in OOP using Java
 *                  using the Practitioner, Doctor, Pharmacist hierarchy
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.text.NumberFormat;
 import java.io.*;
 import java.util.ArrayList;

public class CS30SInheritanceExample {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;       // string data input from keyboard
        String strout;      // processed info string to be output
        String bannerOut;       // string to print banner to message dialogs

        String prompt;      // prompt for use in input dialogs

        String delim = "[ :]+"; // delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
        
    // ***** create objects *******
    
        //Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();    
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
    // the ProgramInfo class has both a default and initialized constructor
    // so you can choose which model you want to employ
    
        //ProgramInfo programInfo = new ProgramInfo();
        ProgramInfo programInfo = new ProgramInfo("CS30S Inheritance Example");
        
        //BufferedReader fin = new BufferedReader(new FileReader("demo1Data.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
        
    // ********** Print output Banner **********

        // System.out.println(programInfo.getBanner());
        // //fout.println(programInfo.getBanner());
            
    // // ************************ get input **********************

    // // ************************ processing ***************************
    
        // Practitioner practitioner1 = new Practitioner();
        // Doctor doctor1 = new Doctor("Bruce", "Wayne", "GP");
        
        // Doctor d2;
        
        // //practitioner1 = doctor1;
        // Practitioner practitioner2 = new Doctor("Ada", "Lovelace", "Surgeon");
        
        // // not allowed a practitioner is not a doctor
        // //d2 = practitioner1;
        
        // // what does toString() do?
        // System.out.println(doctor1);
        // System.out.println(doctor1.toString());
        // System.out.println(doctor1.getName());
        // System.out.println(doctor1.getFirstName());
        
        // System.out.println(practitioner2.getFirstName());
        // System.out.println(practitioner2.getName());
        
        // Doctor docTemp = (Doctor)practitioner2;
        // System.out.println(docTemp.getSpecialty());
        //System.out.println((Doctor)practitioner2.getSpecialty());
        
        ArrayList<Practitioner> list = new ArrayList<>();
        
        // create some objects in the hierarchy
        Practitioner pr = new Practitioner("Frodo", "Baggins");
        Doctor dr = new Doctor("Leia", "Organa", "Surgeon");
        Pharmacist ph = new Pharmacist("Luke", "Skywalker","Tatooine");
        
        // add objects to the list
        list.add(pr);
        list.add(dr);
        list.add(ph);
        
        // now iterat over the list
        String type;
        
        for(Practitioner p : list){
            //System.out.println(p);
            type = "Practitioner";
            
            if(p instanceof Doctor){
                //p.getSpecialty();
                // Doctor d = (Doctor)p;
                // d.getSpecialty();
                type = "Doctor";
            }
                
            if(p instanceof Pharmacist)
                type = "Pharmacist";
                
            System.out.println(type + " " + p);    
            
            
        }// end of for
        
        double salary = 89000.455676;
        String st = "Salary: " + currency.format(salary);
        
        System.out.println(st);


    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
        System.out.println(programInfo.getClosingMessage());
        //fout.println(programInfo.getClosingMessage());
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        //fout.close();               // close output stream
        
    }  // end main
}  // end class
