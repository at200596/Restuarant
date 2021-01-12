
package restaurant;


public class order {
    private String starter;
    private String main;
    private String dessert;
    private String side;
    private double total;
    private int orderNo;

    public order(int orderNo, String starter, String main, String side, String dessert, double total) {
        this.orderNo = orderNo;
        this.starter = starter;
        this.main = main;
        this.dessert = dessert;
        this.total = total;
        this.side = side;
    }

    @Override
    public String toString() {
        return "Order Number #" + orderNo + " : " + starter + "," + main + "," + side + "," + dessert + "," + total;
    }
    public int getOrderNo(){
        return orderNo;
    }
    
    public String getStarter() {
        return starter;
    }

    public String getMain() {
        return main;
    }
    
    public String getSide() {
        return side;
    }

    public String getDessert() {
        return dessert;
    }

    public double getTotal() {
        return total;
    }
    
    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
    
    public void setStarter(String starter) {
        this.starter = starter;
    }

    public void setMain(String main) {
        this.main = main;
    }
    
    public void setSide(String side) {
        this.side = side;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    
    
            
}
