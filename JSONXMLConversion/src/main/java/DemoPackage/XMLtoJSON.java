package DemoPackage;
import org.json.JSONObject;
import org.json.XML;

public class XMLtoJSON {

	public static void main(String[] args) {
		
		String xml = "<apisero><batch32>greenfield</batch32></apisero>";
		JSONObject json = XML.toJSONObject(xml);
		System.out.println(json);
	}

}