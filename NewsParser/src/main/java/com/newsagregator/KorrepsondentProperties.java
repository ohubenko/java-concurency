package com.newsagregator;

import java.io.IOException;
import java.util.Properties;

public class KorrepsondentProperties implements NewsSiteProperties {
    private final String BASE_URL;
    private final String POST_ITEM_TITLE;
    private final String NEWS_CLASS;
    private final String ITEM_BIG_PHOTO_IMG;
    private final String POST_ITEM_TEXT;
    private final String WITH_TIME_CLASS;
    private final String POST_ITEM_TAGS_ITEM;

    public KorrepsondentProperties(String fileName) throws IOException {
        Properties cfg = loadProperties(fileName);
        BASE_URL = cfg.getProperty("base.url");
        POST_ITEM_TITLE = cfg.getProperty("post.item.title");
        NEWS_CLASS = cfg.getProperty("news.class");
        ITEM_BIG_PHOTO_IMG = cfg.getProperty("item.big.photo.img");
        POST_ITEM_TEXT = cfg.getProperty("post.item.text");
        WITH_TIME_CLASS = cfg.getProperty("post.time.class");
        POST_ITEM_TAGS_ITEM = cfg.getProperty("post.item.tags");
    }

    @Override
    public String getBaseURL() {
        return BASE_URL;
    }

    @Override
    public String getPostItemTitle() {
        return POST_ITEM_TITLE;
    }

    @Override
    public String getNewsClass() {
        return NEWS_CLASS;
    }

    @Override
    public String getItemBigPhotoIMG() {
        return ITEM_BIG_PHOTO_IMG;
    }

    @Override
    public String getPostItemText() {
        return POST_ITEM_TEXT;
    }

    @Override
    public String getTimeClass() {
        return WITH_TIME_CLASS;
    }

    @Override
    public String getTagsItemClass() {
        return POST_ITEM_TAGS_ITEM;
    }
}
