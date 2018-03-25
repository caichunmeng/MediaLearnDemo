package com.ccm.medialearndemo;

/**
 * 学习视频处理，包括本地视频播放和远程的视频源播放，一步一步的完善
 * 自己的代码库和知识点
 * 一带一路，通过慕课网视频找寻知识点继续深入
 *
 * 实现主要类：VideoView 和MediaController
 */

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView mVideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoView = findViewById(R.id.videoView);
        String path = Environment.getExternalStorageDirectory()+"/monkey.mp4";

        /**
         * 本地视频播放
         */
        mVideoView.setVideoPath(path);
        /**
         * 网络播放
         */
        mVideoView.setVideoURI(Uri.parse(""));
        /**
         * 使用Controller进行视频的控制
         */
        MediaController controller =new MediaController(this);
        //设置相互之间的关联
        mVideoView.setMediaController(controller);
        controller.setMediaPlayer(mVideoView);


    }
}
