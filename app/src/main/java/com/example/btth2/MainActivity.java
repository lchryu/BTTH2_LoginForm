package com.example.btth2;

//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_test);
//    }
//}
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.btth2.models.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();

        // Thêm các sản phẩm vào danh sách sản phẩm
        productList.add(new Product(1, "Bún đậu mắm tôm", "P001", "HYBrand", "HYModel", "Bún đậu ngon số 1 việt nam", "image1.jpg", "White & black", 9.99));
        productList.add(new Product(2, "Bún chả", "P002", "HNBrand", "HNModel", "Bún chả yêu ai ngoài em", "image2.jpg", "Yellow", 19.99));
        productList.add(new Product(3, "Phở bò", "P003", "VNBrand", "VNModel", "Phở bò Việt Nam", "image3.jpg", "Brown", 12.99));
        productList.add(new Product(4, "Cơm tấm", "P004", "STBrand", "STModel", "Cơm tấm sườn bì chả", "image4.jpg", "White", 8.99));
        productList.add(new Product(5, "Bánh mỳ", "P005", "BMBrand", "BMModel", "Bánh mỳ kẹp thịt", "image5.jpg", "Beige", 5.99));
        productList.add(new Product(6, "Gỏi cuốn", "P006", "GCBrand", "GCModel", "Gỏi cuốn tôm thịt", "image6.jpg", "Green", 7.99));
        productList.add(new Product(7, "Nem cuốn", "P007", "NCBrand", "NCModel", "Nem cuốn tôm thịt", "image7.jpg", "Orange", 6.99));
        productList.add(new Product(8, "Hủ tiếu", "P008", "HTBrand", "HTModel", "Hủ tiếu Nam Vang", "image8.jpg", "Transparent", 10.99));
        productList.add(new Product(9, "Bò kho", "P009", "BKBrand", "BKModel", "Bò kho ngon miễn chê", "image9.jpg", "Red", 14.99));
        productList.add(new Product(10, "Cá kho tộ", "P010", "CKTBrand", "CKTModel", "Cá kho tộ đậm đà", "image10.jpg", "Black", 11.99));


        productAdapter = new ProductAdapter(productList, this);
        recyclerView.setAdapter(productAdapter);
    }
}
