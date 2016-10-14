package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        final String newTweetText = getIntent().getCharSequenceExtra("MESSAGE").toString();
        TextView newTweetEditText = (TextView) findViewById(R.id.textView);
        newTweetEditText.setText(newTweetText);
    }
}
