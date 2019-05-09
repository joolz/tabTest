package joolz.test.tab;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class LifeCycleListener implements PhaseListener {
	private static final long serialVersionUID = 42L;

	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

	public void beforePhase(PhaseEvent event) {
		System.out.println("start phase " + event.getPhaseId());
	}

	public void afterPhase(PhaseEvent event) {
		System.out.println("  end phase " + event.getPhaseId());
	}
}
