import java.util.Map;

//TODO Save ammos of shots that were fired
public class Shot {
	private int damage;
	private int velocty;
	private String shot;
	private String shotType;
	private Map<String, Object> ammo;
	
	private static Map<String, Object> maxAmmo;
	
	public Shot(){
	}

	public static int getMaxAmmo(String shot) {
		return (int) maxAmmo.get(shot);
	}

	public static Map<String, Object> getMaxAmmo() {
		return maxAmmo;
	}

	public static void setMaxAmmo(Map<String, Object> maxAmmo) {
		Shot.maxAmmo = maxAmmo;
	}

	public int getAmmo() {
		return (int) ammo.get(shot);
	}

	public int getAmmo(String shot) {
		return (int) ammo.get(shot);
	}
	
	public void setAmmo(){
		this.ammo = Shot.maxAmmo;
	}

	public void setAmmo(int ammo) {
		this.ammo.put(shot, ammo);
	}

	public void setAmmo(Map<String, Object> ammo) {
		this.ammo = ammo;
	}

	public void decAmmo() {
		ammo.put(shot, (int) ammo.get(shot) - 1);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public double getVelocty() {
		return velocty;
	}

	public void setVelocity(int velocty) {
		this.velocty = velocty;
	}

	public void setName(String shot) {
		this.shot = shot;
	}

	public String toString() {
		return shot;
	}
	
	public void setShotType(String shotType){
		this.shotType = shotType;
	}
	
	public String getShotType(){
		return shotType;
	}

}
