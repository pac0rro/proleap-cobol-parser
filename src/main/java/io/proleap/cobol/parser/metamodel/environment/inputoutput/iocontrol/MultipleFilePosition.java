/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.parser.metamodel.environment.inputoutput.iocontrol;

import io.proleap.cobol.parser.metamodel.CobolDivisionElement;
import io.proleap.cobol.parser.metamodel.valuestmt.IntegerLiteralValueStmt;
import io.proleap.cobol.parser.metamodel.valuestmt.ValueStmt;

public interface MultipleFilePosition extends CobolDivisionElement {

	ValueStmt getFileNameValueStmt();

	IntegerLiteralValueStmt getIntegerLiteralValueStmt();

	void setFileNameValueStmt(ValueStmt fileNameValueStmt);

	void setIntegerLiteralValueStmt(IntegerLiteralValueStmt integerLiteralValueStmt);
}