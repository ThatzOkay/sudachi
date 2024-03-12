// SPDX-FileCopyrightText: 2023 sudachi Emulator Project
// SPDX-License-Identifier: GPL-2.0-or-later

package org.sudachi.sudachi_emu.features.settings.model

interface AbstractStringSetting : AbstractSetting {
    fun getString(needsGlobal: Boolean = false): String
    fun setString(value: String)
}