package org.springframework.social.flickr.util;

public class PhotoDto {
    private String url;
    private String id;
    
    public PhotoDto(String url, String id){
        this.url=url;
        this.id=id;
    }
    
    public PhotoDto(){}
    
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getName() {
        return id;
    }
    public void setName(String name) {
        this.id = name;
    }
    
}
