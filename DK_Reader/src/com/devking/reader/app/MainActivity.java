package com.devking.reader.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.GridView;
import android.widget.SimpleAdapter;

/**
 * DK_Reader主界面程序
 * @author King
 *
 */
public class MainActivity extends Activity {

	private GridView bookRackGridView = null; 	//书架
	
	private List<Map<String, String>> bookList = null; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bookRackGridView = (GridView) findViewById(R.id.bookRack);
		initBookData();
		initBookRackData();
	}
	
	private void initBookData(){
		bookList = new ArrayList<Map<String,String>>();
		Map<String, String> bookMap1 = new HashMap<String, String>();
		bookMap1.put("bookName", "Think in Python");
		Map<String, String> bookMap2 = new HashMap<String, String>();
		bookMap2.put("bookName", "Think in java");
		Map<String, String> bookMap3 = new HashMap<String, String>();
		bookMap3.put("bookName", "Think in C");
		Map<String, String> bookMap4 = new HashMap<String, String>();
		bookMap4.put("bookName", "Think in C++");
		bookList.add(bookMap1);
		bookList.add(bookMap2);
		bookList.add(bookMap3);
		bookList.add(bookMap4);
		
	}

	public void initBookRackData(){
		SimpleAdapter simpleAdapter = new SimpleAdapter(this, bookList, R.layout.book_simpleadapter, new String[]{"bookName"}, new int[]{R.id.bookName});
		bookRackGridView.setAdapter(simpleAdapter);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
