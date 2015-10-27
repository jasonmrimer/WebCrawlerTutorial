package com.baalze.ut.bal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.baalze.bal.Anchor;
import com.baalze.bal.Domain;
import com.baalze.bal.WebPage;

public class BalUT {

	@Test
	public void WebPageLoadFromWeb(){
		Domain domain = new Domain("1234-1234","http://www.jsoup.org");
		Anchor anchor = new Anchor(domain, "1234-1234","http://www.jsoup.org");
		WebPage webPage = new WebPage(anchor);
		webPage.loadDocumentFromWeb();
		assertTrue("Test Results", webPage.getDocument() != null);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

}
