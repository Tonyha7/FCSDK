package com.th7.fcsdk;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;

public class AndroidHook {
    public static void hook(ClassLoader classLoader) throws Throwable {
        
        //Class CSDKM = classLoader.loadClass("com.android.server.csdk.CSDKManagerService");
        
        Class CSDKM = XposedHelpers.findClass("com.android.server.csdk.CSDKManagerService", classLoader);

        if(CSDKM == null){
            XposedBridge.log("Is this a CSDK device?");
            return;
        }

        XposedHelpers.findAndHookMethod(CSDKM, "disableFactoryReset",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowFactoryReset_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        
        XposedHelpers.findAndHookMethod(CSDKM, "allowBluetoothDataTransfer",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "enableDevMode",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disableMultiUser",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowMultiUser_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "requestKeyControl",int.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=0;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "requestKeyControl_V3",int.class,boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[1]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disableCamera",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "hideUsbMenu",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "enableUsbDebugging",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "setCurrentUsbMode",int.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=1;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disableWifiDirect",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        
        XposedHelpers.findAndHookMethod(CSDKM, "disableBluetooth",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disableWifi",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        
        XposedHelpers.findAndHookMethod(CSDKM, "disableBluetoothShare",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "hideBackSoftKey",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "hideHomeSoftKey",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "hideMenuSoftKey",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disableStatusBarPanel",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "hideNavigationBar",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "fullScreenForever",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disableStatusBarNotification",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disableLockScreenNotification",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disableLocation",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "AddAppBlackRule",String.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]="wtf";
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "isEnable", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "SetEnable",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "mobileData",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "setVolumedownKey",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "setVolumeupKey",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "setPowerSingleClickKey",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "setPowerLongPressKey",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "isBluetoothDataTransferAllowed", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(true);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "isUsbOnlyCharging", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "setUsbOnlyCharging",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "allowLocation",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "allowTFcard",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "setGps",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        
        XposedHelpers.findAndHookMethod(CSDKM, "allowBluetooth",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "isBluetoothAllowed", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(true);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "isVolumeKeyAllowed", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(true);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "isTFcardAllowed", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(true);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "isPowerKeyAllowed", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(true);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "isRecentKeyAllowed", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(true);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "isHomeKeyAllowed", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(true);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "isBackKeyAllowed", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(true);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "isNavigaBarAllowed", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(true);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "isNetworkRulesEnabled", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(false);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "setOTG",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "getAutostartPackageBlackList", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(null);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "urlBlackListRead", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(null);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "getAppBlackRules", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(null);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "getDisplayBlacklist_v3", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(null);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "getAppManageBlackList_v3", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(null);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "getInstallPackageBlackList", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(null);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "getUninstallPackageBlackList", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(null);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "getNetworkAccessBlacklist", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.setResult(null);
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowAPN_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowWIFIAccessPoint_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowSIMcard_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowUsbMode_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowWIFIAccessPoint_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowWifiDirect_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowBluetooth_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "enableBluetooth_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowWifi_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowWifiadvancesettings_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowData_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowWifiDirect_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "enableData_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "enableWifi_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowBluetoothShare_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "enableWifiHotspot_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowWifiHotspot_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowedUSBtethering_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowedBluetoothtethering_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowAirplaneMode_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "disallowLocation_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=false;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "enableWifiHotspot_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "enableWifiHotspot_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "enableWIFIcaptive_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "enableBluetoothtethering_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });
        
        XposedHelpers.findAndHookMethod(CSDKM, "enableUSBtethering_v3",boolean.class, new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                param.args[0]=true;
            }
        });


    }
}
