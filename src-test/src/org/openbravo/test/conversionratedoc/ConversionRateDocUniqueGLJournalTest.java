/*
 *************************************************************************
 * The contents of this file are subject to the Openbravo  Public  License
 * Version  1.0  (the  "License"),  being   the  Mozilla   Public  License
 * Version 1.1  with a permitted attribution clause; you may not  use this
 * file except in compliance with the License. You  may  obtain  a copy of
 * the License at http://www.openbravo.com/legal/license.html
 * Software distributed under the License  is  distributed  on  an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific  language  governing  rights  and  limitations
 * under the License.
 * The Original Code is Openbravo ERP.
 * The Initial Developer of the Original Code is Openbravo SLU
 * All portions are Copyright (C) 2021 Openbravo SLU
 * All Rights Reserved.
 * Contributor(s):  ______________________________________.
 *************************************************************************
 */

package org.openbravo.test.conversionratedoc;

import org.openbravo.model.common.currency.ConversionRateDoc;
import org.openbravo.model.financialmgmt.gl.GLJournal;

public class ConversionRateDocUniqueGLJournalTest extends ConversionRateDocUniqueTest {
  @Override
  public String getDocumentEntityName() {
    return GLJournal.ENTITY_NAME;
  }

  @Override
  public String getPropertyName() {
    return ConversionRateDoc.PROPERTY_JOURNALENTRY;
  }

  @Override
  public String getDocumentId() {
    return "04A7C47A17DD4512800239D71A19B7C1";
  }

}
