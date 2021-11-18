package DemoPackage;
import org.json.JSONObject;
import org.json.XML;

public class JSONtoXML {
	public static void main(String [] args)
	{
		String json="{employee:[{employeeName:Eshan,employeeID:API2477,empPhNo:9453467991,domain:Mulesoft},{employeeName:Dev,employeeID:API2488,empPhNo:9900112233,domain:Mulesoft}]}";
		JSONObject jsonObject=new JSONObject(json);
		System.out.println(XML.toString(jsonObject));
	}
	
}
