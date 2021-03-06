/**
 *   (c) Copyright 2007-2010 by emarsys eMarketing Systems AG
 * 
 *   This file is part of dyson.
 *
 *   dyson is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as published by
 *   the Free Software Foundation; either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   dyson is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.emarsys.dyson;

/**
 * An abstract super implementation of a generic {@link DysonPart}.
 * 
 * @author <a href="mailto:kulovits@emarsys.com">Michael "kULO" Kulovits</a>
 */
public abstract class GenericDysonPart implements DysonPart 
{
	protected Dyson dyson;
	
	/**
	 * Constructor that takes the {@link Dyson} instance.
	 */
	public GenericDysonPart( Dyson dyson ) 
	{
		this.dyson = dyson;
	}

	/**
	 * @see com.emarsys.dyson.DysonPart#getDyson()
	 */
	public Dyson getDyson() 
	{
		return this.dyson;
	}
}//class Abstract
