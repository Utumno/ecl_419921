package bug419921;

public class AccessPreferencesTest extends AndroidTestCase {

	Editor e;
	protected static final String ctx = "ctx";
	private static final String SOME_KEY = "some";

	// ...
	public void testPutSomething() {
		AccessPreferences.put(ctx, SOME_KEY, null);
		try {
			boolean b = AccessPreferences.get(ctx, SOME_KEY, null);
			fail("Expected NPE: " + b);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}
