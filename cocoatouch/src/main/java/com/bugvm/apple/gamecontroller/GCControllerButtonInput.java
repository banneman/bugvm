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
package com.bugvm.apple.gamecontroller;

/*<imports>*/

import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Block;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.block.VoidBlock3;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("GameController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCControllerButtonInput/*</name>*/ 
    extends /*<extends>*/GCControllerElement/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCControllerButtonInputPtr extends Ptr<GCControllerButtonInput, GCControllerButtonInputPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCControllerButtonInput.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCControllerButtonInput() {}
    protected GCControllerButtonInput(NSObject.SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "valueChangedHandler")
    public native @Block
    VoidBlock3<GCControllerButtonInput, Float, Boolean> getValueChangedHandler();
    @Property(selector = "setValueChangedHandler:")
    public native void setValueChangedHandler(@Block VoidBlock3<GCControllerButtonInput, Float, Boolean> v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "pressedChangedHandler")
    public native @Block VoidBlock3<GCControllerButtonInput, Float, Boolean> getPressedChangedHandler();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setPressedChangedHandler:")
    public native void setPressedChangedHandler(@Block VoidBlock3<GCControllerButtonInput, Float, Boolean> v);
    @Property(selector = "value")
    public native float getValue();
    @Property(selector = "isPressed")
    public native boolean isPressed();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}