package com.github.javiersantos.appupdater;

class Config {
    static final String PLAY_STORE_URL = "https://play.google.com/store/apps/details?id=%s&hl=%s";
    static final String GITHUB_URL = "https://github.com/";
    static final String AMAZON_URL = "http://www.amazon.com/gp/mas/dl/android?p=";
    static final String FDROID_URL = "https://f-droid.org/repository/browse/?fdid=";

    //    static final String PLAY_STORE_TAG_RELEASE = "itemprop=\"softwareVersion\">";
    //    static final String PLAY_STORE_OLD_TAG_RELEASE = "itemprop=\"softwareVersion\">";
    static final String PLAY_STORE_NEW_TAG_RELEASE = "<div class=\"BgcNfc\">Current Version</div><span class=\"htlgb\"><div><span class=\"htlgb\">";

    static final String GITHUB_TAG_RELEASE = "/tree/";
    static final String AMAZON_TAG_RELEASE = "<strong>Version:</strong>";
    static final String FDROID_TAG_RELEASE = "<b>Version";

    static final String PLAY_STORE_TAG_CHANGES = "recent-change\">";

}
