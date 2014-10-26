package com.iluwatar;

public class ElfWeapon_Fcty implements Weapon_Fcty {

	private WeaponType weaponType;

	public ElfWeapon_Fcty(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Elven " + weaponType;
	}

}
