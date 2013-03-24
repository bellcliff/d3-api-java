package org.free.d3.model;

import com.google.api.client.util.Key;

public class Hero {
	// {
	// "name": "Yharr",
	// "id": 1,
	// "level": 60,
	// "hardcore": false,
	// "gender": 0,
	// "lastUpdated": 1341343147,
	// "dead": false
	// },
	@Key
	public String name;
	@Key
	public int id;
	@Key
	public int level;
	@Key
	public boolean hardcore;
	@Key
	public int gender;
	@Key
	public long lastUpdated;
	@Key
	public boolean dead;
}
