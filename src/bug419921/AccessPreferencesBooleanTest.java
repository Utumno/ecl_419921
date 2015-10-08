package bug419921;

public final class AccessPreferencesBooleanTest extends AccessPreferencesTest {
	private static final String BOOLEAN_KEY = "bKey";
	private static final boolean DEFAULT_BOOLEAN = false;

	public void testPutNullBooleanGetPrimitiveBoolean() {
		AccessPreferences.put(ctx, BOOLEAN_KEY, null);
		try {
			boolean b = AccessPreferences.get(ctx, BOOLEAN_KEY, null);
			fail("Expected NPE: " + b);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}

	public void testPutBoolean() {
		AccessPreferences.put(ctx, BOOLEAN_KEY, DEFAULT_BOOLEAN);
		boolean b = AccessPreferences.get(ctx, BOOLEAN_KEY, null);
		assertEquals(DEFAULT_BOOLEAN, b);
	}
}