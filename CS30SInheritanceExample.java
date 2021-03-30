 /********************************************************************
 * Programmer:      sveinson
 * Class:           CS30S
 *
 * Assignment:      CS30S Inheritance example
 *
 * Description:     a first look at inheritance in OOP using Java
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

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
        //NumberFormat currency = NumberFormat.getCurrencyInstance();    
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
    // the ProgramInfo class has both a default and initialized constructor
    // so you can choose which model you want to employ
    
        //ProgramInfo programInfo = new ProgramInfo();
        ProgramInfo programInfo = new ProgramInfo("CS30S Inheritance Example");
        
        //BufferedReader fin = new BufferedReader(new FileReader("demo1Data.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
        
    // ********** Print output Banner **********

        System.out.println(programInfo.getBanner());
        //fout.println(programInfo.getBanner());
            
    // ************************ get input **********************

    // ************************ processing ***************************
        


    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
        System.out.println(programInfo.getClosingMessage());
        //fout.println(programInfo.getClosingMessage());
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        //fout.close();               // close output stream
        
    }  // end main
}  // end class
