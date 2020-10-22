package com.tungtt.basemvpimpl.utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by ttcandroid a.k.a TungTT
 * On Mon, 19 Oct 2020 - 17:09
 */
public class Constants {
    @Retention(RetentionPolicy.SOURCE)
    public @interface SCREEN_TAG {
        String MAIN = "main";
    }
}
