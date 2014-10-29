
public class Tank {
	private int distance;
	private int maxDistance;
	private int health;
	private int angle; // in Degrees
	private Shot shot;
	
	public Tank(){
		shot = new Shot();
		angle = 90;
		distance = 0;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public void setMaxDistance(int maxDistance){
		this.maxDistance = maxDistance;
	}
	
	public int getMaxDistance(){
		return maxDistance;
	}
	
	public void setShot(Shot shot){
		this.shot = shot;
	}
	
	public Shot getShot(){
		return shot;
	}
	
	public void incAngle(){
		if(angle < 180)
			angle++;
	}
	
	public void decAngle(){
		if(angle > 0)
			angle--;
	}
	 
	public int getAngle(){
		return this.angle;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public void lowerHealth(int damage){
		health -= damage;
	}
	
	public boolean destoryed(){
		if(health > 0)
			return false;
		return true;
	}
	
	public void incDistance(){
		distance++;
	}
	
	public void addDistance(int distance){
		this.distance += distance;
	}
	
	public boolean isMaxDistance(){
		if(distance>=maxDistance)
			return true;
		return false;
	}

}
