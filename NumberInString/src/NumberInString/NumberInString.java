/* Sample Program just for Git configuration with Eclipse*/
package NumberInString;

public class NumberInString {

	  public static void main(String[] args) {
	        System.out.println("Hello, World!"); 
	 String s = "78,67,87,-1,10,12,0";
	       String s1[] = s.split(",");
	       int[] n= new int[10];
	       int temp;
		System.out.println("Sample Program");  
	       System.out.println(" Before parsing Int");
	       for (int i=0; i<s1.length; i++)
	       {
	           n[i] = Integer.parseInt(s1[i]);
	          
	       }
	       System.out.println(" Before comparison");
	       for (int i=0; i<n.length; i++)
	       {
	           for(int j=1; j<n.length; j++)
	           {
	               if(n[i]>n[j])
	               {
	                   temp = n[i];
	                   n[i]=n[j];
	                   n[j]=n[i];
	               }
	           }
	       } 
	       System.out.println(" Before Printing");
	       for(int i=0;i<n.length; i++)
	       {
	       System.out.println("Values in Order" + n[i]);
	       }
	       System.out.println("Program needs to be updated");
	      }
	}


