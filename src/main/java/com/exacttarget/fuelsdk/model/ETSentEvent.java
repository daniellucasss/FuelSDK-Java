//
// ETSentEvent.java -
//
//      x
//
// Copyright (C) 2013 ExactTarget
//
// @COPYRIGHT@
//

package com.exacttarget.fuelsdk.model;

import com.exacttarget.fuelsdk.ETObject;
import com.exacttarget.fuelsdk.annotations.InternalSoapType;
import com.exacttarget.fuelsdk.internal.SentEvent;

@InternalSoapType(type = SentEvent.class)
public class ETSentEvent extends BaseTrackingEvent implements ETObject {

	public ETSentEvent(){}
}
