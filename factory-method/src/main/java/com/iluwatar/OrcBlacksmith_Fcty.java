package com.iluwatar;

/**
 * 
 * Concrete subclass for creating new objects.
 * 
 */
public class OrcBlacksmith_Fcty implements Blacksmith {

	public Weapon_Fcty manufactureWeapon(WeaponType weaponType) {
		return new OrcWeapon_Fcty(weaponType);
	}

}
