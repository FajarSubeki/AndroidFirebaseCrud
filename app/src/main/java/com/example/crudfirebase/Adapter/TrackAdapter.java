package com.example.crudfirebase.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.crudfirebase.Model.Track;
import com.example.crudfirebase.R;

import java.util.List;

public class TrackAdapter extends ArrayAdapter<Track> {

    private Activity context;
    List<Track> tracks;

    public TrackAdapter(Activity context, List<Track> tracks) {
        super(context, R.layout.layout_artist_list, tracks);
        this.context = context;
        this.tracks = tracks;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.layout_artist_list, null, true);

        TextView textViewName =  listViewItem.findViewById(R.id.textViewName);
        TextView textViewRating = listViewItem.findViewById(R.id.textViewGenre);

        Track track = tracks.get(position);
        textViewName.setText(track.getTrackName());
        textViewRating.setText(String.valueOf(track.getRating()));

        return listViewItem;
    }
}
