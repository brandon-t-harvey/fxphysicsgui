/**
 * MIT License
 *
 * Copyright (c) 2020, 2022 Mark Schmieder
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
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * This file is part of the FxPhysicsToolkit Library
 *
 * You should have received a copy of the MIT License along with the
 * FxPhysicsToolkit Library. If not, see <https://opensource.org/licenses/MIT>.
 *
 * Project: https://github.com/mhschmieder/fxphysicstoolkit
 */
package com.mhschmieder.fxphysicstoolkit.control;

import com.mhschmieder.commonstoolkit.util.ClientProperties;
import com.mhschmieder.fxguitoolkit.control.TextSelector;
import com.mhschmieder.physicstoolkit.PressureUnit;

/**
 * The Pressure Units selector supports all Pressure Units that are currently
 * implemented in our core Physics Library.
 */
public final class PressureUnitSelector extends TextSelector {

    private static final String[] PRESSURE_UNITS = new String[] {
                                                                  PressureUnit.KILOPASCALS
                                                                          .toCanonicalString(),
                                                                  PressureUnit.PASCALS
                                                                          .toCanonicalString(),
                                                                  PressureUnit.MILLIBARS
                                                                          .toCanonicalString() };

    public PressureUnitSelector( final ClientProperties clientProperties,
                                 final boolean applyToolkitCss,
                                 final PressureUnit pressureUnitDefault ) {
        // Always call the superclass constructor first!
        super( clientProperties,
               "Supported Pressure Units", //$NON-NLS-1$
               applyToolkitCss,
               false,
               false,
               PRESSURE_UNITS,
               pressureUnitDefault.toCanonicalString() );
    }

    public PressureUnit getPressureUnit() {
        return PressureUnit.fromCanonicalString( getTextValue() );
    }

    public void setPressureUnit( final PressureUnit pressureUnit ) {
        setTextValue( pressureUnit.toCanonicalString() );
    }

}
