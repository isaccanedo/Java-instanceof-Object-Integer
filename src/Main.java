import java.util.ArrayList;
import java.util.List;

/*
 *  What is the output of this code? (Qual � a sa�da deste c�digo?)
 * 
 *  1 - truefalse
 *  2 - The code does not compile
 *  3 - truetrue ==> correct
 *  4 - falsetrue
 */

public class Main {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("hello");
		list.add(2);
		System.out.println(list.get(0) instanceof Object);
		System.out.println(list.get(1) instanceof Integer);

	}

}
