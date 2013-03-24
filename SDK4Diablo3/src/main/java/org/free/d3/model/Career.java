package org.free.d3.model;

import java.util.HashMap;
import java.util.List;

import com.google.api.client.util.Key;

public class Career {
	@Key
	public List<Hero> heroes;

	@Key
	public int lastHeroPlayed;
	
	@Key
	public int lastUpdated;
	// "lastHeroPlayed": 3,
	// "lastUpdated": 1344055324,
	
	@Key
	public List<Artisan> artisans;
	
	@Key
	public List<Artisan> hardcoreArtisans;
	
	

	// "kills": {
	// "monsters": 30509,
	// "elites": 1707,
	// "hardcoreMonsters": 3130
	// },
	// "timePlayed": {
	// "barbarian": 1,
	// "demon-hunter": 0.016,
	// "monk": 0.157,
	// "witch-doctor": 0.412,
	// "wizard": 0.414
	// },
	@Key
	public HashMap<String, Integer> kills;
	

//    "timePlayed": {
//        "barbarian": 1,
//        "demon-hunter": 0.016,
//        "monk": 0.157,
//        "witch-doctor": 0.412,
//        "wizard": 0.414
//    },
	@Key
	public HashMap<String, Float> timePlayed;
	
	//TODO 
	// "fallenHeroes": [
	// {
	// "stats": {
	// "life": 386,
	// "damage": 14.4294,
	// "armor": 122,
	// "strength": 17,
	// "dexterity": 41,
	// "vitality": 31,
	// "intelligence": 17,
	// "physicalResist": 0,
	// "fireResist": 0,
	// "coldResist": 0,
	// "lightningResist": 0,
	// "poisonResist": 0,
	// "arcaneResist": 0,
	// "damageIncrease": 0.41,
	// "critChance": 0.05,
	// "damageReduction": 0.196141
	// },
	// "kills": {
	// "elites": 70
	// },
	// "items": {
	// "head": {
	// "name": "Adventuring Leather Hood of the Bear",
	// "icon": "helm_002",
	// "displayColor": "blue",
	// "tooltipParams":
	// "item-data/CKnTmNIIEgcIBBX38E5dHRqWQGAd7O9hBzAJOPQDQABQCGCzBA",
	// "requiredLevel": 4
	// },
	// "torso": {
	// "name": "Adventuring Leather Doublet",
	// "icon": "chestarmor_002",
	// "displayColor": "blue",
	// "tooltipParams": "item-data/CPfoqxwSBwgEFakZGWAdGpZAYDAJOMkEQABQBmCRBQ",
	// "requiredLevel": 3
	// },
	// "feet": {
	// "name": "Nimble Boots of the Hawk",
	// "icon": "boots_002",
	// "displayColor": "blue",
	// "tooltipParams":
	// "item-data/CKaQ0tENEgcIBBUYPZt_HQfqUAgd2nfX3DAJOPoDQABQCGC6BA",
	// "requiredLevel": 4
	// },
	// "hands": {
	// "name": "Scouting Leather Gloves",
	// "icon": "gloves_002",
	// "displayColor": "blue",
	// "tooltipParams": "item-data/CJKcmN4JEgcIBBVBU5KkHaRgi4YwCTivA0AAUAZg5gM",
	// "requiredLevel": 3
	// },
	// "legs": {
	// "name": "Cracked Cloth Pants",
	// "icon": "pants_001",
	// "displayColor": "gray",
	// "tooltipParams": "item-data/CIDZ0foMEgcIBBUWitWlHT8G-w0wCTj5AkAAUABgqAM",
	// "requiredLevel": 1
	// },
	// "bracers": {
	// "name": "Thick Bracers",
	// "icon": "bracers_001",
	// "displayColor": "white",
	// "tooltipParams": "item-data/CJywidINEgcIBBVSJMrLHRv3WCowCTi7A0AAUARg9AM",
	// "requiredLevel": 1
	// },
	// "mainHand": {
	// "name": "Exceptional Javelin",
	// "icon": "spear_001",
	// "displayColor": "white",
	// "tooltipParams": "item-data/CIfO1dkJEgcIBBULF_b5HbGUDkkwCTi0A0AAUARg6QM",
	// "requiredLevel": 1
	// },
	// "offHand": {
	// "name": "Broad Axe of the Snake",
	// "icon": "axe_1h_002",
	// "displayColor": "blue",
	// "tooltipParams": "item-data/CJaPtP8BEgcIBBUnJAdjHc2I9w0wCTimBEAAUAZg6gQ",
	// "requiredLevel": 3
	// },
	// "waist": {
	// "name": "Gathering Hide Belt",
	// "icon": "belt_002",
	// "displayColor": "blue",
	// "tooltipParams": "item-data/CKDkgvgPEgcIBBU4n0LUHYsm_qswCTjcA0AAUAZgmAQ",
	// "requiredLevel": 4
	// }
	// },
	// "death": {
	// "killer": 5395,
	// "location": 60394,
	// "time": 1339020240
	// },
	// "name": "Cook",
	// "level": 10,
	// "hardcore": true,
	// "heroId": 4,
	// "gender": 0
	// }
	// ],
	
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
}
