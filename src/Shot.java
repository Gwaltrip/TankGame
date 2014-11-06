import java.util.HashMap;
import java.util.Map;

public class Shot {
	private int damage;
	private int velocty;
	private int maxInitialVelocity;
	private String shot;
	protected String type;
	protected Map<String, Object> ammo;
	
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
		this.ammo = new HashMap<String, Object> (Shot.maxAmmo);
	}

	public void setAmmo(int ammo) {
		this.ammo.put(shot, ammo);
	}

	public void setAmmo(Map<String, Object> ammo) {
		this.ammo = new HashMap<String, Object> (ammo);
	}

	public void decAmmo() {
		if((int) ammo.get(type) > 0)
			ammo.put(type, ((int) ammo.get(type)) - 1);
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
	
	public void incVelocity(){
		if(velocty < maxInitialVelocity)
			velocty++;
	}
	
	public void decVelocity(){
		if(velocty > 0)
			velocty--;
	}
	//TODO - inagrate into yaml parser
	public void setMaxVelocity(int max){
		this.maxInitialVelocity = max;
	}
	
	public int getMaxVelocity(){
		return maxInitialVelocity;
	}

	public void setName(String shot) {
		this.shot = shot;
	}

	public String shotName() {
		return shot;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}

}
