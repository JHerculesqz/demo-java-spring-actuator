package com.huawei._1_ms.user.provider;

import java.util.List;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

import com.huawei._1_ms.user.MarvelMSMonitorUserSDK;

@Component
public class MonitorUserEndPoint implements Endpoint<List<Object>> {
	// #region getId

	@Override
	public String getId() {
		return "marvel_ms_monitor_user";
	}

	// #endregion

	// #region isEnabled

	@Override
	public boolean isEnabled() {
		return true;
	}

	// #endregion

	// #region isSensitive

	@Override
	public boolean isSensitive() {
		return false;
	}

	// #endregion

	// #region invoke

	@Override
	public List<Object> invoke() {
		List<Object> lstRes = MarvelMSMonitorUserSDK.getProvider().getCache();
		return lstRes;
	}

	// #endregion
}
