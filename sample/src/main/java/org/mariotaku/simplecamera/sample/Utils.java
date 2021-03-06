/*
 * 				Twidere - Twitter client for Android
 * 
 *  Copyright (C) 2012-2014 Mariotaku Lee <mariotaku.lee@gmail.com>
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.simplecamera.sample;

import java.util.Comparator;

public class Utils {
    static final Comparator<int[]> FPS_RANGE_COMPARATOR = new Comparator<int[]>() {
        @Override
        public int compare(int[] lhs, int[] rhs) {
            return rhs[0] - lhs[0];
        }
    };

    public static float clamp(final float num, final float max, final float min) {
		return Math.max(Math.min(num, max), min);
	}

	public static int clamp(final int num, final int max, final int min) {
		return Math.max(Math.min(num, max), min);
	}

}
