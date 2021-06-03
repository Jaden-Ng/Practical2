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

public class chinatowndetails extends AppCompatActivity {
    TextView tvChina;
    Button btnChina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinatowndetails);

        tvChina=findViewById(R.id.textViewchinaact);
        tvChina.setText("Chinatown's maze of narrow roads includes Chinatown Food Street, with its restaurants serving traditional fare like Hainanese chicken rice, noodles and satay. Souvenir shops and indie boutiques dot the area, offering clothes, crafts and antiques, while Club Street is full of trendy wine bars. Cultural institutions here include the 1827 Sri Mariamman Temple and the ornate Buddha Tooth Relic Temple and Museum.");
        registerForContextMenu(tvChina);

        btnChina=findViewById(R.id.buttonchinaweb);
        btnChina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://chinatown.sg/"));
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
            tvChina.setText("Chinatown's maze of narrow roads includes Chinatown Food Street, with its restaurants serving traditional fare like Hainanese chicken rice, noodles and satay. Souvenir shops and indie boutiques dot the area, offering clothes, crafts and antiques, while Club Street is full of trendy wine bars. Cultural institutions here include the 1827 Sri Mariamman Temple and the ornate Buddha Tooth Relic Temple and Museum.");
            return true;
        }else if(item.getItemId()==1){
            tvChina.setText("牛车水迷宫般的狭窄道路包括唐人街美食街，其餐厅供应海南鸡饭、面条和沙爹等传统美食。该地区遍布纪念品商店和独立精品店，出售服装、工艺品和古董，而俱乐部街则遍布时尚的酒吧。这里的文化机构包括 1827 年的马里安曼神庙和华丽的佛牙舍利庙和博物馆。");
            return true;
        }
        return super.onContextItemSelected(item);
    }
}