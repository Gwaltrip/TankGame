
public class Main {

	private static Tank t;
	private static YamlParser y;
	
	public static void main(String[] args) {
		y = new YamlParser();
		t = new Tank();
		
		//Loads tank info and basic shot into ram.
		y.getTank(t);
		
		for(int i = 0; i < 6; i++){
			y.getShot(t.getShot(), y.getList()[i % y.getList().length]);
			
			System.out.println("_________");		
			System.out.println("HP " + t.getHealth());
			System.out.println("maxDistance " + t.getMaxDistance());
			System.out.println("Velocity " + t.getShot().getVelocty());
			System.out.println("Damage " + t.getShot().getDamage());
			System.out.println("Ammo " + t.getShot().getAmmo());
			System.out.println("Shot's name " + t.getShot().toString());
		}
		
	}

}
