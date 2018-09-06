public class TVTest {
    public static void main(String[] args) {
        TV samsungTV = new Samsung(
            "'Samsung 55' Class QLED with HDR Smart 4K UHD TV (QN55Q6FNA) (NSA approved)", 800.0, 48, 400, 720
        );
        System.out.println(samsungTV.model);
        TV sharpTV = new Sharp("Good TV", 100.0, 48, 400, 1300);
        System.out.println(sharpTV.model);
        TV LGTV = new LG("Bad TV", 800.0, 48, 500, 1200);
        System.out.println(LGTV.model);
    }
}