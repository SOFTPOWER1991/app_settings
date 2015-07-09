package com.example.zhanggeng.application_settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * 
 * TODO: 设置界面
 * 
 * @author : zhanggeng
 * @date : 2015年4月9日
 * @version : v1.0 -----------修订历史-----------
 */
public class SettingActivity extends PreferenceActivity  {


	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);



	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}
