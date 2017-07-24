package com.techprober.instaslam.model;

import android.net.Uri;

public class InstaImage {

    public Uri getImageResourceUrl() {
        return imageResourceUrl;
    }

    private Uri imageResourceUrl;

    public InstaImage(Uri imageResourceUrl) {
        this.imageResourceUrl = imageResourceUrl;
    }
}
