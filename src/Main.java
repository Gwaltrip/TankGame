public class Main {

	private static Tank t;
	private static YamlParser y;

	public static void main(String[] args) {
		y = new YamlParser();
		t = new Tank();

		// Loads tank info and basic shot into ram.
		y.getTank(t);
		t.getShot().setAmmo();

		for (int i = 0; i < 6; i++) {
			y.getShot(t.getShot(), y.getList()[i % y.getList().length]);

			System.out.println("_________");
			System.out.println("HP " + t.getHealth());
			System.out.println("maxDistance " + t.getMaxDistance());
			System.out.println("Velocity " + t.getShot().getVelocty());
			System.out.println("Damage " + t.getShot().getDamage());
			System.out.println("Amount of ammo " + t.getShot().getAmmo(y.getList()[i % y.getList().length]));
			System.out.println("Shot's name \"" + t.getShot().toString() + "\"");
			System.out.println("Max postion " + Tank.getMaxPosition());
			System.out.println("Max Ammo for this shot "
					+ Shot.getMaxAmmo(y.getList()[i % y.getList().length]));
		}

	}

}
