// :vim:set tw=78 expandtab tabstop=3:
// $Id$
//
// Configuration -- Wrapper around configuration data.
// Copyright (C) 2001,2002  Casey Marshall <rsdio@metastatic.org>
//
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the
//
//    Free Software Foundation, Inc.,
//    59 Temple Place, Suite 330,
//    Boston, MA  02111-1307
//    USA
//
// ---------------------------------------------------------------------------

package org.metastatic.rsync;

/**
 * A Configuration is a mere collection of objects and values that
 * compose a particular configuration for the algorithm, for example the
 * message digest that computes the strong checksum.
 *
 * @author Casey Marshall
 * @version $Revision$
 */
public class Configuration implements RsyncConstants {

   // Constants and variables.
   // ------------------------------------------------------------------------

   /**
    * The message digest that computes the stronger checksum.
    */
   MessageDigest strongSum;

   /**
    * The length of blocks to checksum.
    */
   int blockLength;   

   // Constructors.
   // ------------------------------------------------------------------------

   /**
    * Create a configuration using MD4 and a block length of 700.
    */
   public Configuration() {
      this(new MD4(), BLOCK_LENGTH);
   }

   /**
    * Create a configuration with a particular strong checksum and a
    * block length of 700.
    */
   public Configuration(MessageDigest strongSum) {
      this(strongSum, BLOCK_LENGTH);
   }

   public Configuration(MessageDigest strongSum, int blockLength) {
      this.strongSum = strongSum;
      this.blockLength = blockLength;
   }
}
