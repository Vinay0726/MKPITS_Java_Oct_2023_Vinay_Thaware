package com.example.demo.service.impl;
import com.example.demo.dto.ProductDto;
import com.example.demo.dto.Products;
import com.example.demo.service.IProductServices;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices  implements IProductServices {

@Override
    public ProductDto getAllProducts(){
      ProductDto productDto=new ProductDto();
        Products productDto1= new Products();
        productDto1.setId(1);
        productDto1.setName("laptop");
        productDto1.setDescription("High-performance laptop");
        productDto1.setPrice(35000);
        Products productDto2= new Products();
        productDto2.setId(2);
        productDto2.setName("smartphone");
        productDto2.setDescription("Latest model smartphone");
        productDto2.setPrice(15000);
        Products productDto3=new Products();
        productDto3.setId(3);
        productDto3.setName("headphone");
        productDto3.setDescription("Noise-cancelling headphones");
        productDto3.setPrice(3500);
        Products productDto4=new Products();
        productDto4.setId(4);
        productDto4.setName("smartwatch");
        productDto4.setDescription("Feature-packed smartwatch");
        productDto4.setPrice(2500);
        Products productDto5=new Products();
        productDto5.setId(5);
        productDto5.setName("tablet");
        productDto5.setDescription("10-inch display tablet");
        productDto5.setPrice(1000);

        List<Products> productDtolist=new ArrayList<>();
        productDtolist.add(productDto1);
        productDtolist.add(productDto2);
        productDtolist.add(productDto3);
        productDtolist.add(productDto4);
        productDtolist.add(productDto5);

        productDto.setProducts(productDtolist);
        return productDto;
    }
}
