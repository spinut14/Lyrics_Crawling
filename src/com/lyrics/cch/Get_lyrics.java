package com.lyrics.cch;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Get_lyrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		    // 1. URL 선언
		    String connUrl = "https://www.lyrics.co.kr/charts/tops?site=melon";
		
		    // 2. HTML 가져오기
		    Document doc = Jsoup.connect(connUrl).get();
		
		    // 3. 가져온 HTML Document 를 확인하기
//		    System.out.println(doc.toString());
		    
		    
		    // 태그 데이터 추출시 Class는 '.' 사용 ID는 '#' 사용 
		    Elements links = doc.select(".timeline-header");
		    Elements hr = links.select("[href]");
		    for( Element elem : hr ){
		    	System.out.println(elem.attr("href"));
		    }
		
		} catch (IOException e) {
		    // Exp : Connection Fail
		    e.printStackTrace();
		}


	}

}
