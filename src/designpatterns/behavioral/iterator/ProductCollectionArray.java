package designpatterns.behavioral.iterator;

public class ProductCollectionArray {
  private Product[] products = new Product[10];
  private int index = 0;

  public void add(Product product) {
    products[index++] = product;
  }

  public Iterator<Product> CreateIterator(){
    return new ArrayIterator<Product>(products);
  }

}
