/*
 * The MIT License
 *
 * Copyright 2017 OnCore Consulting LLC, All Rights Reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.oncore.calorders.core.exceptions;

import com.oncore.calorders.core.enums.AbstractEnum;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * DataAccessException provides a means for Calorders to create custom exceptions
 * for data access conditions.
 *
 * @author OnCore Consulting LLC
 */
@XmlRootElement
public class DataAccessException extends BaseException {

    public DataAccessException(String message) {
        super(message);
    }

    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataAccessException(String message, Throwable cause, AbstractEnum errorCode) {
        super(message, cause, errorCode);
    }

    public DataAccessException(Throwable cause) {
        super(cause);
    }

    public DataAccessException(Throwable cause, AbstractEnum errorCode) {
        super(cause, errorCode);
    }

    public DataAccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DataAccessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, AbstractEnum errorCode) {
        super(message, cause, enableSuppression, writableStackTrace, errorCode);
    }

}
