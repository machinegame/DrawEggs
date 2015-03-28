package com.example.c53optionsmenu3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.widget.TextView;

public class OptionsMenuActivity extends Activity {
	private static int FIRST = Menu.FIRST;
	private static int SECOND = Menu.FIRST + 1;
	private static int THREE = Menu.FIRST + 2;
	private TextView textView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options_menu);
		textView = (TextView)findViewById(R.id.textView1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.options_menu, menu);
//		return true;
		menu.add(0,FIRST,1,"��ʼ��Ϸ");
		menu.add(0,SECOND,2,"��ͣ��Ϸ");
		// ���Ӳ˵���
		MenuItem item = menu.add(0,THREE,3,"������Ϸ");
		// �����Ӳ˵�
		final SubMenu subMenu = menu.addSubMenu(1,100,100,"�˳���Ϸ");
		// ���Ӳ˵���
		subMenu.add(2,101,101,"ȷ��");
		subMenu.add(2,102,102,"ȡ��");
		
		item.setOnMenuItemClickListener(new OnMenuItemClickListener() {
			
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				// TODO Auto-generated method stub
				textView.setText("������Ϸ");
				return false;
			}
		});
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == 1) {
			textView.setText("��ʼ��Ϸ");
		}
		if (id == 2) {
			textView.setText("��ͣ��Ϸ");
		}
		return super.onOptionsItemSelected(item);
	}
}