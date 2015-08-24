package com.kuenzWin.hightleveladapter;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.kuenzWin.hightleveladapter.bean.Msg;

public class MainActivity extends Activity {

	private ListView mListView;
	private List<Msg> mDatas;
	private MyAdapterWithCommViewHolder mAdapterWithCommViewHolder;
	private MyAdapterWithCommAdapter myAdapterWithCommAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initDatas();
		initView();
	}

	/**
	 * ��ʼ�����ݺ�������
	 * 
	 * @return void
	 * @author Yann
	 * @date 2015-8-5 ����10:15:03
	 */
	private void initDatas() {
		mDatas = new ArrayList<Msg>();
		Msg Msg = new Msg("Android�¼��� Get 1",
				"Android-�������ܵ�ListView��GridView������", "2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android�¼��� Get 2", "Android-�������ܵ�ListView��GridView������",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android�¼��� Get 3", "Android-�������ܵ�ListView��GridView������",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android�¼��� Get 4", "Android-�������ܵ�ListView��GridView������",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android�¼��� Get 5", "Android-�������ܵ�ListView��GridView������",
				"2015-08-05", "10086");
		mDatas.add(Msg);

		Msg = new Msg("Android�¼��� Get 6", "Android-�������ܵ�ListView��GridView������",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android�¼��� Get 7", "Android-�������ܵ�ListView��GridView������",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android�¼��� Get 8", "Android-�������ܵ�ListView��GridView������",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android�¼��� Get 9", "Android-�������ܵ�ListView��GridView������",
				"2015-08-05", "10086");
		mDatas.add(Msg);

		Msg = new Msg("Android�¼��� Get 10", "Android-�������ܵ�ListView��GridView������",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android�¼��� Get 11", "Android-�������ܵ�ListView��GridView������",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android�¼��� Get 12", "Android-�������ܵ�ListView��GridView������",
				"2015-08-05", "10086");
		mDatas.add(Msg);
		Msg = new Msg("Android�¼��� Get 13", "Android-�������ܵ�ListView��GridView������",
				"2015-08-05", "10086");
		mDatas.add(Msg);

		mAdapterWithCommViewHolder = new MyAdapterWithCommViewHolder(this,
				mDatas, R.layout.item);
		myAdapterWithCommAdapter = new MyAdapterWithCommAdapter(this, mDatas,
				R.layout.item);
	}

	/**
	 * Ϊ�б�����������
	 * 
	 * @return void
	 * @author Yann
	 * @date 2015-8-5 ����10:15:04
	 */
	private void initView() {
		mListView = (ListView) findViewById(R.id.lv);
		// mListView.setAdapter(mAdapterWithCommViewHolder);
		mListView.setAdapter(myAdapterWithCommAdapter);
	}
}
