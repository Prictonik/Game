package dice.fr.uitcocktail;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class MainActivity extends AppCompatActivity {

    public ProgressDialog progressDialog;
    CheckInternet checkInternet = new CheckInternet();
    public Boolean ConnectionFlag;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //setContentView(R.layout.activity_main);



        checkInternet.execute();
    }

    class CheckInternet extends AsyncTask<Void, Void, Void>
    {
        @Override
        protected void onPreExecute(){
            super.onPreExecute();
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("Проверка интернет соединения");
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(true);
            progressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... voids) {

                int Timeout = 2000;
                Socket socket = new Socket();
                SocketAddress socketAddress = new InetSocketAddress("8.8.8.8", 53);

            try {
                socket.connect(socketAddress, Timeout);
                socket.close();

                ConnectionFlag = true;

                Intent intent = new Intent(MainActivity.this, WebViewDip.class);
                startActivity(intent);

            } catch (IOException e) {
                e.printStackTrace();

                ConnectionFlag = false;

                Intent intent2 = new Intent(MainActivity.this, Game.class);
                startActivity(intent2);


                // старт игры
            }



            return null;
        }

        @Override
        protected void onPostExecute(Void result){
            super.onPostExecute(result);




            progressDialog.dismiss();
        }
    }

}
