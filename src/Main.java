import java.io.IOException;


public class Main {

	private static Tank t;
	private static YamlParser y;
	
	public static void main(String[] args) throws IOException {
		y = new YamlParser();
		t = new Tank();
		
		//Loads tank info and basic shot into ram.
		y.setTank(t);
		
		System.out.println("_________");
		System.out.println("HP " + t.getHealth());
		System.out.println("maxDistance " + t.getMaxDistance());
		System.out.println("Velocity " + t.getShot().getVelocty());
		System.out.println("Damage " + t.getShot().getDamage());
		System.out.println("Ammo " + t.getShot().getAmmo());
		System.out.println("Shot's name " + t.getShot().toString());
		
		//switches to heavy shot
		y.setShot(t.getShot(), "heavy");
		
		System.out.println("_________");		
		System.out.println("HP " + t.getHealth());
		System.out.println("maxDistance " + t.getMaxDistance());
		System.out.println("Velocity " + t.getShot().getVelocty());
		System.out.println("Damage " + t.getShot().getDamage());
		System.out.println("Ammo " + t.getShot().getAmmo());
		System.out.println("Shot's name " + t.getShot().toString());
		
		
		//switches back to basic shot
		y.setShot(t.getShot(), "basic");
		
		System.out.println("_________");		
		System.out.println("HP " + t.getHealth());
		System.out.println("maxDistance " + t.getMaxDistance());
		System.out.println("Velocity " + t.getShot().getVelocty());
		System.out.println("Damage " + t.getShot().getDamage());
		System.out.println("Ammo " + t.getShot().getAmmo());
		System.out.println("Shot's name " + t.getShot().toString());
		
	}

}
