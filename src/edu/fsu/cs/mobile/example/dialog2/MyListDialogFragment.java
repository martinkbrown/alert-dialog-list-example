package edu.fsu.cs.mobile.example.dialog2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MyListDialogFragment extends DialogFragment {
	public static MyListDialogFragment newInstance(String title, String[] items) {
		MyListDialogFragment alertFragment = new MyListDialogFragment();
		Bundle args = new Bundle();
		args.putString("title", title);
		args.putStringArray("list", items);
		alertFragment.setArguments(args);
		return alertFragment;
	}
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		String title = getArguments().getString("title");
		final String[] items = getArguments().getStringArray("list");
		
		return new AlertDialog.Builder(getActivity())
			.setIcon(R.drawable.ic_launcher)
			.setTitle(title)
			.setItems(items, new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int index) {
					Toast.makeText(getActivity(), 
							"You selected " + items[index], Toast.LENGTH_LONG).show();
				}
			})
			.create();
	}
}
