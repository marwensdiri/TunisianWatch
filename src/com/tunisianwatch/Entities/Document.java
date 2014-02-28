package com.tunisianwatch.Entities;

public class Document {

	private int id;
	private int type;
	private String url;

    public Document(int type, String url) {
        this.type = type;
        this.url = url;
    }

    public Document(int id, int type, String url) {
        this.id = id;
        this.type = type;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setUrl(String url) {
        this.url = url;
    }

        
        
}