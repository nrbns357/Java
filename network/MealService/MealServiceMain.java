package kr.hs.dgsw.network.class22.MealService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MealServiceMain {
	public static void main(String[] args) {
		String newUrls = "https://open.neis.go.kr/hub/mealServiceDietInfo" + "?Type=json" + "&ATPT_OFCDC_SC_CODE=D10"
				+ "&SD_SCHUL_CODE=7240454" + "&MLSV_YMD=20220504";
		try {
			URL url = new URL(newUrls);

			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "utf-8"));

				StringBuffer sb = new StringBuffer();
				String msg = "";
				while ((msg = br.readLine()) != null) {
					sb.append(msg);
				}

				JSONParser jsonParser = new JSONParser();
				try {
					JSONObject jsonObject = (JSONObject) jsonParser.parse(sb.toString());
					JSONArray jsonArray = (JSONArray) jsonObject.get("mealServiceDeietInfo");
					JSONObject row = (JSONObject) jsonArray.get(1);
					JSONArray row_array = (JSONArray) row.get("row");
					for (int i = 0; i < row_array.size(); i++) {
						JSONObject out = (JSONObject) row_array.get(i);
						System.out.println(out.get("MMEAL_SC_NM"));
						System.out.println(out.get("DDISH_NM"));
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
