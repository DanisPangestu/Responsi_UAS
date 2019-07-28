package pangestudanis.gmail.denis;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

//merupakan public class di aplikasi ini
public class kamera extends AppCompatActivity {
    ImageView image;
    //kode dibawah ini merupakan script untuk membuat button serta menghubungkan ke activity_main dan mengambil foto
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamera);
        Button btnCamera = (Button) findViewById(R.id.Btn);
        image = (ImageView) findViewById(R.id.image);
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent takePictureIntent =
                        new Intent (MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(takePictureIntent, 0);

            }
        });

    }
    //script dibawah ini merupakan script untuk membuat tombol kembali menggunakan result canceled serta if else
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        if (resultCode == RESULT_OK){
            super.onActivityResult(requestCode, resultCode, data);
            Bitmap imageBitmap = (Bitmap) data.getExtras().get("data");
            image.setImageBitmap(imageBitmap);
        }else if (resultCode == RESULT_CANCELED){
            Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        }}}