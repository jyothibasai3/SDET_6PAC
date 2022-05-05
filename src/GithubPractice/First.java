package GithubPractice;

public class First {

	public static void main(String[] args) {
		
		   int num=153,arm=0,rem;
		   int cp=num;
		   while(num>0)
		   {
		     rem=num%10;
		     num=num/10;
		     arm=arm+rem*rem*rem;
		    }
		    if(arm == cp)
		    System.out.println(cp+"Is an Armstrong number");
		    else
		    System.out.println(cp+"is non Armstrong number");
		    }
		 }

		
