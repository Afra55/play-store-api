package com.github.yeriomin.playstoreapi;

import java.util.Iterator;

abstract public class AppPageIterator implements Iterator {

    protected GooglePlayAPI googlePlayApi;
    protected boolean firstQuery = true;
    protected String nextPageUrl;

    public AppPageIterator(GooglePlayAPI googlePlayApi) {
        this.googlePlayApi = googlePlayApi;
    }

    @Override
    public boolean hasNext() {
        return this.firstQuery || (null != this.nextPageUrl && !this.nextPageUrl.isEmpty());
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
