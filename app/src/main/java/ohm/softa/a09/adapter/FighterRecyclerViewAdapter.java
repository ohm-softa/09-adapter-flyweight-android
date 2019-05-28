package ohm.softa.a09.adapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ohm.softa.a09.R;
import ohm.softa.a09.model.Fighter;


public class FighterRecyclerViewAdapter extends RecyclerView.Adapter<FighterRecyclerViewAdapter.ViewHolder> {
    private ArrayList<Fighter> fighters = new ArrayList<>();

    public void add(Fighter f) {
        fighters.add(f);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView pilotNameView;
        private TextView fighterTypeView;
        private ImageView fighterImageView;

        public ViewHolder(View view) {
            super(view);

            pilotNameView = view.findViewById(R.id.pilotNameView);
            fighterTypeView = view.findViewById(R.id.fighterTypeView);
            fighterImageView = view.findViewById(R.id.fighterImageView);
        }

        void setPilot(String pilot){
            pilotNameView.setText(pilot);
        }

        void setFighterType(String fighterType){
            fighterTypeView.setText(fighterType);
        }

        void setFighterImage(Drawable fighterImage){
            fighterImageView.setImageDrawable(fighterImage);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Log.i(FighterRecyclerViewAdapter.class.getName(), "View created");
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        View view = inflater.inflate(R.layout.fighter_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FighterRecyclerViewAdapter.ViewHolder viewHolder, int i) {
        Fighter f = fighters.get(i);

        viewHolder.setPilot(f.getPilot());
        viewHolder.setFighterType(f.getFighterType());
        viewHolder.setFighterImage(f.getFighterImage());
    }

    @Override
    public int getItemCount() {
        return fighters.size();
    }
}
