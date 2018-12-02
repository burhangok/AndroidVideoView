package ismek.dogafotograflari;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    public VideoView videoAlani;

    public Button oynat,durdur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoAlani = findViewById(R.id.video1);

        Uri adres = Uri.parse("android.resource://" + getPackageName()
                + "/"
                + R.raw.video);

        videoAlani.setVideoURI(adres);


        oynat = findViewById(R.id.play);
        durdur =findViewById(R.id.pause);

        oynat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoAlani.start();
            }
        });



        durdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoAlani.pause();
            }
        });
    }


}
