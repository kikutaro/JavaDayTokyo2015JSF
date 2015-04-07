package my.app.javadaytokyo.phase;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 * PhaseLisetnerのフェーズを拾う.
 * 
 * 確認するときはfaces-config.xmlのコメントアウトを解除すること
 * 
 * @author kikuta
 */
public class MyPhaseListener implements PhaseListener{

    @Override
    public void afterPhase(PhaseEvent event) {
        System.out.println(event.getPhaseId() + "の後");
    }

    @Override
    public void beforePhase(PhaseEvent event) {
        System.out.println(event.getPhaseId() + "の前");
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
