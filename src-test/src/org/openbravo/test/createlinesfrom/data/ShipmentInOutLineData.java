/*
 *************************************************************************
 * The contents of this file are subject to the Openbravo  Public  License
 * Version  1.1  (the  "License"),  being   the  Mozilla   Public  License
 * Version 1.1  with a permitted attribution clause; you may not  use this
 * file except in compliance with the License. You  may  obtain  a copy of
 * the License at http://www.openbravo.com/legal/license.html 
 * Software distributed under the License  is  distributed  on  an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific  language  governing  rights  and  limitations
 * under the License. 
 * The Original Code is Openbravo ERP. 
 * The Initial Developer of the Original Code is Openbravo SLU 
 * All portions are Copyright (C) 2018 Openbravo SLU 
 * All Rights Reserved. 
 * Contributor(s):  ______________________________________.
 ************************************************************************
 */

package org.openbravo.test.createlinesfrom.data;

import java.math.BigDecimal;

/**
 * Line data to check Create Line From process
 * 
 * @author Andy Armaignac
 *
 */
public class ShipmentInOutLineData {

  private String productId;
  private BigDecimal movementQuantity;

  private ShipmentInOutLineData() {
  }

  public static class Builder {
    private ShipmentInOutLineData lineData = new ShipmentInOutLineData();

    public Builder productId(String productId) {
      lineData.productId = productId;
      return this;
    }

    public Builder movementQuantity(BigDecimal movementQuantity) {
      lineData.movementQuantity = movementQuantity;
      return this;
    }

    public ShipmentInOutLineData build() {
      return lineData;
    }
  }

  public String getProductId() {
    return productId;
  }

  public BigDecimal getMovementQuantity() {
    return movementQuantity;
  }
}
