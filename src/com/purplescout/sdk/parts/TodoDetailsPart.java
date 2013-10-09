package com.purplescout.sdk.parts;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Button;

public class TodoDetailsPart {

	Label label;
	private Text text;
	private Text text_1;
	private Combo combo;

	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(3, false));
		label = new Label(parent, SWT.None);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		
		Label lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setText("Priority");
		
		combo = new Combo(parent, SWT.NONE);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(parent, SWT.NONE);
		
		Label lblNewLabel_1 = new Label(parent, SWT.NONE);
		lblNewLabel_1.setText("Summary");
		lblNewLabel_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		text = new Text(parent, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(parent, SWT.NONE);
		
		Label lblNewLabel_2 = new Label(parent, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_2.setText("Description");
		
		text_1 = new Text(parent, SWT.BORDER);
		GridData gd_text_1 = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_text_1.heightHint = 88;
		text_1.setLayoutData(gd_text_1);
		new Label(parent, SWT.NONE);
		
		Label lblNewLabel_3 = new Label(parent, SWT.NONE);
		lblNewLabel_3.setText("Due date");
		
		DateTime dateTime = new DateTime(parent, SWT.BORDER);
		new Label(parent, SWT.NONE);
		new Label(parent, SWT.NONE);
		
		Button btnCheckButton = new Button(parent, SWT.CHECK);
		btnCheckButton.setText("Done");
		System.out.println("PostConstruct");
	}

	@PreDestroy
	private void dispose() {
		// TODO Auto-generated method stub

	}

	@Focus
	private void setFocus() {
		combo.setFocus();
	}
}