package exceptions;

class ConstructorException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6400633744299076049L;

	@Override
	public String toString() {
		return "ConstructorException";
	}
}

public class FailingConstructour {
	public FailingConstructour() throws ConstructorException {
		throw new ConstructorException();
	}

	public void dispose() {
		System.out.println("dispose");
	}

	public static void main(String[] args) {
		try {
			FailingConstructour fc1 = new FailingConstructour();
			try {
				FailingConstructour fc2 = new FailingConstructour();
				try {

				} finally {
					fc2.dispose();
				}
			} catch (ConstructorException e) {
				System.out.println(e);
			} finally {
				fc1.dispose();
			}
		} catch (ConstructorException e) {
			System.out.println(e);
		}
	}
}
