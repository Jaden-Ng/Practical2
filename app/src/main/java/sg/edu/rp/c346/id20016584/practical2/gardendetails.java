package sg.edu.rp.c346.id20016584.practical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gardendetails extends AppCompatActivity {
    TextView tvGarden;
    Button btngarden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gardendetails);

        tvGarden=findViewById(R.id.textViewgardenact);
        tvGarden.setText("The Gardens by the Bay is a nature park spanning 101 hectares in the Central Region of Singapore, adjacent to the Marina Reservoir. The park consists of three waterfront gardens: Bay South Garden, Bay East Garden and Bay Central Garden. This a great place for nature lovers as it is filled with flowers.");
        registerForContextMenu(tvGarden);

        btngarden=findViewById(R.id.buttongardenweb);
        btngarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gardensbythebay.com.sg/en.html"));
                startActivity(intent);
            }
        });
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "Chinese");
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==0){
            tvGarden.setText("The Gardens by the Bay is a nature park spanning 101 hectares in the Central Region of Singapore, adjacent to the Marina Reservoir. The park consists of three waterfront gardens: Bay South Garden, Bay East Garden and Bay Central Garden. This a great place for nature lovers as it is filled with flowers.");
            return true;
        }else if(item.getItemId()==1){
            tvGarden.setText("????????????????????????????????????????????? 101 ???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????");
            return true;
        }
        return super.onContextItemSelected(item);
    }
}