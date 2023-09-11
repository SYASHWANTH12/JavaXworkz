
public class Boolean {
	public static void main(String[] info) {
		Boolean B1 = new Boolean();
		boolean ref = B1.equals(B1);
		System.out.println(ref);
		String string = new String();
		String ref1 = string.intern();
		System.out.println(ref1);
		ClassNotFoundException cs = new ClassNotFoundException("string");
		System.out.println(cs);
		boolean ref8 = cs.equals(cs);
		System.out.println(ref8);
		Throwable ref9 = cs.getCause();
		System.out.println(ref9);
		int ref10 = cs.hashCode();
		System.out.println(ref10);
		cs.addSuppressed(ref9);
		Throwable[] ref3 = cs.getSuppressed();
		System.out.println(ref3);
		@SuppressWarnings("deprecation")
		Integer integer = new Integer(4);
		System.out.println(integer.compareTo(integer));
		System.out.println(integer.doubleValue());
		System.out.println(integer.intValue());
		System.out.println(integer.byteValue());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.highestOneBit(ref10));
		System.out.println(Integer.lowestOneBit(ref10));
		System.out.println(Integer.highestOneBit(ref10));
		RuntimePermission run = new RuntimePermission(ref1);
		System.out.println(run);
		System.out.println(run.equals(run));
		System.out.println(run.implies(run));
		System.out.println(run.newPermissionCollection());
	}
}
