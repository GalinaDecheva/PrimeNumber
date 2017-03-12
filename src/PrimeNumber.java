import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrimeSqrAdv(int a){
		boolean isPrime = true;
		if(a % 2 == 0) return false;
		int sqrtA = (int)Math.sqrt(a);
		for(int b = 3; b <= sqrtA; b+=2){
	    	if(a % b == 0){
	    		isPrime = false;
	    		break;
	    		}
	    	}
		return isPrime;
	    
	}
	public static boolean isPrimeSqr(int a){
		boolean isPrime = true;
		int sqrtA = (int)Math.sqrt(a);
		for(int b = 2; b <= sqrtA; b++){
	    	if(a % b == 0){
	    		isPrime = false;
	    		break;
	    		}
	    	}
		return isPrime;
	    
	}
	
	public static boolean isPrimeFull(int a){
		boolean isPrime = true;
		for(int b = 2; b <= a; b++){
	    	if(a % b == 0){
	    		isPrime = false;
	    		break;
	    		}
	    	}
		return isPrime;
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    int a;
    boolean isPrime;
    System.out.print("Enter Value: ");
    a = input.nextInt();
    
    long startTime = System.nanoTime(); 
    isPrime = isPrimeFull(a);
    long endTime = System.nanoTime();
    System.out.println("Full Took "+(endTime - startTime) + " ns"); 
    
    startTime = System.nanoTime(); 
    isPrime = isPrimeSqr(a);
    endTime = System.nanoTime();
    System.out.println("Sqrt Took "+(endTime - startTime) + " ns");
    
    startTime = System.nanoTime(); 
    isPrime = isPrimeSqrAdv(a);
    endTime = System.nanoTime();
    System.out.println("Adv Took "+(endTime - startTime) + " ns");
    
    if(isPrime){
    	System.out.print("Entered Value is prime");
    } 
    else{
    	System.out.print("Entered Value is not prime");
    }
    input.close();
  }
}
	

	



