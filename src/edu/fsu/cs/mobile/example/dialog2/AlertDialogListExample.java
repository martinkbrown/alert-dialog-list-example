package edu.fsu.cs.mobile.example.dialog2;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogListExample extends Activity {

	String[] countries = new String[]{"Netherlands", "USA", "St. Martin", "Curacao"};
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				showDialog(0);
				
			}
		});
        
    }
    
    public Dialog onCreateDialog(int id) {
    	
    	Builder builder = new AlertDialog.Builder(this);
    	builder.setTitle("Select a Country");
    	
    	builder.setItems(countries, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int index) {
				
				Toast.makeText(getApplicationContext(), 
						"You selected " + countries[index], Toast.LENGTH_LONG).show();
				
			}
		});
    	
    	return builder.create();
    }
}