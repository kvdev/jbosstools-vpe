/*******************************************************************************
 * Copyright (c) 2007 Exadel, Inc. and Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Exadel, Inc. and Red Hat, Inc. - initial API and implementation
 ******************************************************************************/ 
package org.jboss.tools.vpe.editor.toolbar;

import org.eclipse.swt.widgets.Composite;

/**
 * @author Erick
 */
public interface IVpeToolBar {

	/**
	 * Return the name of the ToolBar
	 */
	public String getName();
	
	/**
	 * Return the id of the ToolBar
	 */
	public String getId();

	/**
	 * create toolbar control use given composite as parent for it
	 */
	public void createToolBarControl(Composite parent);

	/**
	 * Return the toolbar composite 
	 */
	public Composite getComposite();
}