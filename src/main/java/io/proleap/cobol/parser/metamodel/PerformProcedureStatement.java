/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.parser.metamodel;

import java.util.List;

import io.proleap.cobol.parser.metamodel.call.Call;

public interface PerformProcedureStatement extends CobolScopedElement {

	void addCall(Call call);

	void addCalls(List<Call> calls);

	List<Call> getCalls();
}
