package com.kgmyshin.ideaplugin.eventbus3.utils;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * Created by likfe on 2018/3/6.
 */
public class Constants {

    public static final Boolean IS_DEBUG = true;

    public static final String ICON_PATH = "/icons/icon.png";
    public static final Icon ICON = IconLoader.getIcon(Constants.ICON_PATH);
    public static final int MAX_USAGES = 100;
    public static final String FUN_START = "EventBus.getDefault()";
    public static final String FUN_NAME = "post";
    public static final String FUN_NAME2 = "postSticky";
    public static final String FUN_ANNOTATION = "org.greenrobot.eventbus.Subscribe";
    public static final String FUN_ANNOTATION_KT = "Subscribe";
    public static final String FUN_EVENT_CLASS = "org.greenrobot.eventbus.EventBus";

}
