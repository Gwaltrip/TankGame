public class Tank extends Shot{
	private int distance;
	private int maxDistance;
	private int health;
	private int angle; // in Degrees
	private int position;
	
	private static int maxPostion;

	public Tank() {
		angle = 90;
		distance = 0;
	}

	public Tank(int maxPostion) {
		angle = 90;
		distance = 0;
		Tank.maxPostion = maxPostion;
	}

	public static void setMaxPosition(int maxPosition) {
		Tank.maxPostion = maxPosition;
	}
	
	public static int getMaxPosition(){
		return maxPostion;
	}
	
	//TODO - create fire method
	public boolean fire(){
		if((int) ammo.get(type) > 0){			
			ammo.put(type, ((int) ammo.get(type)) - 1);
			return true;
		}
		return false;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	public int getMaxDistance() {
		return maxDistance;
	}
/*
	public void setShot(Shot shot) {
		this.shot = shot;
	}

	public Shot getShot() {
		return shot;
	}
*/
	public void incAngle() {
		if (angle < 180)
			angle++;
	}

	public void decAngle() {
		if (angle > 0)
			angle--;
	}

	public int getAngle() {
		return this.angle;
	}

	public int getHealth() {
		return this.health;
	}

	public void lowerHealth(int damage) {
		health -= damage;
	}

	public boolean destoryed() {
		if (health > 0)
			return false;
		return true;
	}

	public void incDistance() {
		distance++;
	}

	public void addDistance(int distance) {
		this.distance += distance;
	}

	public boolean isMaxDistance() {
		if (distance >= maxDistance)
			return true;
		return false;
	}

	public void goRight() {
		if (position < maxPostion) {
			position++;
			incDistance();
		}
	}

	public void goLeft() {
		if (position > 0) {
			position--;
			incDistance();
		}
	}

	public void setPostion(int position) {
		this.position = position;
	}

	public int getPostion() {
		return position;
	}
}
