package designpatterns.structural.proxy;

public class ProxyProduct implements Product {
    private RealProduct realProduct;
    private DbContext dbContext;

    public ProxyProduct(RealProduct realProduct, DbContext dbContext) {
        this.realProduct = realProduct;
        this.dbContext = dbContext;
    }

    @Override
    public int getId() {
        return realProduct.getId();
    }

    @Override
    public String getName() {
        return realProduct.getName();
    }

    @Override
    public void setName(String name) {
        realProduct.setName(name);
        dbContext.markAsChanged(realProduct);
    }
}
