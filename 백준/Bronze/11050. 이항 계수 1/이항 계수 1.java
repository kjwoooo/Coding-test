import java.util.*;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  
	public static void main(String[] args)throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    StringTokenizer st = new StringTokenizer(br.readLine()," ");		    
		      long fd =  Long.parseUnsignedLong(st.nextToken());
		      long sd =  Long.parseUnsignedLong(st.nextToken());
		      
		      if(fd < sd)
		      {
		       long a= factorial(sd) / ((factorial(sd - fd))*factorial(fd));
		        System.out.println(a);
		      }
		      else{
		    	  long b= factorial(fd) / ((factorial(fd - sd))*factorial(sd));
		      System.out.println(b);
		      }
		      
		      
		    

		  }

		    static long factorial(long n) {
		        if (n == 1| n == 0) {
		            return 1;
		        }
		        return n * factorial(n - 1);
		 
		    }

		    
		  }
