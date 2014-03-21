package prestamos;

class Util {

	public static boolean equalObjects(Object a, Object b) {

		if (a == null || b == null) {

			return a == null && b == null;

		}

		return a.equals(b);

	}

}
