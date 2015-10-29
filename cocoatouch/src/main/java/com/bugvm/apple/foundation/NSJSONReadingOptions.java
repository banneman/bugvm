/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.foundation;

/*<imports>*/
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 5.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSJSONReadingOptions/*</name>*/ extends Bits</*<name>*/NSJSONReadingOptions/*</name>*/> {
    /*<values>*/
    public static final NSJSONReadingOptions None = new NSJSONReadingOptions(0L);
    public static final NSJSONReadingOptions MutableContainers = new NSJSONReadingOptions(1L);
    public static final NSJSONReadingOptions MutableLeaves = new NSJSONReadingOptions(2L);
    public static final NSJSONReadingOptions AllowFragments = new NSJSONReadingOptions(4L);
    /*</values>*/

    private static final /*<name>*/NSJSONReadingOptions/*</name>*/[] values = _values(/*<name>*/NSJSONReadingOptions/*</name>*/.class);

    public /*<name>*/NSJSONReadingOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/NSJSONReadingOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSJSONReadingOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSJSONReadingOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/NSJSONReadingOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSJSONReadingOptions/*</name>*/[] values() {
        return values.clone();
    }
}