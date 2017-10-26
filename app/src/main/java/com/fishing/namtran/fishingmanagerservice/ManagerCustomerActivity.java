package com.fishing.namtran.fishingmanagerservice;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

public class ManagerCustomerActivity extends BaseMenuActivity {

    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_manager_customer);

        setContentView(R.layout.activity_manager_customer);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);

        //intent = new Intent(getApplicationContext(), MenuMainActivity.class);
       // startActivity(intent);
    }
*/

    private TableLayout tableLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_customer);
        tableLayout=(TableLayout)findViewById(R.id.tableLayout);

        for (int i=0;i<5;i++){
            View tableRow = LayoutInflater.from(this).inflate(R.layout.items_customer,null,false);
            TextView history_display_no  = (TextView) tableRow.findViewById(R.id.history_display_no);
            TextView history_display_date  = (TextView) tableRow.findViewById(R.id.history_display_date);
            TextView history_display_orderid  = (TextView) tableRow.findViewById(R.id.history_display_orderid);
            TextView history_display_quantity  = (TextView) tableRow.findViewById(R.id.history_display_quantity);

            history_display_no.setText(""+(i+1));
            history_display_date.setText("2014-02-05");
            history_display_orderid.setText("S0"+(i+1));
            history_display_quantity.setText(""+(20+(i+1)));
            tableLayout.addView(tableRow);
        }
    }
//https://stackoverflow.com/questions/21568835/how-to-dispaly-result-list-into-tablelayout-row-in-androi
// https://stackoverflow.com/questions/31353447/how-to-list-all-the-rows-in-a-table-using-sqlite-in-android-studio-using-cursor
}
