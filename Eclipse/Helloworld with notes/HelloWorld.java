/* this is a comment about the class, (public class, its name is
 * HelloWorld)
 *  This does not affect how the code works, it is for notes, 
 *  keeping track of changes, etc, it is a comment
 */

	// <- This symbol is used for looooooooooooooong comments on a single line like this
	/* <- This is used 
	 * to break
	 * comments across multiple 
	 * lines
	 * like
	 * this and ends in the symbol below this line
	 */
public class HelloWorld 
{
/* this is a comment about the method(the method is public static 
 * void main)(below), each class has a method or several methods 
 * depending on your program*/
	
 /* for HelloWorld, we are using one main method, but there are
 * others that can be used*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* This is the output command/statement. We are telling
	 *the SYSTEM to OUTPUT and PRINT THE LINE Hello World 
	 */
	/*The parentheses () tell the machine where the statement is,
	 * the "" tells it what to say, and the semicolon ; marks the
	 * end of the statement 
	 */
	String str = "Hello";
	int n = str.length();
	String mystery = str.substring(0, 1) 
	   + str.substring(n - 2, n + 1);
	System.out.println(mystery);
	}

}
/* This curly bracket tells us that this is the end of the method
 */
