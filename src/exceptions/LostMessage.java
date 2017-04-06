package exceptions;

class VeryImportantException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4019834953757307570L;

	/**
	 * 
	 */

	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3766472759840254975L;

	public String toString() {
		return "A trivial exception";

	}
}

public class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}

	void dispose() throws HoHumException {
		throw new HoHumException();
	}

	public static void main(String[] args) {
		LostMessage lm = new LostMessage();
		try {
			lm.f();
		} catch (VeryImportantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("finally1");
			try {
				lm.dispose();
			} catch (HoHumException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				System.out.println("finally2");

			}
		}
	}
}
