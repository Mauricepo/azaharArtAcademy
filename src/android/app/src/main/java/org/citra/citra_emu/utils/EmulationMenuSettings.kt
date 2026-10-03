// Copyright 2023-2026 Citra Emulator Project / Azahar Emulator Project
// Licensed under GPLv2 or any later version
// Refer to the license.txt file included.

package org.citra.citra_emu.utils

import androidx.drawerlayout.widget.DrawerLayout
import androidx.preference.PreferenceManager
import org.citra.citra_emu.CitraApplication
import org.citra.citra_emu.overlay.ButtonSlidingMode

object EmulationMenuSettings {
    private val preferences =
        PreferenceManager.getDefaultSharedPreferences(CitraApplication.appContext)

    var joystickRelCenter: Boolean
        get() = preferences.getBoolean("EmulationMenuSettings_JoystickRelCenter", true)
        set(value) {
            preferences.edit()
                .putBoolean("EmulationMenuSettings_JoystickRelCenter", value)
                .apply()
        }
    var dpadSlide: Boolean
        get() = preferences.getBoolean("EmulationMenuSettings_DpadSlideEnable", true)
        set(value) {
            preferences.edit()
                .putBoolean("EmulationMenuSettings_DpadSlideEnable", value)
                .apply()
        }
    var buttonSlide: Int
        get() = preferences.getInt(
            "EmulationMenuSettings_ButtonSlideMode",
            ButtonSlidingMode.Disabled.int
        )
        set(value) {
            preferences.edit()
                .putInt("EmulationMenuSettings_ButtonSlideMode", value)
                .apply()
        }

    var hapticFeedback: Boolean
        get() = preferences.getBoolean("EmulationMenuSettings_HapticFeedback", true)
        set(value) {
            preferences.edit()
                .putBoolean("EmulationMenuSettings_HapticFeedback", value)
                .apply()
        }
    var swapScreens: Boolean
        get() = preferences.getBoolean("EmulationMenuSettings_SwapScreens", false)
        set(value) {
            preferences.edit()
                .putBoolean("EmulationMenuSettings_SwapScreens", value)
                .apply()
        }
    var showOverlay: Boolean
        get() = preferences.getBoolean("EmulationMenuSettings_ShowOverlay", true)
        set(value) {
            preferences.edit()
                .putBoolean("EmulationMenuSettings_ShowOverlay", value)
                .apply()
        }
    var stylusHoverCursor: Boolean
        get() = preferences.getBoolean("EmulationMenuSettings_StylusHoverCursor", true)
        set(value) {
            preferences.edit()
                .putBoolean("EmulationMenuSettings_StylusHoverCursor", value)
                .apply()
        }
    var stylusLockOverlay: Boolean
        get() = preferences.getBoolean("EmulationMenuSettings_StylusLockOverlay", false)
        set(value) {
            preferences.edit()
                .putBoolean("EmulationMenuSettings_StylusLockOverlay", value)
                .apply()
        }

    // 0 = off, 1 = light, 2 = medium, 3 = strong
    var stylusStabilizer: Int
        get() = preferences.getInt("EmulationMenuSettings_StylusStabilizer", 0)
        set(value) {
            preferences.edit()
                .putInt("EmulationMenuSettings_StylusStabilizer", value)
                .apply()
        }

    // NativeLibrary.ButtonType id, -1 = none
    var stylusButtonMapping: Int
        get() = preferences.getInt("EmulationMenuSettings_StylusButtonMapping", -1)
        set(value) {
            preferences.edit()
                .putInt("EmulationMenuSettings_StylusButtonMapping", value)
                .apply()
        }
    var drawerLockMode: Int
        get() = preferences.getInt(
            "EmulationMenuSettings_DrawerLockMode",
            DrawerLayout.LOCK_MODE_LOCKED_CLOSED
        )
        set(value) {
            preferences.edit()
                .putInt("EmulationMenuSettings_DrawerLockMode", value)
                .apply()
        }
}
