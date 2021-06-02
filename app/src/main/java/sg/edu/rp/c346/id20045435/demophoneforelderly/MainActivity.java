package sg.edu.rp.c346.id20045435.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCallSon, btnCallDaugther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCallSon = findViewById(R.id.buttonCallSon);
        btnCallDaugther = findViewById(R.id.buttonCallDaugther);

        btnCallSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "92240336"));
                startActivity(intentCall);
            }
        });

        btnCallDaugther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "89675543"));
                //Intent intentCall = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amazon.com"));
                startActivity(intentCall);
            }
        });
    }
}