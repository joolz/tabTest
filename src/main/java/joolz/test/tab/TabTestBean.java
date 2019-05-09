package joolz.test.tab;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.liferay.faces.util.context.FacesContextHelperUtil;

@ManagedBean
@ViewScoped
public class TabTestBean {
	Random random = new Random();
	String messageOneId = "button 1 clicked, message is in a form";
	String messageTwoId = "button 2 clicked, message outside the form";
	String globalMessageId = "global message, outside the form";

	@PostConstruct
	private void init() {
		System.out.println("--------------------------------");
	}

	public void doShowMessageOne() {
		FacesContextHelperUtil.addGlobalInfoMessage(messageOneId);
	}

	public void doShowMessageTwo() {
		FacesContextHelperUtil.addGlobalInfoMessage(messageTwoId);
	}

	public void doShowUntargetedMessage() {
		FacesContextHelperUtil.addGlobalInfoMessage(globalMessageId);
	}

	public void doClearMessageOne() {
		FacesContextHelperUtil.removeMessages(messageOneId);
	}

	public void doClearMessageTwo() {
		FacesContextHelperUtil.removeMessages(messageTwoId);
	}

	public void doResetView() {
		FacesContextHelperUtil.resetView();
	}

	public void doResetViewWithRenderResponse() {
		FacesContextHelperUtil.resetView(true);
	}

	public boolean isVisible() {
		// when random and true, message display is also random (sometimes
		// working on both tabs, sometimes none, sometimes one). When constant
		// true, messages are always displayed

		// boolean result = random.nextBoolean();
		// System.out.println("Visible is " + result);
		// return result;

		return true;
	}
}
