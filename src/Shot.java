//TODO Save ammos of shots that were fired
public class Shot {
	private int ammo;
	private int damage;
	private int velocty;
	private String shot;
	
	public int getAmmo() {
		return ammo;
	}
	public void setAmmo(int ammo) {
		this.ammo = ammo;
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
	public void setVelocity(int object) {
		this.velocty = object;
	}
	
	public void setName(String shot){
		this.shot = shot;
	}
	
	public String toString(){
		return shot;
	}

}
