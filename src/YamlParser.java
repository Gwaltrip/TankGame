import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

@SuppressWarnings("unchecked")
public class YamlParser {
	Yaml yaml;
	String fileName = "Config.yml";
	ArrayList<String> key;
	ArrayList<String> value;
	String list[];
	Map<String, Object> map;
	
	public YamlParser() throws IOException{
		yaml = new Yaml();
		key = new ArrayList<String>();
		value = new ArrayList<String>();
		
		try {
			map = (Map<String, Object>) yaml.load(new FileInputStream(new File(fileName)));
	        for (Object name : map.keySet()) {   
	            key.add(name.toString());
	            value.add(map.get(name).toString());    
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
		
		
		//TODO - Remove this as this is for testing
		setShot(new Shot(), "basic");
	}
	
	public String[] getList(){
		return list;
	}
	
	public void setShot(Shot s){
		String DEFAULT = "basic";
		Map<String, Object> detail = (Map<String, Object>) map.get("details");
		
		String inner = detail.get((Object)DEFAULT).toString();
		
		inner = inner.substring(1, inner.length() - 1);
		
		Map<String, Object> t = (Map<String, Object>) detail.get((Object)DEFAULT);
		
		s.setVelocity((int)t.get((Object)"velocity"));
		s.setDamage((int)t.get((Object)"damage"));
		s.setAmmo((int)t.get((Object)"ammo"));
		s.setName((String)t.get((Object)"name"));
	}
	
	public void setShot(Shot s, String listVar){
		Map<String, Object> detail = (Map<String, Object>) map.get("details");
		
		String inner = detail.get((Object)listVar).toString();
		
		inner = inner.substring(1, inner.length() - 1);
		
		Map<String, Object> t = (Map<String, Object>) detail.get((Object)listVar);
		
		s.setVelocity((int)t.get((Object)"velocity"));
		s.setDamage((int)t.get((Object)"damage"));
		s.setName((String)t.get((Object)"name"));
	}
	
	public void setTank(Tank tank){
		Map<String, Object> info = (Map<String, Object>) map.get("tank");
		tank.setHealth((int)info.get((Object)"health"));
		tank.setMaxDistance((int)info.get((Object)"maxDistance"));
		
		setShot(tank.getShot());
	}
}
