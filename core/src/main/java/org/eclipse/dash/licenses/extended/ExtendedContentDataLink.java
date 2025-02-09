/*************************************************************************
 * Copyright (c) 2021 The Eclipse Foundation and others.
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution, and is available at https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *************************************************************************/
package org.eclipse.dash.licenses.extended;

public class ExtendedContentDataLink extends ExtendedContentDataItem {

	public ExtendedContentDataLink(String label, String value) {
		super(label, value);
	}

	@Override
	public String asMarkdown() {
		return String.format("[%s](%s)", getLabel(), getValue());
	}
}
