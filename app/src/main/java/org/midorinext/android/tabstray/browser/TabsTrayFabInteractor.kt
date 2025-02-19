/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.midorinext.android.tabstray.browser

import org.midorinext.android.tabstray.Page

/**
 * Interactor for all things related to the floating action button in the tabs tray.
 */
interface TabsTrayFabInteractor {
    /**
     * Invoked when the fab is clicked in [Page.NormalTabs].
     */
    fun onNormalTabsFabClicked()

    /**
     * Invoked when the fab is clicked in [Page.PrivateTabs].
     */
    fun onPrivateTabsFabClicked()

    /**
     * Invoked when the fab is clicked in [Page.SyncedTabs].
     */
    fun onSyncedTabsFabClicked()
}
