package com.huawei._1_ms.user;

import com.huawei._1_fw.core.ioc.IOCUtils;
import com.huawei._1_ms.user.provider.MonitorUserProvider;

public class MarvelMSMonitorUserSDK {
	// #region getProvider

	public static MonitorUserProvider getProvider() {
		MonitorUserProvider oUserAnylyserProvider = IOCUtils.getInstance().getBean(MonitorUserProvider.class);
		return oUserAnylyserProvider;
	}

	// #endregion
}
