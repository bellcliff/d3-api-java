package org.free.d3.model;

import com.google.api.client.util.Key;

/**
 * 
 * 
 * @author bell
 * 
 */
public class Artisan {
	// * {
	// "slug": "blacksmith",
	// "level": 9,
	// "stepMax": 5,
	// "stepMurrent": 1
	// },
	// {
	// "slug": "jeweler",
	// "level": 7,
	// "stepMax": 1,
	// "stepMurrent": 0
	// }
	@Key
	public String slug;
	@Key	
	public int level;
	@Key
	public int stepMax;
	@Key
	public int stepMurrent;
}
