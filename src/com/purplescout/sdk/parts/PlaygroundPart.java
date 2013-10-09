package com.purplescout.sdk.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class PlaygroundPart {

	Label label;
	private Text text;
	protected Label lblNewLabel;

	@PostConstruct
	public void createControls(Composite parent) {
		parent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
			}
		});
		parent.setLayout(new GridLayout(3, false));
		label = new Label(parent, SWT.None);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		
		Button btnNewButton = new Button(parent, SWT.NONE);
		btnNewButton.setText("New Button");
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		
		Button btnNewButton_1 = new Button(parent, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateSomething(null);
			}

		});
		btnNewButton_1.setText("New Button");
		new Label(parent, SWT.NONE);
		
		lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("New Label");
		
		text = new Text(parent, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	}

	@PreDestroy
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Focus
	private void setFocus() {
		label.setFocus();
	}

	@Inject
	private void updateSomething(UISynchronize uisync) {
		uisync.asyncExec(new Runnable() {
			
			@Override
			public void run() {
				String runnableStatus = "runnable is running";
				System.out.println(runnableStatus);
				text.setText(runnableStatus);
			}
		});
	}
}