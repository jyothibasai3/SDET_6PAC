package GithubPractice;

public class Second {
	
	   public static void main(String args[])
	   {
	     int num=1221,rev=0,rem;
	     int cp=num;
	     while(num>0)
	     {
	       rem=num%10;
	       num=num/10;
	       rev=rev*10+rem;
	      } 
	      System.out.println(cp);
	      System.out.println(rev);
	     if(cp == rev)
	      System.out.println("palindrom number");
	     else
	       System.out.println("non palindrom number");
	          }

public void jyo()
{
		System.out.println("hello basai");


}

}


