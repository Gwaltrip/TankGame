import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

@SuppressWarnings("unchecked")
public class YamlParser {
	String fileName = "Config.yml";
	String list[];
	Map<String, Object> map;
	
	public YamlParser() {		
		try {
			map = (Map<String, Object>) new Yaml().load(new FileInputStream(new File(fileName)));
			list = ((ArrayList<String>)map.get("list")).toArray(new String[((ArrayList<String>)map.get("list")).size()]);
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
	} 
	
	public String[] getList(){
		return list;
	}
	
	public void getShot(Shot shot){
		String DEFAULT = "basic";
		Map<String, Object> detail = (Map<String, Object>) map.get("details");
		Map<String, Object> vals = (Map<String, Object>) detail.get((Object)DEFAULT);
		
		shot.setVelocity((int)vals.get((Object)"velocity"));
		shot.setDamage((int)vals.get((Object)"damage"));
		shot.setAmmo((int)vals.get((Object)"ammo"));
		shot.setName((String)vals.get((Object)"name"));
	}
	
	public void getShot(Shot shot, String listVar){
		Map<String, Object> detail = (Map<String, Object>) map.get("details");		
		Map<String, Object> vals = (Map<String, Object>) detail.get((Object)listVar);
		
		shot.setVelocity((int)vals.get((Object)"velocity"));
		shot.setDamage((int)vals.get((Object)"damage"));
		shot.setName((String)vals.get((Object)"name"));
	}
	
	public void getTank(Tank tank){
		Map<String, Object> info = (Map<String, Object>) map.get("tank");
		tank.setHealth((int)info.get((Object)"health"));
		tank.setMaxDistance((int)info.get((Object)"maxDistance"));
		
		getShot(tank.getShot());
	}
}
