package league;

import sport.Sport;

import java.util.ArrayList;
import java.util.List;

public abstract class League<T extends Sport> {

    private String name;

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private List<T> teamsInLeague = new ArrayList<>();
}
