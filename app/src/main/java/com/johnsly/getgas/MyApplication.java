package com.johnsly.getgas;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by root on 7/29/15.
 */
public class MyApplication extends Application {

    public void onCreate(){
        super.onCreate();
            }
}
