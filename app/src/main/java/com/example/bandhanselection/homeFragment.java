
package com.example.bandhanselection;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class homeFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        String []urls={
                "https://images.unsplash.com/photo-1553515901-a15a0ee05c8e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1350&q=80",
                "https://images.unsplash.com/flagged/photo-1574687825584-0e1b9f54bac3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60",
                "https://images.unsplash.com/flagged/photo-1551854716-8b811be39e7e?ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80",
                "https://images.unsplash.com/photo-1572470176170-98fa8abcb741?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60",
                "https://images.unsplash.com/photo-1591029808860-33222b2612e0?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60"
        };
        ImageView[] imageViews={
                (ImageView)root.findViewById(R.id.card1),(ImageView)root.findViewById(R.id.card2),(ImageView)root.findViewById(R.id.card3),(ImageView)root.findViewById(R.id.card4),(ImageView)root.findViewById(R.id.card5)
        };

        Glide.with(this).load(urls[0]).into(imageViews[0]);
        Glide.with(this).load(urls[1]).into(imageViews[1]);
        Glide.with(this).load(urls[2]).into(imageViews[2]);
        Glide.with(this).load(urls[3]).into(imageViews[3]);
        Glide.with(this).load(urls[4]).into(imageViews[4]);


        return root;
    }
}