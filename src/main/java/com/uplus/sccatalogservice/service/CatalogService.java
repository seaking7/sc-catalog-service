package com.uplus.sccatalogservice.service;

import com.uplus.sccatalogservice.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
