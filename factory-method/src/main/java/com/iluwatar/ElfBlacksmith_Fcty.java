package com.iluwatar;

/**
 * 
 * Concrete subclass for creating new objects.
 * 
 */
public class ElfBlacksmith_Fcty implements Blacksmith {

	public Weapon_Fcty manufactureWeapon(WeaponType weaponType) {
		return new ElfWeapon_Fcty(weaponType);
	}

}
