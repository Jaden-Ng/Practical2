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

public class hawkerdetails extends AppCompatActivity {
    TextView tvHawker;
    Button btnHawker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hawkerdetails);

        tvHawker=findViewById(R.id.textViewHawkeract);
        tvHawker.setText("For the uninitiated, Singapore hawker centres are basically large food courts with stalls around the perimeter serving everything from full meals to snacks and drinks. You'll usually find a selection of local dishes as well as flavors from across the world, including Chinese, Malay, Indian, and western.");
        registerForContextMenu(tvHawker);

        btnHawker=findViewById(R.id.buttonhawkerweb);
        btnHawker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://sg.hotels.com/go/singapore/best-singapore-hawker-centres"));
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
            tvHawker.setText("For the uninitiated, Singapore hawker centres are basically large food courts with stalls around the perimeter serving everything from full meals to snacks and drinks. You'll usually find a selection of local dishes as well as flavors from across the world, including Chinese, Malay, Indian, and western. This a good place for those that are interested in local food, and are intersted in trying a wide variety of dishes.");
            return true;
        }else if(item.getItemId()==1){
            tvHawker.setText("对于外行来说，新加坡小贩中心基本上是大型美食广场，周边有摊位，供应从正餐到小吃和饮料的各种食物。您通常会发现精选的当地菜肴以及来自世界各地的风味美食，包括中国菜、马来菜、印度菜和西餐。对于那些对当地美食感兴趣并有兴趣尝试各种菜肴的人来说，这是一个好地方。");
            return true;
        }
        return super.onContextItemSelected(item);
    }
}