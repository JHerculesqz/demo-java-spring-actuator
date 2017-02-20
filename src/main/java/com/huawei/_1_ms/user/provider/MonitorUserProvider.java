package com.huawei._1_ms.user.provider;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.springframework.stereotype.Component;

@Component
public class MonitorUserProvider {
	// #region Fields

	private BlockingQueue<Object> cache = new LinkedBlockingQueue<Object>();

	// #endregion

	// #region setCache

	public void setCache(Object oUserPOJO) {
		try {
			// TODO:need limit max size
			cache.put(oUserPOJO);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// #endregion

	// #region getCache

	public List<Object> getCache() {
		List<Object> lstRes = new ArrayList<Object>();

		while (true) {
			Object oItemInQueue = cache.poll();
			if (null != oItemInQueue) {
				lstRes.add(oItemInQueue);
			}

			if (cache.isEmpty()) {
				break;
			}
		}

		return lstRes;
	}

	// #endregion
}
