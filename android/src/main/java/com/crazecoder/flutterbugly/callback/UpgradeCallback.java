package com.crazecoder.flutterbugly.callback;

import com.tencent.bugly.UpgradeInfo;

public interface UpgradeCallback {
    void onUpgrade(UpgradeInfo strategy);
}
