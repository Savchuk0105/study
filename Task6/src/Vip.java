public class Vip extends mainCastomer {
    private String vipLevel;

    public Vip(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    public void applyVipPrivilege() {
        System.out.println("VIP льготы применены для уровня: " + vipLevel);
    }
}