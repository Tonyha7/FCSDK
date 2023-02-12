package com.th7.fcsdk;

import android.content.Context;
import android.app.csdk.CSDKManager;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import android.content.pm.PackageInfo;
import android.widget.Button;
import java.util.ArrayList;

public class PKGInstallerHook {
private static CSDKManager csdk;
    public static void hook(ClassLoader classLoader,Context context) throws Throwable {
        
        Class Installer = classLoader.loadClass("com.android.packageinstaller.PackageInstallerActivity");
        
        XposedHelpers.findAndHookMethod(Installer, "startInstallConfirm", new XC_MethodHook() {
            @Override
            protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                super.afterHookedMethod(param);
                csdk = new CSDKManager(context);
                ArrayList arrayList = (ArrayList) csdk.getInstallPackageWhiteList();
                arrayList.add(((PackageInfo) XposedHelpers.getObjectField(param.thisObject, "mPkgInfo")).packageName + ";miahash"); //如果你的系统没有签名校验 则去掉";miahash"
                csdk.addInstallPackageWhiteList(arrayList);
                //((Button) XposedHelpers.getObjectField(param.thisObject, "mOk")).performClick(); 自动按安装按钮
            }
        });

        

    }
}
