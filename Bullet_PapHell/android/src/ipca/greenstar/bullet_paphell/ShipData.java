package ipca.greenstar.bullet_paphell;

/**
 * Created by diogo on 28/11/2017.
 */

public class ShipData {

    int shipHealthPoint;
    int shitDamage;
    float shipRateOfFire;
    float shipMoveSpeed;

    int shipCoins;

    public int getShipHealthPoint() {
        return shipHealthPoint;
    }

    public void setShipHealthPoint(int shipHealthPoint) {
        this.shipHealthPoint = shipHealthPoint;
    }

    public int getShitDamage() {
        return shitDamage;
    }

    public void setShitDamage(int shitDamage) {
        this.shitDamage = shitDamage;
    }

    public float getShipRateOfFire() {
        return shipRateOfFire;
    }

    public void setShipRateOfFire(float shipRateOfFire) {
        this.shipRateOfFire = shipRateOfFire;
    }

    public float getShipMoveSpeed() {
        return shipMoveSpeed;
    }

    public void setShipMoveSpeed(float shipMoveSpeed) {
        this.shipMoveSpeed = shipMoveSpeed;
    }

    public int getShipCoins() {
        return shipCoins;
    }

    public void setShipCoins(int shipCoins) {
        this.shipCoins = shipCoins;
    }

    public ShipData(int shipHealthPoint, int shitDamage, float shipRateOfFire, float shipMoveSpeed, int shipCoins) {
        this.shipHealthPoint = shipHealthPoint;
        this.shitDamage = shitDamage;
        this.shipRateOfFire = shipRateOfFire;
        this.shipMoveSpeed = shipMoveSpeed;
        this.shipCoins = shipCoins;
    }

}
