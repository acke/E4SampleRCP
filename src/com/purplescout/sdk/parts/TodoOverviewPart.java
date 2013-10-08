package com.purplescout.sdk.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class TodoOverviewPart {

	Label label;

	@PostConstruct
	private void createControls(Composite parent) {
		label = new Label(parent, SWT.None);
	}

	@PreDestroy
	private void dispose() {
		// TODO Auto-generated method stub

	}
	
	@Focus
	private void setFocus() {
		label.setFocus();
	}
}
