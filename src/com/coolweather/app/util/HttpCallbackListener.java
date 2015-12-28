package com.coolweather.app.util;
/**
 * HttpUtil中使用该接口来回调服务返回的结果
 * @author Administrator
 *
 */
public interface HttpCallbackListener {
	void onFinish(String response);
	
	void onError(Exception e);

}
