package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer sound;
    private VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video = (VideoView) findViewById(R.id.videoView);
        sound = MediaPlayer.create(this,R.raw.baby_laughing);
        sound.start();
        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabbid));
        video.start();
    }
}
