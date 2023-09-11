package toString;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Methods {
	public static void main(String[] info) {

		String string = new String();
		System.out.println(string);
		boolean ref = string.endsWith(string);
		System.out.println(ref);
		int ref2 = string.hashCode();
		System.out.println(ref2);
		int ref3 = string.indexOf(string);
		System.out.println(ref3);
		boolean ref4 = string.isBlank();
		System.out.println(ref4);
		int ref5 = string.lastIndexOf(string, ref3);
		System.out.println(ref5);

		CollectionCertStoreParameters collection = new CollectionCertStoreParameters();
		ConcurrentHashMap map1 = new ConcurrentHashMap();
System.out.println(map1);
		boolean map3 = map1.equals(collection);
		System.out.println(map3);
		Date date = new Date();
		boolean u = date.after(date);
		System.out.println(u);
		Locale.Builder l = new Locale.Builder();
		Locale r1 = l.build();
		System.out.println(r1);

		String ref21 = new String("Virat Kohli");
		System.out.println(ref21);

		char ref1 = ref21.charAt(1);
		System.out.println(ref1);
		ref21 = "yashu";

		String[] ref56 = ref21.split(ref21);
		System.out.println(ref56);
		char ref98 = ref21.charAt(2);
		System.out.println(ref98);
		String[] is = ref21.split("yashu", 4);
		for (int index = 0; index <= is.length - 1; index++) {

			String ref78 = is[index];
			System.out.println(ref78);
		}

	}
}
