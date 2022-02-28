
public class Question1 {
	
	
	 public static void PrintNumbers(Integer limit){

	        Integer i=1;

	        while(i <= limit){
	            if(i%3 == 0 && i%5 == 0){
	                System.out.println("Visual Nuts");
	            }else if (i%3 == 0){
	                System.out.println("Visual");
	            }else if (i%5 == 0){
	                System.out.println("Nuts");
	            }else{
	                System.out.println(i);
	            }
	            i++;
	        }

	    }


	    public static void main(String[] args) {
	    	

	        PrintNumbers(100);
	        
	    }

}
