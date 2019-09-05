package shraddha.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programmingList=(RecyclerView) findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] branches = new String[]{"CS", "IT", "MECH", "ECE", "EEE", "CIVIL", "BIOT", "PROD", "CHEM","HTLM","B.PHARM","IPH","IMTH","ICHEM"};
        programmingList.setAdapter(new ProgrammingAdapter(branches)); //temporary instance we dont know name but has address has both global variables

    }
}
