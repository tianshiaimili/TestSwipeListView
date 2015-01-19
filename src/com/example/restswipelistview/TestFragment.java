package com.example.restswipelistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.way.swipelistview.BaseSwipeListViewListener;
import com.way.swipelistview.SwipeListView;

public class TestFragment extends Fragment {

	private TextView textView;
	private SwipeListView mSwipeListView;
	private View contentView;
	private FragmentCallBack mFragmentCallBack;
	
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			mFragmentCallBack = (FragmentCallBack) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement OnHeadlineSelectedListener");
		}
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	}

	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		contentView = inflater.inflate(R.layout.activity_main, null);
		mSwipeListView = (SwipeListView) contentView.
				findViewById(R.id.recent_listview);
		mSwipeListView.setEmptyView(contentView.findViewById(R.id.recent_empty));
		mSwipeListView.setAdapter(new MyAdapter());
		mSwipeListView.setSwipeListViewListener(mSwipeListViewListener);
		
		return contentView;
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
			
			TextView textView = new TextView(getActivity());
			textView.setText("ABC=="+position);
			convertView = LayoutInflater.from(getActivity()).inflate(R.layout.recent_listview_item, null);
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
			Intent toChatIntent = new Intent(getActivity(), TestActivity.class);
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
