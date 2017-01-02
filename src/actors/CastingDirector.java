package actors;

import java.util.*;

/**
 * Created by Liandri on 8/11/2016.
 */
public class CastingDirector {
    private List<Actor> CURRENT_CAST = new ArrayList<>();
    private List<Actor> COLLIDE_CHECKLIST = new ArrayList<>();
    private Set<Actor> REMOVED_ACTORS = new HashSet<>();

    public CastingDirector(){
        this.CURRENT_CAST = new ArrayList<>();
        this.COLLIDE_CHECKLIST = new ArrayList<>();
        this.REMOVED_ACTORS = new HashSet<>();
    }

    public List<Actor> getCurrentCast() {
        return CURRENT_CAST;
    }
    public void addCurrentCast(Actor... actors) {
        CURRENT_CAST.addAll(Arrays.asList(actors));
    }
    public void removeCurrentCast(Actor... actors) {
        CURRENT_CAST.removeAll(Arrays.asList(actors));
    }
    public void resetCurrentCast() {
        CURRENT_CAST.clear();
    }
    public List getCollideCheckList() {
        return COLLIDE_CHECKLIST;
    }
    public void resetCollideCheckList() {
        COLLIDE_CHECKLIST.clear();
        COLLIDE_CHECKLIST.addAll(CURRENT_CAST);
    }
    public Set getRemovedActors() {
        return REMOVED_ACTORS;
    }
    public void addToRemovedActors(Actor... actors) {
        if (actors.length > 1) {
            REMOVED_ACTORS.addAll(Arrays.asList((Actor[]) actors));
        } else {
            REMOVED_ACTORS.add(actors[0]);
        }
    }
    public void resetRemovedActors() {
        CURRENT_CAST.removeAll(REMOVED_ACTORS);
        REMOVED_ACTORS.clear();
    }
}