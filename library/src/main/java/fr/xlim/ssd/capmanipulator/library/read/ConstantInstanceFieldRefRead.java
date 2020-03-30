/**
 * ConstantInstanceFieldRefRead.java
 * <p>
 * Copyright (C) 2009 Guillaume Bouffard <guillaume.bouffard02@etu.unilim.fr>
 * Copyright (C) 2009 Julien Boutet <julien.boutet@etu.unilim.fr>
 * Copyright (C) 2012 Julien Iguchi-Cartigny <julien.cartigny@xlim.fr>
 * <p>
 * Xlim - Université de Limoges
 * <p>
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */

package fr.xlim.ssd.capmanipulator.library.read;

import fr.xlim.ssd.capmanipulator.library.ConstantInstanceFieldRef;
import fr.xlim.ssd.capmanipulator.library.exceptions.UnableToReadCapFileException;

public class ConstantInstanceFieldRefRead implements ConstantPoolInfoRead {


    /**
     * read the values of the ConstantInstanceFieldRef from a cap file and set
     * this values
     *
     * @param in Cap File Stream
     * @throws java.io.IOException
     */
    public ConstantInstanceFieldRef load(CapInputStream in) throws UnableToReadCapFileException {

        ConstantInstanceFieldRef constantInstanceFieldRef = new ConstantInstanceFieldRef();

        constantInstanceFieldRef.setAssociatedClass(new ClassRefRead().load(in));
        constantInstanceFieldRef.setToken(in.readByte());

        return constantInstanceFieldRef;
    }
}
