package hmif.strangerthings;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VisiMisi extends AppCompatActivity {
    Button visi,misi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visi_misi);
        visi=findViewById(R.id.visi);
        misi=findViewById(R.id.misi);
        visi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent internet=new Intent(Intent.ACTION_VIEW);
                String url="https://www.cnnindonesia.com/";
                internet.setData(Uri.parse(url));
                startActivity(internet);
            }
        });
        misi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent internet=new Intent(Intent.ACTION_VIEW);
                String url="https://www.cnnindonesia.com/";
                internet.setData(Uri.parse(url));
                startActivity(internet);
            }
        });

    }
}
