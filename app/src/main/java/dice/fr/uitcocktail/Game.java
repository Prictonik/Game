package dice.fr.uitcocktail;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Game extends AppCompatActivity {

    ImageButton imageButton;
    public int lavel=1;
    ImageView image1, image2, image3, image4, image5, image10, image11, image12, image13, image14, image15, image20, image21, image22, image23, image24, image25;
    //Context context;
    TextView lavelView, aiView, userView;
    FrameLayout frame;
    Context context;

    //calculeted calculeted = new calculeted();
    //int

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        imageButton = findViewById(R.id.image);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);

        image10 = findViewById(R.id.image10);
        image11 = findViewById(R.id.image11);
        image12 = findViewById(R.id.image12);
        image13 = findViewById(R.id.image13);
        image14 = findViewById(R.id.image14);
        image15 = findViewById(R.id.image15);

        image20 = findViewById(R.id.image20);
        image21 = findViewById(R.id.image21);
        image22 = findViewById(R.id.image22);
        image23 = findViewById(R.id.image23);
        image24 = findViewById(R.id.image24);
        image25 = findViewById(R.id.image25);


        lavelView = findViewById(R.id.level);
        aiView = findViewById(R.id.ai);
        userView = findViewById(R.id.user);

        //context.getApplicationContext();

        //calculeted.execute();

        if(lavel==5)
        {
            lavelView.setText(lavel);
            // Вы победили, начинаем заново
        }




            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    image10.setVisibility(View.INVISIBLE);
                    image11.setVisibility(View.INVISIBLE);
                    image12.setVisibility(View.INVISIBLE);
                    image13.setVisibility(View.INVISIBLE);
                    image14.setVisibility(View.INVISIBLE);
                    image15.setVisibility(View.INVISIBLE);

                    image20.setVisibility(View.INVISIBLE);
                    image21.setVisibility(View.INVISIBLE);
                    image22.setVisibility(View.INVISIBLE);
                    image23.setVisibility(View.INVISIBLE);
                    image24.setVisibility(View.INVISIBLE);
                    image25.setVisibility(View.INVISIBLE);


                    Random random = new Random();

                    int sum_user=0, sum_ai=0;

                    int[] user = new int[lavel];
                    int[] ai = new int[lavel];

                    for(int i=0; i<lavel; i++)
                    {
                        user[i] = 1 + random.nextInt(7-1);
                        ai[i] = 1 + random.nextInt(7-1);

                        if(lavel == 1){
                            lavelView.setText("Lavel" + String.valueOf(lavel));
                            switch (user[i]){
                                case (1):
                                    image10.setBackgroundResource(R.drawable.dice_1);
                                    image10.setVisibility(View.VISIBLE);
                                    break;
                                case (2):
                                    image10.setBackgroundResource(R.drawable.dice_2);
                                    image10.setVisibility(View.VISIBLE);
                                    break;
                                case (3):
                                    image10.setBackgroundResource(R.drawable.dice_3);
                                    image10.setVisibility(View.VISIBLE);
                                case (4):
                                    image10.setBackgroundResource(R.drawable.dice_4);
                                    image10.setVisibility(View.VISIBLE);
                                    break;
                                case (5):
                                    image10.setBackgroundResource(R.drawable.dice_5);
                                    image10.setVisibility(View.VISIBLE);
                                    break;
                                case (6):
                                    image10.setBackgroundResource(R.drawable.dice_6);
                                    image10.setVisibility(View.VISIBLE);
                                    break;
                                default: break;
                            }
                        }

                        if( lavel==2 ){
                            lavelView.setText("Lavel" + String.valueOf(lavel));
                            switch (user[i]){
                                case (1):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_1);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_1);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (2):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_2);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_2);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (3):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_3);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_3);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                case (4):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_4);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_4);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (5):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_5);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_5);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (6):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_6);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_6);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                default: break;
                            }
                        }
                        if( lavel==3 ){
                            lavelView.setText("Lavel" + String.valueOf(lavel));
                            switch (user[i]){
                                case (1):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_1);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_1);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_1);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (2):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_2);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_2);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_2);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (3):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_3);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_3);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_3);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                case (4):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_4);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_4);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_4);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (5):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_5);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_5);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_5);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (6):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_6);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_6);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_6);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                default: break;
                            }
                        }
                        if( lavel==4 ){
                            lavelView.setText("Lavel" + String.valueOf(lavel));
                            switch (user[i]){
                                case (1):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_1);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_1);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_1);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image13.setBackgroundResource(R.drawable.dice_1);
                                        image13.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (2):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_2);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_2);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_2);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image13.setBackgroundResource(R.drawable.dice_2);
                                        image13.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (3):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_3);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_3);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_3);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image13.setBackgroundResource(R.drawable.dice_3);
                                        image13.setVisibility(View.VISIBLE);
                                    }
                                case (4):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_4);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_4);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_4);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image13.setBackgroundResource(R.drawable.dice_4);
                                        image13.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (5):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_5);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_5);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_5);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image13.setBackgroundResource(R.drawable.dice_5);
                                        image13.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (6):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_6);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_6);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_6);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image13.setBackgroundResource(R.drawable.dice_6);
                                        image13.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                default: break;
                            }
                        }
                        if( lavel==5 ){
                            lavelView.setText("Lavel" + String.valueOf(lavel));
                            switch (user[i]){
                                case (1):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_1);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_1);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_1);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image13.setBackgroundResource(R.drawable.dice_1);
                                        image13.setVisibility(View.VISIBLE);
                                    }
                                    if(i==4) {
                                        image14.setBackgroundResource(R.drawable.dice_1);
                                        image14.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (2):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_2);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_2);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_2);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image13.setBackgroundResource(R.drawable.dice_2);
                                        image13.setVisibility(View.VISIBLE);
                                    }
                                    if(i==4) {
                                        image14.setBackgroundResource(R.drawable.dice_2);
                                        image14.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (3):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_3);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_3);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_3);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image13.setBackgroundResource(R.drawable.dice_3);
                                        image13.setVisibility(View.VISIBLE);
                                    }
                                    if(i==4) {
                                        image14.setBackgroundResource(R.drawable.dice_3);
                                        image14.setVisibility(View.VISIBLE);
                                    }
                                case (4):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_4);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_4);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_4);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image13.setBackgroundResource(R.drawable.dice_4);
                                        image13.setVisibility(View.VISIBLE);
                                    }
                                    if(i==4) {
                                        image14.setBackgroundResource(R.drawable.dice_4);
                                        image14.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (5):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_5);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_5);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_5);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image13.setBackgroundResource(R.drawable.dice_5);
                                        image13.setVisibility(View.VISIBLE);
                                    }
                                    if(i==4) {
                                        image14.setBackgroundResource(R.drawable.dice_5);
                                        image14.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (6):
                                    if(i==0) {
                                        image10.setBackgroundResource(R.drawable.dice_6);
                                        image10.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image11.setBackgroundResource(R.drawable.dice_6);
                                        image11.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image12.setBackgroundResource(R.drawable.dice_6);
                                        image12.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image13.setBackgroundResource(R.drawable.dice_6);
                                        image13.setVisibility(View.VISIBLE);
                                    }
                                    if(i==4) {
                                        image14.setBackgroundResource(R.drawable.dice_6);
                                        image14.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                default: break;
                            }
                        }

                        if(lavel == 1){
                            switch (ai[i]){
                                case (1):
                                    image20.setBackgroundResource(R.drawable.dice_1);
                                    image20.setVisibility(View.VISIBLE);
                                    break;
                                case (2):
                                    image20.setBackgroundResource(R.drawable.dice_2);
                                    image20.setVisibility(View.VISIBLE);
                                    break;
                                case (3):
                                    image20.setBackgroundResource(R.drawable.dice_3);
                                    image20.setVisibility(View.VISIBLE);
                                case (4):
                                    image20.setBackgroundResource(R.drawable.dice_4);
                                    image20.setVisibility(View.VISIBLE);
                                    break;
                                case (5):
                                    image20.setBackgroundResource(R.drawable.dice_5);
                                    image20.setVisibility(View.VISIBLE);
                                    break;
                                case (6):
                                    image20.setBackgroundResource(R.drawable.dice_6);
                                    image20.setVisibility(View.VISIBLE);
                                    break;
                                default: break;
                            }
                        }

                        if( lavel==2 ){
                            switch (ai[i]){
                                case (1):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_1);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_1);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (2):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_2);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_2);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (3):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_3);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_3);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                case (4):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_4);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_4);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (5):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_5);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_5);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (6):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_6);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_6);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                default: break;
                            }
                        }
                        if( lavel==3 ){
                            switch (ai[i]){
                                case (1):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_1);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_1);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_1);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (2):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_2);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_2);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_2);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (3):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_3);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_3);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_3);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                case (4):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_4);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_4);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_4);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (5):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_5);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_5);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_5);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (6):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_6);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_6);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_6);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                default: break;
                            }
                        }
                        if( lavel==4 ){
                            switch (ai[i]){
                                case (1):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_1);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_1);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_1);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image23.setBackgroundResource(R.drawable.dice_1);
                                        image23.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (2):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_2);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_2);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_2);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image23.setBackgroundResource(R.drawable.dice_2);
                                        image23.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (3):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_3);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_3);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_3);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image23.setBackgroundResource(R.drawable.dice_3);
                                        image23.setVisibility(View.VISIBLE);
                                    }
                                case (4):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_4);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_4);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_4);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image23.setBackgroundResource(R.drawable.dice_4);
                                        image23.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (5):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_5);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_5);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_5);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image23.setBackgroundResource(R.drawable.dice_5);
                                        image23.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (6):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_6);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_6);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_6);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image23.setBackgroundResource(R.drawable.dice_6);
                                        image23.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                default: break;
                            }
                        }
                        if( lavel==5 ){
                            switch (ai[i]){
                                case (1):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_1);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_1);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_1);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image23.setBackgroundResource(R.drawable.dice_1);
                                        image23.setVisibility(View.VISIBLE);
                                    }
                                    if(i==4) {
                                        image24.setBackgroundResource(R.drawable.dice_1);
                                        image24.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (2):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_2);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_2);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_2);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image23.setBackgroundResource(R.drawable.dice_2);
                                        image23.setVisibility(View.VISIBLE);
                                    }
                                    if(i==4) {
                                        image24.setBackgroundResource(R.drawable.dice_2);
                                        image24.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (3):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_3);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_3);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_3);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image23.setBackgroundResource(R.drawable.dice_3);
                                        image23.setVisibility(View.VISIBLE);
                                    }
                                    if(i==4) {
                                        image24.setBackgroundResource(R.drawable.dice_3);
                                        image24.setVisibility(View.VISIBLE);
                                    }
                                case (4):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_4);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_4);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_4);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image23.setBackgroundResource(R.drawable.dice_4);
                                        image23.setVisibility(View.VISIBLE);
                                    }
                                    if(i==4) {
                                        image24.setBackgroundResource(R.drawable.dice_4);
                                        image24.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (5):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_5);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_5);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_5);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image23.setBackgroundResource(R.drawable.dice_5);
                                        image23.setVisibility(View.VISIBLE);
                                    }
                                    if(i==4) {
                                        image24.setBackgroundResource(R.drawable.dice_5);
                                        image24.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                case (6):
                                    if(i==0) {
                                        image20.setBackgroundResource(R.drawable.dice_6);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    if(i==1) {
                                        image21.setBackgroundResource(R.drawable.dice_6);
                                        image21.setVisibility(View.VISIBLE);
                                    }
                                    if(i==2) {
                                        image22.setBackgroundResource(R.drawable.dice_6);
                                        image22.setVisibility(View.VISIBLE);
                                    }
                                    if(i==3) {
                                        image23.setBackgroundResource(R.drawable.dice_6);
                                        image23.setVisibility(View.VISIBLE);
                                    }
                                    if(i==4) {
                                        image24.setBackgroundResource(R.drawable.dice_6);
                                        image20.setVisibility(View.VISIBLE);
                                    }
                                    break;
                                default: break;
                            }
                        }
                        sum_user+=user[i];
                        sum_ai+=ai[i];
                    }

                    aiView.setText("AI: " + String.valueOf(sum_ai));
                    userView.setText("Вы: " + String.valueOf(sum_user));

                    if(sum_user>=sum_ai)
                    {
                        // You win
                        AlertDialog.Builder builder = new AlertDialog.Builder(Game.this);
                        builder.setTitle("Вы прошли уровень!").setMessage("Следующий?").setIcon(R.drawable.coin).setCancelable(false).setNegativeButton("Ок, го", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                //finish();
                                //onRestart();
                                //image10.setImageAlpha(0);
                            }
                        });

                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                        sum_ai=0;
                        sum_user=0;
                        switch (lavel){
                            case(1):
                                image1.setBackgroundResource(R.drawable.fruit_1);
                                break;
                            case(2):
                                image2.setBackgroundResource(R.drawable.fruit_2);
                                break;
                            case(3):
                                image3.setBackgroundResource(R.drawable.fruit_3);
                                break;
                            case(4):
                                image4.setBackgroundResource(R.drawable.fruit_4);
                                break;
                            case(5):
                                image5.setBackgroundResource(R.drawable.fruit_5);
                                AlertDialog.Builder builder3 = new AlertDialog.Builder(Game.this);
                                builder3.setTitle("Вы прошли все уровни!").setMessage("Начнем заново?").setIcon(R.drawable.coin).setView(R.layout.alert_image).setCancelable(false).setNegativeButton("Поехали!", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.cancel();
                                        recreate();
                                    }
                                });

                                AlertDialog alertDialog2 = builder3.create();
                                alertDialog2.show();
                                break;
                                default: break;
                        }
                        lavel++;
                    } else {

                        lavel = 1;

                        AlertDialog.Builder builder2 = new AlertDialog.Builder(Game.this);
                        builder2.setTitle("Вы проиграли").setMessage("Начнем заново?").setIcon(R.drawable.coin).setCancelable(false).setNegativeButton("Ок, го", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                                recreate();
                            }
                        });

                        AlertDialog alertDialog = builder2.create();
                        alertDialog.show();
                    }
                }
            });
    }


//    class calculeted extends AsyncTask<Void, Integer, Void>{
//
//        @Override
//        protected Void doInBackground(Void... voids) {
//
//            Random random = new Random();
//
//            int sum_user=0, sum_ai=0;
//
//            int[] user = new int[lavel];
//            int[] ai = new int[lavel];
//
//            for(int i=0; i<lavel; i++)
//            {
//                user[i] = random.nextInt();
//                ai[i] = random.nextInt();
//
//                sum_user+=user[i];
//                sum_ai+=ai[i];
//            }
//
//            //publishProgress(sum_ai, sum_user, lavel);
//
//            if(sum_user>=sum_ai)
//            {
//                // Вы победили
//                publishProgress(sum_ai, sum_user, lavel);
//            }
//
//            //lavelView.setText(lavel);
//
//            return null;
//        }
//
//        @Override
//        protected void onProgressUpdate(Integer... values) {
//            super.onProgressUpdate(values);
//
//            int data[] = new int[3];
//
//            for(int i=0; i<3; i++)
//            {
//                data[i] = values[i];
//            }
//            lavelView.setText(data[0]);
//            aiView.setText(data[1]);
//            userView.setText(data[2]);
//        }
//
//    }
}
