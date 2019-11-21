package com.toshiba.springmvc.service;

import com.toshiba.springmvc.dao.AssetDAO;
import org.springframework.stereotype.Service;

@Service
public class AssetServiceImpl implements AssetService {

    private final AssetDAO assetDAO;

    public AssetServiceImpl(AssetDAO assetDAO) {
        this.assetDAO = assetDAO;
    }
}