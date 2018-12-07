package com.easj.gord.tvapp;

import java.io.Serializable;

public class Video implements Serializable {

    private String title;
    private String description;
    private String videoUrl;
    private String catagory;
    private String poster;

    @Override
    public String toString(){

        return "Video {" +
    "title=\'" + title + "\'" +
    ", description=\'" + description + "\'" +
    ", videoUrl\'" + videoUrl + "\'" +
    ", catagory\'" + catagory + "\'" +
    ", poster\'" + poster + "\'" +
    "}";
    }


    public String getTitle(){
        return title;
    }

    public void setTitle(String title){

        this.title = title;
    }


}

