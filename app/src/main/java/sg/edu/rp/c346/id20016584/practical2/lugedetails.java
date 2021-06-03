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

public class lugedetails extends AppCompatActivity {
    TextView tvluge;
    Button btnLuge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugedetails);

        tvluge=findViewById(R.id.textViewlugeact);
        btnLuge=findViewById(R.id.buttonLugeweb);
        btnLuge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.skylineluge.com/en/sentosa/"));
                startActivity(intent);
            }
        });
        tvluge.setText("Singapore Skyline Luge is something like a GoCart, where you can go and have fun with your friends with. You can have fun racing with your friends, right after you have finish your first round, you can take the skyline up and race down again.");
        registerForContextMenu(tvluge);
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
            tvluge.setText("Singapore Skyline Luge is something like a GoCart, where you can go and have fun with your friends with. You can have fun racing with your friends, right after you have finish your first round, you can take the skyline up and race down again.");
            return true;
        }else if(item.getItemId()==1){
            tvluge.setText("新加坡 Skyline Luge 有点像 GoCart，您可以在那里与朋友一起玩乐。你可以和你的朋友一起享受赛车的乐趣，在你完成第一轮之后，你可以再次上升天际线并再次比赛。");
        }
        return super.onContextItemSelected(item);
    }
}