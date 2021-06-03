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

public class orcharddetails extends AppCompatActivity {
    TextView tvOrchard;
    Button btnOrchard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orcharddetails);

        tvOrchard=findViewById(R.id.textVieworchardact);
        tvOrchard.setText("Orchard Road is Singapore’s retail heart, with discount outlets, department stores and upscale boutiques, alongside luxury hotels. Emerald Hill Road is a mix of colorful Chinese baroque houses and casual pubs, while al fresco bars and eateries can be found along nearby Cuppage Terrace. The Newton Food Centre is a popular foodie hub, offering everything from barbecued seafood and roasted meats to traditional desserts. I highly recommed you to shop at Orchard Road if you love shopping.");
        registerForContextMenu(tvOrchard);

        btnOrchard=findViewById(R.id.buttonorchardweb);
        btnOrchard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.visitsingapore.com/see-do-singapore/places-to-see/orchard/"));
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
            tvOrchard.setText("Orchard Road is Singapore’s retail heart, with discount outlets, department stores and upscale boutiques, alongside luxury hotels. Emerald Hill Road is a mix of colorful Chinese baroque houses and casual pubs, while al fresco bars and eateries can be found along nearby Cuppage Terrace. The Newton Food Centre is a popular foodie hub, offering everything from barbecued seafood and roasted meats to traditional desserts. I highly recommed you to shop at Orchard Road if you love shopping.");
            return true;
        }else if(item.getItemId()==1){
            tvOrchard.setText("乌节路是新加坡的零售中心，拥有折扣店、百货公司和高档精品店，以及豪华酒店。翡翠山路是色彩缤纷的中式巴洛克式房屋和休闲酒吧的混合体，而附近的 Cuppage Terrace 设有露天酒吧和餐馆。牛顿食品中心是一个受欢迎的美食中心，提供从烧烤海鲜和烤肉到传统甜点的各种美食。如果您喜欢购物，我强烈建议您到乌节路购物。");
        }
        return super.onContextItemSelected(item);
    }
}