package io.hackthehouse;

import android.content.Context;

import io.relayr.RelayrSdk;

abstract class RelayrSdkInitializer {

    static void initSdk(Context context) {
        new RelayrSdk.Builder(context).inMockMode(false).build();
    }

}
