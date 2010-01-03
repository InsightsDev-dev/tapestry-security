/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.googlecode.tapestry5jsecurity.pages;

import org.apache.tapestry5.services.ExceptionReporter;
import org.apache.shiro.subject.Subject;

/**
 * This page rendered if was thrown {@link JSecurityException} and {@link Subject}
 * is not authenticated.
 * 
 * @author xibyte
 */
public class Unauthorized implements ExceptionReporter {

	private Throwable exception;

	public String getMessage() {
		if (exception != null) {
			return exception.getMessage();
		} else {
			return "";
		}
	}
	
	@Override
	public void reportException(Throwable exception) {
		this.exception = exception;
	}

	public Throwable getException() {
		return exception;
	}
	
}