package com.iluwatar;

public class OrcWeapon_Fcty implements Weapon_Fcty {

	private WeaponType weaponType;

	public OrcWeapon_Fcty(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Orcish " + weaponType;
	}

}
