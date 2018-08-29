import java.util.Scanner;

public class HW3MethodVersion {

	static char single_letter = ' ';
	static int real_num_part = 0;
	static String str_num;
	
	public static void main(String[] args) {
		extractThings();
		
        if (single_letter == 'A')
        	processCaseA();
        else if (single_letter == 'B')
        	processCaseB();
        else if (single_letter == 'V')
        	processCaseC();

		else
		    System.out.println("Goodbye");
	}
	
	public static void extractThings() {
		System.out.println("Please input a number with a letter follow the instruction: [variable-length number] [a space] [A|B|V]."); 
		
		Scanner input = new Scanner(System.in);
		str_num = input.nextLine();
		
		String space = " ";
		int pos_space = str_num.indexOf(space);
		int len_str_num = str_num.length();
		String num_part = str_num.substring(0, pos_space);
		String letter_part = str_num.substring(pos_space+1, len_str_num);
		real_num_part = Integer.parseInt(num_part);
		single_letter = letter_part.charAt(0);
		System.out.println(real_num_part + " is your number section.");
		System.out.println(letter_part + " is your letter section.");

	}
	
	public static String processCaseA() {
		if ((real_num_part &gt;= 32) &amp;&amp; (real_num_part &lt;= 126))
		{    
			char myascii = (char) real_num_part;
			System.out.println("You input the number is printable.");
			System.out.println("The corresponding ASCII is " + myascii);
		}
		else if ((real_num_part &lt;= 31) &amp;&amp; (real_num_part &gt;= 0))
			outputString = "Your input the number is not printable, but its nearest printable character is 'space'.";
		else if (real_num_part == 127)
			outputString = "Your input the number is not printable, but its nearest printable character is '~'.";
		else 
			System.out.println("Pass.");

	}
	public static void processCaseB() {
		String str_first_num = str_num.substring(0,1);
	    String str_second_num = str_num.substring(1,2);
	    String str_third_num = str_num.substring(2,3);
	    String str_last_num = str_num.substring(3,4);
	    int first_num = Integer.parseInt(str_first_num);
	    int second_num = Integer.parseInt(str_second_num);
	    int third_num = Integer.parseInt(str_third_num);
	    int last_num = Integer.parseInt(str_last_num);
	    
	 if ((real_num_part &gt;= 1000) &amp;&amp; (real_num_part &lt;= 1111 )) 
	 {	 
	   if ((first_num &lt; 2) &amp;&amp; (second_num &lt; 2) &amp;&amp; (third_num &lt; 2) &amp;&amp; (last_num &lt; 2))
		 {
	      int mydecimal = first_num*(2*2*2) + second_num*(2*2) + third_num*2 +last_num;
	      System.out.println("It's a 4-digit binary number, and the corresponding of decimal is: " + mydecimal);   
		 }
	   else
		   System.out.println("It's not a binary number. Pass.");
	 }
	 else
		 System.out.println("It's not a 4-digit number. Pass.");
	 return outputString;
	}    
	public static void processCaseC(){
		String str_first_num = str_num.substring(0,1);
	    String str_second_num = str_num.substring(1,2);
	    
	    int first_num = Integer.parseInt(str_first_num);
	    int second_num = Integer.parseInt(str_second_num);
	    
	    char ascii_first_letter = str_first_num.charAt(0);
		char ascii_second_letter = str_second_num.charAt(0);
		
		int ascii_first_num = (int) ascii_first_letter;
	    int ascii_second_num = (int) ascii_second_letter;
	    
	    if  ((real_num_part &gt;= 10) &amp;&amp; (real_num_part &lt; 100))
	    {   
	        	int dec_num = first_num*20 + second_num;
	            char base_16[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		        String str="";
		        int rem = dec_num % 16; 
	            str = base_16[rem] + str; 
	            dec_num = dec_num / 16;
	            System.out.println("It's a vigesimal number, and the corresponding of hexadecimal is: " + dec_num + str);
	    }
	    else if ((ascii_second_num &gt;= 65) &amp;&amp; (ascii_second_num &gt;= 74))
	    {	    		    	    
	    	    int dec_num = (ascii_first_num-55)*20 + (ascii_second_num-55);
	    	    char base_16[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		        String str="";
		        int rem = dec_num % 16; 
	            str = base_16[rem] + str; 
	            dec_num = dec_num / 16;
	            System.out.println("It's a vigesimal number, and the corresponding of Hexadecimal is: " + dec_num + str);
	    }
	    else
	    		System.out.println("It's not a vigesimal number. Pass.");

	}
   
    

}

