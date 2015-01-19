package com.example.restswipelistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.way.swipelistview.BaseSwipeListViewListener;
import com.way.swipelistview.SwipeListView;

public class MainActivity2 extends Activity {

	private TextView textView;
	private SwipeListView mSwipeListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity);
//		mSwipeListView = (SwipeListView) 
//				findViewById(R.id.recent_listview);
//		mSwipeListView.setEmptyView(findViewById(R.id.recent_empty));
//		mSwipeListView.setAdapter(new MyAdapter());
//		mSwipeListView.setSwipeListViewListener(mSwipeListViewListener);
//		FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//		Fragment fragment = new TestFragment();
////		FragmentManager fragmentManager = transaction.
//		transaction.add(R.id.container, fragment);
//		transaction.commit();
	
//		setContentView(fragment);

		
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
	

}
