package com.iluwatar;

/**
 * 
 * In Factory Method we have an interface (Blacksmith) with a method for
 * creating objects (manufactureWeapon). The concrete subclasses (OrcBlacksmith,
 * ElfBlacksmith) then override the method to produce objects of their liking.
 * 
 */
public class App_Fcty {

	public static void main(String[] args) {
		Blacksmith blacksmith;
		Weapon_Fcty weapon;

		blacksmith = new OrcBlacksmith_Fcty();
		weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
		System.out.println(weapon);
		weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
		System.out.println(weapon);

		blacksmith = new ElfBlacksmith_Fcty();
		weapon = blacksmith.manufactureWeapon(WeaponType.SHORT_SWORD);
		System.out.println(weapon);
		weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
		System.out.println(weapon);
	}
}
