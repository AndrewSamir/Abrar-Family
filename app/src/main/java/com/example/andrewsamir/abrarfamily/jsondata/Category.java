
package com.example.andrewsamir.abrarfamily.jsondata;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("scheme")
    @Expose
    private String scheme;
    @SerializedName("term")
    @Expose
    private String term;

    /**
     * 
     * @return
     *     The scheme
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * 
     * @param scheme
     *     The scheme
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * 
     * @return
     *     The term
     */
    public String getTerm() {
        return term;
    }

    /**
     * 
     * @param term
     *     The term
     */
    public void setTerm(String term) {
        this.term = term;
    }

}
