import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;
import static java.lang.System.out;
import static java.lang.System.err;

public class Formatting {
	public int prop1 = 1;
	public int[] aProp2 = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		try {

			Class<?> c = Class.forName("Formatting");
			Method method = c.getDeclaredMethod("method1");
			Object o = c.newInstance();
			method.invoke(o);

		} catch (Throwable e) {
			System.err.println(e);
		}
	}

	public void method2() {
		prop1 = -1;
		System.out.print(prop1);
		/*
		 * switch(prop1) { case 0 : // it's zero break; default : break; }
		 */
	}

	public void method1() {
		System.out.print(prop1);
		/*
		 * Class<?> c2 = Class.forName("Formatting"); Method method2 =
		 * c2.getDeclaredMethod ("method2"); Object o2 = c2.newInstance();
		 * method2.invoke (o2);
		 */

		if (prop1 >= 0) {
			System.out.print("greater than or equal to zero");
		} else {
			System.out.print("less than zero");
		}
	}
}