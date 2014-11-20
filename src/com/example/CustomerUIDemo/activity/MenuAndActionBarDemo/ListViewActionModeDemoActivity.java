package com.example.CustomerUIDemo.activity.MenuAndActionBarDemo;

import com.example.CustomerUIDemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AbsListView.MultiChoiceModeListener;

public class ListViewActionModeDemoActivity extends Activity implements MultiChoiceModeListener{

	private String[] items = {"Hello world", "Happy time", "Good Day", "Nice Ball"};
	private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview_action_mode_demo_activity);

		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, items);
		listView = (ListView) findViewById(R.id.listviewActionModeDemo_listView);
//		registerForContextMenu(listView);	// long-click to open the Context Menu
		listView.setAdapter(adapter);
		listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
		listView.setMultiChoiceModeListener(this);
		
	}
	
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		finish();
	}

	@Override
	public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        // Inflate the menu for the CAB
        MenuInflater inflater = actionMode.getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
        actionMode.setTitle("ListView Title");
        return true;
	}

	@Override
	public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        // Here you can perform updates to the CAB due to
        // an invalidate() request
        return false;
	}

	@Override
	public boolean onActionItemClicked(ActionMode actionMode, MenuItem item) {
        // Respond to clicks on the actions in the CAB
        switch (item.getItemId()) {
		case R.id.contextMenu_cart:
			// deleteSelectedItems();
			actionMode.finish(); // Action picked, so close the CAB
			return true;
		default:
			return false;
		}
	}

	@Override
	public void onDestroyActionMode(ActionMode mode) {
        // Here you can make any necessary updates to the activity when
        // the CAB is removed. By default, selected items are deselected/unchecked.
		Log.d("Mylog", "close");
	}

	@Override
	public void onItemCheckedStateChanged(ActionMode mode,
			int position, long id, boolean checked) {
        // Here you can do something when items are selected/de-selected,
        // such as update the title in the CAB
		Log.d("Mylog", "click:" + items[position]);
	}


}
