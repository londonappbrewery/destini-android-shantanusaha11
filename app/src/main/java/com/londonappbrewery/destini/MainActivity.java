package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
        Button ans1;
        Button ans2;
        TextView storyTextView;
        int mStoryIndex = 1;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            ans1 = (Button) findViewById(R.id.buttonTop);
            ans2 = (Button) findViewById(R.id.buttonBottom);
            storyTextView = (TextView) findViewById(R.id.storyTextView);

            storyTextView.setText(R.string.T1_Story);
            ans1.setText(R.string.T1_Ans1);
            ans2.setText(R.string.T1_Ans2);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            ans1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mStoryIndex == 1 || mStoryIndex == 2) {
                        storyTextView.setText(R.string.T3_Story);
                        ans1.setText(R.string.T3_Ans1);
                        ans2.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                    }
                    else if(mStoryIndex == 3){
                        storyTextView.setText(R.string.T6_End);
                        ans1.setVisibility(View.GONE);
                        ans2.setVisibility(View.GONE);
                        mStoryIndex = 3;
                    }
                }
            });

            ans2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ( mStoryIndex == 1){
                        storyTextView.setText(R.string.T2_Story);
                        ans1.setText(R.string.T2_Ans1);
                        ans2.setText(R.string.T2_Ans2);
                        mStoryIndex = 2;
                    }
                    else if (mStoryIndex == 2){
                        storyTextView.setText(R.string.T4_End);
                        ans1.setVisibility(View.GONE);
                        ans2.setVisibility(View.GONE);
                    }
                    else {
                        storyTextView.setText(R.string.T5_End);
                        ans1.setVisibility(View.GONE);
                        ans2.setVisibility(View.GONE);
                    }

                }
            });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
