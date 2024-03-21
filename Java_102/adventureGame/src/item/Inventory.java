package item;

import location.ToolStore;
import player.Player;

public class Inventory {

    ToolStore toolStore;
    Player player;

    public Inventory(ToolStore toolStore, Player player)
    {
        this.toolStore = toolStore;
        this. player = player;
    }

    public void setToolStore(ToolStore toolStore) {
        this.toolStore = toolStore;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ToolStore getToolStore() {
        return toolStore;
    }

    public Player getPlayer() {
        return player;
    }




}


