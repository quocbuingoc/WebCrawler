package com.quocbn;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new BasicWebCrawler().getPageLinks("http://www.google.com/");
//		new AdvangeWebCralwer().getPageLinks("https://www.google.com/", 0);
		Extraction bwc = new Extraction();
		bwc.getPageLinks("http://www.mkyong.com");
		bwc.getArticles();
		bwc.writeToFile("Java 8 Articles");
	}
}
