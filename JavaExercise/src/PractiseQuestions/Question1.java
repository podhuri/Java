package PractiseQuestions;

public class Question1 {

	public static void main(String[] args) {
			
		/*String str ="Hello how are you";
		for(int i=0;i<str.length();i++) {
			if()
		}*/
		
		 String stmt = "Hello How are you";
		    char a[] = {'a','e','i','o','u'};
		    char z[] = stmt.toCharArray();
		    
		    for(int i = 0;i<=z.length-1;i++){
		    	for(int j=0;j<=a.length-1;j++) {
		    		if (z[i]==a[j]){
	    				System.out.println(z[i]);
	    			if(j==5) {
	    				j=0;
	    			}
		    		/*if(j==5) {
		    			if (z[i]==a[j]){
		    				System.out.println(z[i]);
		    				
		    			}
		    					j=0;
		    		}
		    		else{
		    			if (z[i]==a[j]){
		    				System.out.println(z[i]);
		    			}
		    		}    	
		    	*/	}
		        
		    }
	      
	}
	}
}
	
	
