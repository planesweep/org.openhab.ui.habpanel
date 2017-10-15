/**
 * Copyright (c) 2015-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.ui.habpanel.internal.gallery;

import java.util.stream.Stream;

/**
 * The base interface for a gallery provider, able to retrieve lists and details.
 *
 * @author Yannick Schaus - Initial contribution
 *
 */
public interface GalleryProvider<T extends GalleryItem, TList extends GalleryListItem> {
    /**
     * Gets a stream of {@link GalleryListItem} gallery list items
     *
     * @return the list of gallery items
     * @throws Exception
     */
    Stream<TList> getGalleryList() throws Exception;

    /**
     * Gets an individual {@link GalleryItem} detailed gallery item
     *
     * @param id the identifier of the item in the gallery
     * @return the detailed item
     * @throws Exception
     */
    T getGalleryItem(String id) throws Exception;
}