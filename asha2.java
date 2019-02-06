import  java.util.scanner;

public class evenodd

{
  
  public static void main (string[] args)
  
  {
      
 scanner reader=new scanner(system.in);
   
     system.out.print("enter a number:");
     
   int num=reader.nextint();
     
   if (num%2==0)
    
    system.out.println(num+"is even");
 
       else
       
 system.out.println(num+"is odd");
 
   }

}

