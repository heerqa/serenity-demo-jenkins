package mackTrucks.pages;

public class TestDataSetup {

    public static String getProductDescription() {
        return productDescription;
    }

    public static void setProductDescription(String productDescription) {
        TestDataSetup.productDescription = productDescription;
    }

    private static String productDescription;

    public static String getOrdernumber() {
        return ordernumber;
    }

    public static void setOrdernumber(String ordernumber) {
        TestDataSetup.ordernumber = ordernumber;
    }

    private static String ordernumber;
}
