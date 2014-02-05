package edu.fsu.cs.mobile.example.dialog2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlertDialogListExample extends Activity {

	final String DIALOG_TAG = "MyListDialogFragment";
	String[] countries = new String[]{ "Netherlands", "USA", "St. Martin", "Curacao", "Jamaica" };
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				MyListDialogFragment alertListFragment = MyListDialogFragment.newInstance("Exit", 
						countries);
				alertListFragment.show(getFragmentManager(), DIALOG_TAG);
			}
		});
        
    }
}