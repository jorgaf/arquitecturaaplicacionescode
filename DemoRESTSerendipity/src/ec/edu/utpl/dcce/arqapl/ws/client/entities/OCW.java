/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.utpl.dcce.arqapl.ws.client.entities;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author jorgaf
 */
public class OCW {
    private String title;
    private String url;
    private String language;
    private String universityName;
    private String universityUrl;
    private String description;
    private String uri;
    private String similar;

    public OCW() {
    }            

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param name the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the universityName
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * @param universityName the universityName to set
     */
    @JsonProperty(value = "university_name")
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    /**
     * @return the universityUrl
     */
    public String getUniversityUrl() {
        return universityUrl;
    }

    /**
     * @param universityUrl the universityUrl to set
     */
    @JsonProperty(value = "university_url")
    public void setUniversityUrl(String universityUrl) {
        this.universityUrl = universityUrl;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * @param uri the uri to set
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * @return the similar
     */
    public String getSimilar() {
        return similar;
    }

    /**
     * @param similar the similar to set
     */
    public void setSimilar(String similar) {
        this.similar = similar;
    }
    
}
