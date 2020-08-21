package customer_invitation;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Distance {
	
	public double calculateDistance(JSONArray customerList, int i, double lat1_degrees, double lon1_degrees, double R) {
		// Get latitude at customerList first line array 
        Double lat2_degrees = new Double(((JSONObject)customerList.get(i)).get("latitude").toString());
        
        // Get longitude at customerList first line array 
        Double lon2_degrees =  new Double(((JSONObject)customerList.get(i)).get("longitude").toString());
		double latDistance = Math.toRadians(lat2_degrees - lat1_degrees);
        double lonDistance = Math.toRadians(lon2_degrees - lon1_degrees);
		
		double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                   + Math.cos(Math.toRadians(lat1_degrees)) * Math.cos(Math.toRadians(lat2_degrees))
                   * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
           // Part of distance formula
           double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
           
           // Distance calculation
           double distance = R * c ;
		return distance;
	}
	
	public void filtering(double distance, JSONObject customerDistance, FileWriter file) {
		
		if(distance <= 100) {

			System.out.print(customerDistance.get("user_id")+ " ");
			System.out.print(customerDistance.get("name")+ "\n");
			customerDistance.remove("distance");
			customerDistance.remove("latitude");
			customerDistance.remove("longitude");
			
			try {
				
				file.write(customerDistance.toJSONString());
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				}
		}
	}
}
