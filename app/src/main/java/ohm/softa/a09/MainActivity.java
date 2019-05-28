package ohm.softa.a09;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import ohm.softa.a09.adapter.FighterRecyclerViewAdapter;
import ohm.softa.a09.model.FighterFactory;
import ohm.softa.a09.adapter.FighterListAdapter;

public class MainActivity extends AppCompatActivity {

    private static final int FIGHTER_COUNT = 400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FighterFactory fighterFactory = new FighterFactory(this);
//        FighterListAdapter fighterListAdapter = new FighterListAdapter(this);
        FighterRecyclerViewAdapter fighterListAdapter = new FighterRecyclerViewAdapter();

//        final ListView fighterListView = findViewById(R.id.fighter_list_view);
        final RecyclerView fighterListView = findViewById(R.id.fighterListView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        fighterListView.setLayoutManager(layoutManager);
        fighterListView.setAdapter(fighterListAdapter);

        for (int i = 0; i < FIGHTER_COUNT; i++) {
            fighterListAdapter.add(fighterFactory.createFighter());
        }
    }
}
