package com.huawei.client.provider.subprovider;

import com.huawei._1_ms.user.MarvelMSMonitorUserSDK;

public class ClientSubProvider {
	public static void hello() {
		String str = "1";
		MarvelMSMonitorUserSDK.getProvider().setCache(str);
	}
}
