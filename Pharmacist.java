/********************************************************************
 * Programmer:	sveinson
 * Class:  CS30S
 *
 * Assignment: Inheritance example
 *
 * Description: Pharmacist class extends (is a sub-class of) Practitioiner
 ***********************************************************************/
// import libraries as needed here

public class Pharmacist extends Practitioner{
    //*** Class Variables ***
    
    //*** Instance Variables ***
    private String location;
    
    //*** Constructors ***
    public Pharmacist(){
        // implicit call to the super class no-arg constructor
        location = "unknown";
    }// end no-arg constructor
    
    public Pharmacist(String fn, String ln, String l){
        // must make an explicit call to the super-class constructor
        super(fn, ln);
        location = l;
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
    public String getLocation(){
        return location;
    }// end get location
    
    //*** Setters ***
    public void setLocation(String l){
        location = l;
    }// end getlocation
    
} // end of public class
