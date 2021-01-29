package com.api.dissertation;

public class Model {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String title;
    private String description;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Model(String title, String description, int mImageResourceId) {
        this.title = title;
        this.description = description;
        this.mImageResourceId = mImageResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public Model(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
