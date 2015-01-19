package com.example.restswipelistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.way.slidingmenu.BaseSlidingFragmentActivity;
import com.way.slidingmenu.SlidingMenu;
import com.way.swipelistview.BaseSwipeListViewListener;
import com.way.swipelistview.SwipeListView;

public class MainActivity extends BaseSlidingFragmentActivity implements FragmentCallBack ,OnClickListener{

	private TextView textView;
	private SwipeListView mSwipeListView;
	private SlidingMenu mSlidingMenu;
	
	@Override
	public  void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 initSlidingMenu();
		setContentView(R.layout.activity);

		
	}


	private void initSlidingMenu() {
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		int mScreenWidth = dm.widthPixels;// 获取屏幕分辨率宽度
		setBehindContentView(R.layout.main_left_layout);// 设置左菜单，就是向右滑动显示出来的菜单
		FragmentTransaction mFragementTransaction = getSupportFragmentManager()
				.beginTransaction();
		Fragment mFrag = new TestFragment();
		mFragementTransaction.replace(R.id.main_left_fragment, mFrag);
		mFragementTransaction.commit();
		// customize the SlidingMenu
		mSlidingMenu = getSlidingMenu();
		mSlidingMenu.setMode(SlidingMenu.LEFT);// 设置是左滑还是右滑，还是左右都可以滑，我这里左右都可以滑
		mSlidingMenu.setShadowWidth(mScreenWidth / 50);// 设置阴影宽度 就是滑动时页边的阴影
		mSlidingMenu.setShadowDrawable(R.drawable.shadow_left);// 设置左菜单阴影图片
		mSlidingMenu.setBehindOffset(mScreenWidth / 5);// 设置菜单宽度
		mSlidingMenu.setFadeDegree(0.35f);// 设置淡入淡出的比例
		mSlidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);//设置滑动的模式
		mSlidingMenu.setSecondaryShadowDrawable(R.drawable.shadow_right);// 设置右菜单阴影图片
		mSlidingMenu.setFadeEnabled(true);// 设置滑动时菜单的是否淡入淡出
		mSlidingMenu.setBehindScrollScale(0.333f);// 设置滑动时拖拽效果
	}
	
	
	
	class MyAdapter extends BaseAdapter{

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 4;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			TextView textView = new TextView(getApplicationContext());
			textView.setText("ABC=="+position);
			convertView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.recent_listview_item, null);
			return convertView;
		}
		
	}

	BaseSwipeListViewListener mSwipeListViewListener = new BaseSwipeListViewListener() {
		@Override
		public void onClickFrontView(int position) {
//			Cursor clickCursor = mRecentChatAdapter.getCursor();
//			clickCursor.moveToPosition(position);
//			String jid = clickCursor.getString(clickCursor
//					.getColumnIndex(ChatConstants.JID));
//			Uri userNameUri = Uri.parse(jid);
			Intent toChatIntent = new Intent(getApplicationContext(), TestActivity.class);
//			toChatIntent.setData(userNameUri);
//			toChatIntent.putExtra(ChatActivity.INTENT_EXTRA_USERNAME,
//					XMPPHelper.splitJidAndServer(jid));
			startActivity(toChatIntent);
		}

		@Override
		public void onClickBackView(int position) {
			mSwipeListView.closeOpenedItems();// �رմ򿪵���
		}
	};

	///////////////////////////////////////////////////////////////
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MainActivity getMainActivity() {
		// TODO Auto-generated method stub
		return this;
	}
	

}
