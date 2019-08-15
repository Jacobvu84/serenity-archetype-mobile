package com.serenity.screenplay.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.ByTarget;
import net.serenitybdd.screenplay.targets.Target;

/**
 * @author jacob
 */
public class DashboardScreen {

    public static final Target ADD_BUTTON = ByTarget
            .the("Start button")
            .locatedForAndroid(By.id("jp.naver.line.android:id/next"))
            .locatedForIOS((By.id("start")));
         
}
