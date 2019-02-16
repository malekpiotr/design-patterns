package pl.sda.creational.factory;

public class WeaponFactory {
    public Weapon createWeapon(Profession profession) {
        switch (profession) {
            case ARCHER:
                return new Bow(20);
            case WIZARD:
                return new Wand(30);
            case SWORDSMAN:
                return new Sword(40);
            default:
                throw new IllegalArgumentException("Profession not found");
        }
    }
}
