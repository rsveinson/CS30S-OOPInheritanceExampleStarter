/********************************************************************
 * Programmer:	sveinson
 * Class:  CS30S
 *
 * Assignment: Inheritance example
 *
 * Description: Doctor class extends (is a sub-class of) Practitioiner
 ***********************************************************************/

// import libraries as needed here

public class Doctor extends Practitioner{
    //*** Class Variables ***
    
    //*** Instance Variables ***
    private String specialty;
    
    //*** Constructors ***
    public Doctor(){
        // implicit call to the super class no-arg constructor
        specialty = "unknown";
    }// end no-arg constructor
    
    public Doctor(String fn, String ln, String sp){
        // must make an explicit call to the super-class constructor
        super(fn, ln);
        specialty = sp;
    }// end full-arg constructor
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    
    //*** Getters ***
    public String getSpecialty(){
        return specialty;
    }// end get specialty;
    
    //*** Setters ***
    public void setSpecialty(String sp){
        specialty = sp;
    }// end set specialty
    
    // other methods
    
    //override getname
    
} // end of public class
