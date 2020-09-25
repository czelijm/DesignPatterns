package designpatterns.behavioral.iterator;

public class IteratorDemo {
    public static void runDemo(){
        System.out.println("-------------------------Iterator demo------------------------------");
        ProductCollection productCollection = new ProductCollection();
        productCollection.add(new Product(1,"a"));
        productCollection.add(new Product(2,"b"));

        Iterator<Product> productIterator = productCollection.CreateIterator();

        while (productIterator.hasNext()){
            System.out.println(productIterator.current().toString());
            productIterator.next();
        }

        ProductCollectionArray productCollectionArray = new ProductCollectionArray();
        productCollectionArray.add(new Product(3,"c"));
        productCollectionArray.add(new Product(4,"d"));

        Iterator<Product> productIteratorArray = productCollectionArray.CreateIterator();

        while (productIteratorArray.hasNext()){
            System.out.println(productIteratorArray.current().toString());
            productIteratorArray.next();
        }


    }
}
