package brunoways.com.br.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import brunoways.com.br.sqlite.classesAux.Common;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            try{


            }
            catch (Exception ex){
                Log.e(Common.getTAG(),ex.getMessage());
            }

    }
}
