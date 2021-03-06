package com.ymmihw.libraries.drools;

import static junit.framework.TestCase.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.ymmihw.libraries.drools.model.Product;
import com.ymmihw.libraries.drools.service.ProductService;


public class ProductServiceIntegrationTest {

  private ProductService productService;

  @Before
  public void setup() {
    productService = new ProductService();
  }


  @Test
  public void whenProductTypeElectronic_ThenLabelBarcode() {
    Product product = new Product("Microwave", "Electronic");
    product = productService.applyLabelToProduct(product);
    assertEquals("BarCode", product.getLabel());
  }

  @Test
  public void whenProductTypeBook_ThenLabelIsbn() {
    Product product = new Product("AutoBiography", "Book");
    product = productService.applyLabelToProduct(product);
    assertEquals("ISBN", product.getLabel());
  }
}
