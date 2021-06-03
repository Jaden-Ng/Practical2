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

public class adventuredetails extends AppCompatActivity {
    TextView tvAdv;
    Button btnadv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventuredetails);

        tvAdv=findViewById(R.id.textViewadvact);
        tvAdv.setText("Adventure Cove Waterpark is a water park that has lots of slides, each of the slides are very fun and exciting. Since Singapore is a hot country, one of the best thing to do is to is to go to a waterpark, you can cool yourself off and have fun at the same time. If swimming is your hobby then you can go swim around the lazy river, where you can swim at a leisurely pace.");
        registerForContextMenu(tvAdv);

        btnadv=findViewById(R.id.buttonadvweb);
        btnadv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rwsentosa.com/en/attractions/adventure-cove-waterpark/explore"));
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
            tvAdv.setText("Adventure Cove Waterpark is a water park that has lots of slides, each of the slides are very fun and exciting. Since Singapore is a hot country, one of the best thing to do is to is to go to a waterpark, you can cool yourself off and have fun at the same time. If swimming is your hobby then you can go swim around the lazy river, where you can swim at a leisurely pace.");
            return true;
        }else if(item.getItemId()==1){
            tvAdv.setText("Adventure Cove Waterpark是一个有很多滑梯的水上乐园，每一个滑梯都非常有趣和刺激。由于新加坡是一个炎热的国家，最好的办法之一就是去水上乐园，既可以让自己冷静下来，又可以玩得开心。如果游泳是你的爱好，那么你可以去漂流河游泳，在那里你可以悠闲地游泳。");
            return true;
        }
        return super.onContextItemSelected(item);
    }
}