package com.baalze.bal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebPage {
	private Anchor anchor;
	private String webPageHash;
	private int anchorParseStatus;
	private int emailParseStatus;
	private Document document;
	
	public WebPage(Anchor anchor) {
		super();
		this.anchor = anchor;
	}
	
	private void loadDocumentFromWeb(){
		try{
			document = Jsoup.connect(anchor.getAnchorURL()).get();
			Elements links = document.select("a");
			for (Element e: links){
				System.out.println(e.attr("abs:href"));
			}
			} catch (IOException e){
				Logger.getLogger(WebPage.class.getName()).log(Level.SEVERE, null, e);
			}
	}
}
