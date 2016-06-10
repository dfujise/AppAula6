package androidpro.com.br.appaula6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static androidpro.com.br.appaula6.R.id.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bChamar = (Button) findViewById(R.id.formularios);
        bChamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FormulariosActivity.class);
                startActivity(intent);
            }
        });

        Button bChamarAdapters = (Button) findViewById(R.id.adapters);
        bChamarAdapters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AdaptersActivity.class);
                startActivity(intent);
            }
        });

        Button bChamarBars = (Button) findViewById(R.id.Bars);
        bChamarBars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BarsActivity.class);
                startActivity(intent);
            }
        });

        Button bChamarImageView = (Button) findViewById(R.id.ImageView);
        bChamarImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImageViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
