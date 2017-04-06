package exceptions;

class BaseballException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8638844611898671734L;
}

class Foul extends BaseballException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4138619649319741000L;
}

class Strike extends BaseballException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1093310618034781674L;

}

abstract class Inning {
	public Inning() throws BaseballException {
	}

	public void event() throws BaseballException {
	}

	public abstract void atBat() throws Strike, Foul;

	public void walk() {
	}
}

class StormException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5665192856315752539L;
}

class RainedOut extends StormException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2360184962104217615L;
}

class PopFoul extends Foul {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8619762312910752170L;
}

interface Storm {
	public void event() throws RainedOut;

	public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {

	public StormyInning() throws RainedOut, BaseballException {
		// TODO Auto-generated constructor stub
	}

	public StormyInning(String s) throws Foul, BaseballException {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atBat() throws PopFoul {
		// TODO Auto-generated method stub

	}

	@Override
	public void rainHard() throws RainedOut {
		// TODO Auto-generated method stub

	}

	public void event() {

	}

	public static void main(String[] args) {
		System.out.println("222");
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch (RainedOut e) {
			System.out.println("rainedout");
		} catch (PopFoul e) {
			System.out.println("popfoul");
		} catch (BaseballException e) {
			System.out.println("baseballexception");
		}
		try {
			Inning i = new StormyInning();
			i.atBat();
		} catch (Strike e) {
			System.out.println("strike");
		} catch (Foul e) {
			System.out.println("Foul");
		} catch (RainedOut e) {
			System.out.println("RainedOut");
		} catch (BaseballException e) {
			System.out.println("BaseballException");
		}
	}

}
