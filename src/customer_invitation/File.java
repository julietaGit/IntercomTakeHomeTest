package customer_invitation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class File {
	
	JSONArray customerList = null;
	
	public JSONArray readFile(JSONParser jsonParser) {
		
		try (FileReader reader = new FileReader("external_file/customers.txt"))
		{
			 Object obj = jsonParser.parse(reader);
			 
			 customerList = (JSONArray) obj;
	          
	            
		}catch (IOException e) {
            e.printStackTrace();
        }catch (ParseException e) {
            e.printStackTrace();
        }
		return customerList;
	}
	
	public void writeFile(JSONObject customerDistance, double lat1_degrees, double lon1_degrees, double R) {
		
		try(FileWriter file = new FileWriter("external_file/filterSort.txt"))
		{
			
			for(int i=0; i<=(customerList.size()-1); i++){
				customerDistance = (JSONObject)customerList.get(i);
				
				//From Distance calculatedistance
				Distance dis = new Distance();
				double distance = dis.calculateDistance(customerList, i, lat1_degrees, lon1_degrees, R);
				customerDistance.put("distance", distance);
				// From Distance filtering
				dis.filtering(distance, customerDistance, file);
			}
			file.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
