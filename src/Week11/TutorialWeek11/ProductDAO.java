package Week11.TutorialWeek11;

public class ProductDAO extends DAO<Product> {

    /**
     * @param product
     */
    @Override
    void update(Product product) {
        for (int i = 0; i < this.getList().size(); i++) {
            if (this.getList().get(i).getName().equals( product.getName())) {
                this.getList().set(i, product);
            }
        }
    }

    /**
     * @param id
     * @return
     */
    @Override
    Product find(java.io.Serializable id) {
        for (Product product : this.getList()) {
            if (product.getName() == id) return product;
        }

        return null;
    }
}
