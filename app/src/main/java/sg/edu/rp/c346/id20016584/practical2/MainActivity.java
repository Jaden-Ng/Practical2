package sg.edu.rp.c346.id20016584.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnOrchard, btnChinatown, btnLuge, btnAdventure, btnHawker, btnGarden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdventure=findViewById(R.id.buttonadv);
        btnChinatown=findViewById(R.id.buttonchinatown);
        btnGarden=findViewById(R.id.buttongarden);
        btnHawker=findViewById(R.id.buttonhawker);
        btnLuge=findViewById(R.id.buttonluge);
        btnOrchard=findViewById(R.id.buttonorchard);

        btnHawker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, hawkerdetails.class);
                startActivity(intent);
            }
        });
        btnOrchard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, orcharddetails.class);
                startActivity(intent);
            }
        });
        btnLuge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, lugedetails.class);
                startActivity(intent);
            }
        });
        btnChinatown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, chinatowndetails.class);
                startActivity(intent);
            }
        });
        btnGarden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, gardendetails.class);
                startActivity(intent);
            }
        });
        btnAdventure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, adventuredetails.class);
                startActivity(intent);
            }
        });
    }
}