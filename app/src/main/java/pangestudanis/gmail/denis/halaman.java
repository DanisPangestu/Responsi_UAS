package pangestudanis.gmail.denis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class halaman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman);
        Button btn = (Button) findViewById(R.id.btnlist);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(halaman.this,kamera.class);
                startActivity(i);
            }
        });
    }

    public void maps(View view) {
        Intent i = new Intent(halaman.this,MapsActivity.class);
        startActivity(i);
    }
    }