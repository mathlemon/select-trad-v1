package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import util.Chinese2UTF8;

public class Tradition extends Controller {

	public static Result queryList(String queryString) {
		String orig = "jQuery191024054104113020003_1414245052556([{\"info\":{\"index\":201,\"j\":\"\u6266\"},\"list\":[{\"index\":201,\"f\":\"\u6261\"},{\"index\":202,\"f\":\"\u57f7\"},{\"index\":203,\"f\":\"\u64f4\"},{\"index\":204,\"f\":\"\u636b\"},{\"index\":205,\"f\":\"\u6383\"},{\"index\":206,\"f\":\"\u63da\"}]},{\"info\":{\"index\":337,\"j\":\"\u5c9a\"},\"list\":[{\"index\":337,\"f\":\"\u5d50\"},{\"index\":338,\"f\":\"\u5cf6\"},{\"index\":339,\"f\":\"\u5e43\"},{\"index\":340,\"f\":\"\u5e33\"},{\"index\":341,\"f\":\"\u5eec\"},{\"index\":342,\"f\":\"\u5ee1\"}]},{\"info\":{\"index\":579,\"j\":\"\u67a7\"},\"list\":[{\"index\":579,\"f\":\"\u6898\"},{\"index\":580,\"f\":\"\u68d6\"},{\"index\":581,\"f\":\"\u69cd\"},{\"index\":582,\"f\":\"\u6953\"},{\"index\":583,\"f\":\"\u689f\"},{\"index\":584,\"f\":\"\u6ac3\"}]},{\"info\":{\"index\":893,\"j\":\"\u79cd\"},\"list\":[{\"index\":893,\"f\":\"\u7a2e\"},{\"index\":894,\"f\":\"\u7aca\"},{\"index\":895,\"f\":\"\u8c4e\"},{\"index\":896,\"f\":\"\u7be4\"},{\"index\":897,\"f\":\"\u985e\"},{\"index\":898,\"f\":\"\u79c8\"}]},{\"info\":{\"index\":937,\"j\":\"\u8368\"},\"list\":[{\"index\":937,\"f\":\"\u8541\"},{\"index\":938,\"f\":\"\u85ce\"},{\"index\":939,\"f\":\"\u84c0\"},{\"index\":940,\"f\":\"\u852d\"},{\"index\":941,\"f\":\"\u8552\"},{\"index\":942,\"f\":\"\u8452\"}]},{\"info\":{\"index\":1273,\"j\":\"\u94c3\"},\"list\":[{\"index\":1273,\"f\":\"\u9234\"},{\"index\":1274,\"f\":\"\u9460\"},{\"index\":1275,\"f\":\"\u925b\"},{\"index\":1276,\"f\":\"\u925a\"},{\"index\":1277,\"f\":\"\u9230\"},{\"index\":1278,\"f\":\"\u9249\"}]},{\"info\":{\"index\":1495,\"j\":\"\u94d0\"},\"list\":[{\"index\":1495,\"f\":\"\u92ac\"},{\"index\":1496,\"f\":\"\u92a0\"},{\"index\":1497,\"f\":\"\u927a\"},{\"index\":1498,\"f\":\"\u92aa\"},{\"index\":1499,\"f\":\"\u92cf\"},{\"index\":1500,\"f\":\"\u92e3\"}]},{\"info\":{\"index\":1729,\"j\":\"\u9509\"},\"list\":[{\"index\":1729,\"f\":\"\u92bc\"},{\"index\":1730,\"f\":\"\u92dd\"},{\"index\":1731,\"f\":\"\u92d2\"},{\"index\":1732,\"f\":\"\u92c5\"},{\"index\":1733,\"f\":\"\u92f6\"},{\"index\":1734,\"f\":\"\u9426\"}]},{\"info\":{\"index\":2035,\"j\":\"\u9aa1\"},\"list\":[{\"index\":2035,\"f\":\"\u9a3e\"},{\"index\":2036,\"f\":\"\u9a44\"},{\"index\":2037,\"f\":\"\u9bad\"},{\"index\":2038,\"f\":\"\u9b9a\"},{\"index\":2039,\"f\":\"\u9baa\"},{\"index\":2040,\"f\":\"\u9b9e\"}]},{\"info\":{\"index\":2220,\"j\":\"\u85c1\"},\"list\":[{\"index\":2220,\"f\":\"\u69c1\"},{\"index\":2221,\"f\":\"\u861a\"},{\"index\":2222,\"f\":\"\u7e48\"},{\"index\":2223,\"f\":\"\u8d0d\"},{\"index\":2224,\"f\":\"\u8d0f\"},{\"index\":2225,\"f\":\"\u8ea1\"}]}])";
//		String dest = Chinese2UTF8.tranToUTF8(orig);
		return ok(views.html.myjson.render(orig));
	}
	
}
