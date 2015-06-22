package org.springframework.social.flickr.api;

import java.util.ArrayList;

public class Predicates {
	String page;
	String pages;
	String perpage;
	String total;
	ArrayList<Predicate> predicate;
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getPerpage() {
		return perpage;
	}
	public void setPerpage(String perpage) {
		this.perpage = perpage;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public ArrayList<Predicate> getPredicate() {
		return predicate;
	}
	public void setPredicate(ArrayList<Predicate> predicate) {
		this.predicate = predicate;
	}
}
