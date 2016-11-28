package rtc.nuttamon.kantana.monopolygame;

import android.content.Context;
import android.os.AsyncTask;
import android.speech.tts.Voice;

/**
 * Created by ILLUTION on 28/11/2559.
 */

public class synQuestion extends AsyncTask<Voice, Voice, String>{

    //Explicit
    private static final String urLJSON ="http://swiftcodingthai.com/nut/get_question.php";
    private Context context;

    public synQuestion(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(Voice... params) {



        return null;
    }
} // Main Class
