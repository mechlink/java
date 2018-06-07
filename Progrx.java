
/**
 * Java exercise in building contructors
 *
 * @author Robert Goh
 * @version 7 June 2018
 */
public class Progrx{
  // instance variables - replace the example below with your own
  int a;
  int b=88;
  String name;
  
    /**
     * Constructor for objects of class Programming
     */
 
       Progrx(){
       //constructor A with no auguments
       System.out.println("Constructor method A called.");
       
  }
 
       Progrx(int a, String name){
       //constructor B with two auguments   
       this.a=a;
       this.name = name;
       System.out.println("Constructor method B called.");
       
  }
  
  
  public static void main(String[] args) {
  Progrx rob1 = new Progrx();   // Invoke constructor A with no arguments
  rob1.setNum(22);
  rob1.setName("rob22");
  System.out.println("name = " + rob1.name );
  System.out.println("a = " + rob1.a);
  System.out.println("b = " + rob1.b);
      
  System.out.println("");   
  
  int a=77;
  String name="Joe77";
  Progrx rob2 = new Progrx(a, name);   // Invoke constructor B with two arguments
  System.out.println("name = " + rob2.name );
  System.out.println("a = " + rob2.a);
  System.out.println("b = " + rob2.b);
  
  
    
  }
  
  void setName(String t) {
    name = t;
}

void setNum(int i){
    a=i;
    
}
}

