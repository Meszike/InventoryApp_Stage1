package com.example.popey.inventoryapp.data;

import android.provider.BaseColumns;

public final class ProductContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ProductContract() {
    }

    /**
     * Inner class that defines constant values for the products database table.
     * Each entry in the table represents a single product.
     */
    public static final class ProductEntry implements BaseColumns {

        /**
         * Name of database table for products
         */
        public final static String TABLE_NAME = "products";

        ///Column headers
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PRODUCT_NAME = "name";
        public final static String COLUMN_PRODUCT_PRICE = "price";
        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";
        public final static String COLUMN_PRODUCT_SUPPLIER_NAME = "supplier";
        public final static String COLUMN_PRODUCT_SUPPLIER_PHONE = "phone";

        /**
         * Possible values for the supplier of the product.
         */
        public static final int OTHER = 0;
        public static final int OMRON = 1;
        public static final int WELLMED = 2;
        public static final int TEVA = 3;
    }

}