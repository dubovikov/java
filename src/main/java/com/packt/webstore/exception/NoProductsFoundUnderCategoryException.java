package com.packt.webstore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Julivi on 25.10.2016.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No productfound under this category")
public class NoProductsFoundUnderCategoryException extends RuntimeException {
    private static final long serialVesionUID = 3935230281455340039L;
}
