package com.etherealmobile.android_retrofit.Model;

public class Hero{
    private String createdby;

    private String firstappearance;

    private String imageurl;

    private String name;

    private String publisher;

    private String bio;

    private String team;

    private String realname;

    public Hero(String createdby, String firstappearance, String imageurl, String name, String publisher, String bio, String team, String realname) {
        this.createdby = createdby;
        this.firstappearance = firstappearance;
        this.imageurl = imageurl;
        this.name = name;
        this.publisher = publisher;
        this.bio = bio;
        this.team = team;
        this.realname = realname;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getFirstappearance() {
        return firstappearance;
    }

    public void setFirstappearance(String firstappearance) {
        this.firstappearance = firstappearance;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Override
    public String toString() {
        return "ClassPojo [createdby = " + createdby + ", firstappearance = " + firstappearance + ", imageurl = " + imageurl + ", name = " + name + ", publisher = " + publisher + ", bio = " + bio + ", team = " + team + ", realname = " + realname + "]";
    }
}