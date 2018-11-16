package dev.reloader.fromfilepdfview;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    String FILENAME = "fileSaco.pdf";
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pdfView=(PDFView)findViewById(R.id.pdfView);


        File file = new File("/storage/emulated/0/SacoOliveros/fileSaco.pdf");
        Integer pageNumber = 1;
        pdfView.fromFile(file).defaultPage(pageNumber)
                .password("reloader")
                .load();

//
//if (!file.exists()) {
//            try {
//                InputStream asset = this.getAssets().open(FILENAME);
//                ReadTxt.fromStream(asset)
//                       // .pages(0, 2, 1, 3, 3, 3)
//                        .password("reloader")
//                        .enableSwipe(true)
//                        .swipeHorizontal(false)
//                        .enableDoubletap(true)
//                        .defaultPage(0)
//                        .enableAnnotationRendering(false)
//                        .scrollHandle(null)
//                        .enableAntialiasing(true)
//                        .spacing(0)
//                        .load();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }else {
//            Toast.makeText(getApplicationContext(),
//
//                    "File not found",Toast.LENGTH_LONG).show();
//        }
    }

    @Override    protected void onStart() {
        super.onStart();
    }

}
