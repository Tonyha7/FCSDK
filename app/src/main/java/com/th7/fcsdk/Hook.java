package com.th7.fcsdk;

import android.app.Application;
import android.content.Context;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class Hook implements IXposedHookLoadPackage {
    public Context context;
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable {
        if (loadPackageParam.packageName.equals("com.android.packageinstaller")) {
            Class AppInstrumentation = XposedHelpers.findClass("android.app.Instrumentation", null);
            XposedHelpers.findAndHookMethod(AppInstrumentation, "callApplicationOnCreate", Application.class, new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    super.afterHookedMethod(param);
                    if(param.args[0] instanceof Application){
                        context = ((Application) param.args[0]).getApplicationContext();
                    } else {
                        return;
                    }
                    
                }
            });
            PKGInstallerHook.hook(loadPackageParam.classLoader,context);
        }
        
        else if (loadPackageParam.packageName.equals("android") && loadPackageParam.processName.equals("android")) {
            AndroidHook.hook(loadPackageParam.classLoader);
        }
    }
}