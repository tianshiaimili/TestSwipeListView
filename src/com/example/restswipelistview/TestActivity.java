package com.example.restswipelistview;

import android.os.Bundle;
import android.widget.TextView;

import com.way.swipeback.SwipeBackActivity;
import com.way.swipelistview.SwipeListView;

public class TestActivity extends SwipeBackActivity {

	private TextView textView;
	private SwipeListView mSwipeListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LogUtils2.e("*******onCreate**********");
		setContentView(R.layout.fragment_main);
		
		
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		
		LogUtils2.e("*******over**********");
		
	}
	
	
	@Override
	protected void onStop() {
		super.onStop();
		
		LogUtils2.e("*******over**********");
		
	}
	
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		LogUtils2.e("*******over**********");
		
	}
	
//
//	class MyAdapter extends BaseAdapter{
//
//		@Override
//		public int getCount() {
//			// TODO Auto-generated method stub
//			return 4;
//		}
//
//		@Override
//		public Object getItem(int position) {
//			// TODO Auto-generated method stub
//			return null;
//		}
//
//		@Override
//		public long getItemId(int position) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//
//		@Override
//		public View getView(int position, View convertView, ViewGroup parent) {
//			
//			TextView textView = new TextView(getApplicationContext());
//			textView.setText("ABC=="+position);
//			
//			return textView;
//		}
//		
//	}
//
//	BaseSwipeListViewListener mSwipeListViewListener = new BaseSwipeListViewListener() {
//		@Override
//		public void onClickFrontView(int position) {
////			Cursor clickCursor = mRecentChatAdapter.getCursor();
////			clickCursor.moveToPosition(position);
////			String jid = clickCursor.getString(clickCursor
////					.getColumnIndex(ChatConstants.JID));
////			Uri userNameUri = Uri.parse(jid);
////			Intent toChatIntent = new Intent(getActivity(), ChatActivity.class);
////			toChatIntent.setData(userNameUri);
////			toChatIntent.putExtra(ChatActivity.INTENT_EXTRA_USERNAME,
////					XMPPHelper.splitJidAndServer(jid));
//			startActivity(toChatIntent);
//		}
//
//		@Override
//		public void onClickBackView(int position) {
//			mSwipeListView.closeOpenedItems();// �رմ򿪵���
//		}
//	};
	

}
