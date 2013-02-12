package android.ygo.action;

import android.ygo.op.Touch;

public class SelectAction extends BaseAction {

    public SelectAction(Touch touch) {
        super(touch.getDuel(), touch.getContainer(), touch.getItem());
    }

    @Override
    public void execute() {
        duel.select(item);
    }
}
