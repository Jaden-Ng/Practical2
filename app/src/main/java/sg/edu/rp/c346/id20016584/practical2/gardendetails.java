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
            tvGarden.setText("滨海湾花园是新加坡中部地区占地 101 公顷的自然公园，毗邻滨海水库。公园由三个滨水花园组成：湾南花园、湾东花园和湾中央花园。这是大自然爱好者的好地方，因为它开满了鲜花。");
            return true;
        }
        return super.onContextItemSelected(item);
    }
}