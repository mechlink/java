/**
 * Name sorting exercise with File IO
 *
 * @Robert
 * @18 June 2018
 */

// A sample Java program to sort an array of names
// using Arrays.sort(). It by default sorts in
// ascending order
package Java2018;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class SortEx {
 String name = "Rob's name list";  
 String names[] = { "Larry", "Xavier", "Andrew", "William",
     "Stefan", "Harry", "Jason", "Peter", "Betty", "Mary" };     
   
 String fileName = "C:\\/Users/User/Downloads/java/sorted-name-list.txt";
      
public static void main(String[] args) {
    SortEx sort1 = new SortEx(); // invoke constructor  
    //System.out.println(displ1.name);
    sort1.nameSort();
    System.out.println(" ");
    sort1.writeFile();
    }

public void nameSort(){
   
System.out.println("original order of " + name);
  for (int i = 0; i < names.length; i++) {
  System.out.println(i+1 + ": " + names[i]);
  }
  Arrays.sort(names);

  System.out.println("\nafter sorting:");
  for (int i = 0; i < names.length; i++) {
  System.out.println( (i+1) + ": " + names[i]);
 }
 
 
}

public void writeFile(){
    
    String space = "";
    Arrays.sort(names);
     try{
          File file =new File(fileName);
    	  if(!file.exists()){
    	 	file.createNewFile();
    	  }
    	  FileWriter fw = new FileWriter(file,true);
    	  BufferedWriter bw = new BufferedWriter(fw);
    	  PrintWriter pw = new PrintWriter(bw);
          //
    	             	     	  
    	  pw.println("\nsorted name list:");
    	  for (int i = 0; i < names.length; i++) {
          pw.println(i+1 + ": " + names[i]);

   }
   System.out.println("Names appended to file " + fileName);
   System.out.println(" ");
   pw.close();
       }catch(IOException ioe){
    	   System.out.println("Exception occurred:");
    	   ioe.printStackTrace();
      }   
    
        
}



 }
   
