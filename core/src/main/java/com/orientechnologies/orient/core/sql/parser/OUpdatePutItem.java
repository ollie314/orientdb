/* Generated By:JJTree: Do not edit this line. OUpdatePutItem.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.Map;

public class OUpdatePutItem extends SimpleNode {

  protected OIdentifier left;
  protected OExpression key;
  protected OExpression value;

  public OUpdatePutItem(int id) {
    super(id);
  }

  public OUpdatePutItem(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }


  public void toString(Map<Object, Object> params, StringBuilder builder) {
    left.toString(params, builder);
    builder.append(" = ");
    key.toString(params, builder);
    builder.append(", ");
    value.toString(params, builder);
  }
}
/* JavaCC - OriginalChecksum=a38339c33ebf0a8b21e76ddb278f4958 (do not edit this line) */
