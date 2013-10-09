package com.purplescout.sdk.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class TodoOverviewPart {

	Label label;

	@PostConstruct
	private void createControls(Composite parent) {
		parent.setLayout(new GridLayout(3, false));
		label = new Label(parent, SWT.None);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		
		Button btnNewButton = new Button(parent, SWT.NONE);
		btnNewButton.setText("New Button");
		
		final Label lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setText("Data not availible");
		GridData gd_lblNewLabel = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblNewLabel.widthHint = 235;
		lblNewLabel.setLayoutData(gd_lblNewLabel);

		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				lblNewLabel.setText("Number of Todos: 7");
			}
		});
		
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
