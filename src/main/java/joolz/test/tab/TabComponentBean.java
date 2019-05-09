package joolz.test.tab;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.liferay.faces.util.context.FacesContextHelperUtil;

@ManagedBean
@ViewScoped
public class TabComponentBean {
	String messageOneId = "button 1 clicked from a component, message is in a form";
	String messageTwoId = "button 2 clicked from a component, message outside the form";

	public void doShowMessageOne() {
		FacesContextHelperUtil.addGlobalInfoMessage(messageOneId);
	}

	public void doShowMessageTwo() {
		FacesContextHelperUtil.addGlobalInfoMessage(messageTwoId);
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
}
