package customer_invitation;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Customer {

	public static void main(String[] args) {

		JSONParser jsonParser = new JSONParser();
		
		JSONObject customerDistance = null;
		
		final double lat1_degrees = 53.339428;
		final double lon1_degrees = -6.257664;
		
		// From File Class
		File files = new File();
		files.readFile(jsonParser);
		
		// From File writefile
		files.writeFile(customerDistance, lat1_degrees, lon1_degrees, lon1_degrees);

	}

}
